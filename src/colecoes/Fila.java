package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> Adicionam elementos na fila
        // Diferença é o comportamento quando a fila está cheia!
        fila.add("Ana"); // retorna null
        fila.offer("Bia"); // Lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> obter o proximo elemento da fila (sem remover)
        // Diferença de comportamento ocorre quando a fila está vazia!
        System.out.println(fila.peek()); // Retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // Lança exceção
        System.out.println(fila.element());

        // Poll e Remove -> obter o proximo elemento da fila (e REMOVE!)

        // Diferença de comportamento ocorre quando a fila está vazia
        System.out.println(fila.poll()); // Retorna null
        System.out.println(fila.remove()); // Lanla exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

//      fila.size(); // saber o tamanho da fila
//      fila.clear(); // limpar a fila
//      fila.isEmpty(); // saber se a fula esta vazia
//      fila.contains(...);
    }
}
