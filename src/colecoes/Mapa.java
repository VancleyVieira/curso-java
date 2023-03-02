package colecoes;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        // método put( ...,... ) tanto adicionado um novo valor no MAP quanto substitui tambem
        usuarios.put(1, "Roberto");
        usuarios.put(2, "Ricardo");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println("Tamanho do MAP usuarios: " + usuarios.size());
        System.out.println("O MAP usuarios esta vazio?: " + usuarios.isEmpty());

        System.out.println("Chaves do MAP usuarios: " + usuarios.keySet());
        System.out.println("Valores do MAP usuarios: " + usuarios.values());
        System.out.println("Chaves e valores do MAP usuarios: " + usuarios.entrySet());

        System.out.println("O MAP usuarios contem a chave (2)?: " + usuarios.containsKey(2));
        System.out.println("O MAP usuarios contem o valore (Ricardo)?: " + usuarios.containsValue("Ricardo"));

        System.out.println("Valor do MAP na posicao 1: " + usuarios.get(1));
        System.out.println("Remove e mostra o elemento removido da posicao 1: " + usuarios.remove(1));
        // não tem "vancley" no MAP usuarios por isso FALSE
        System.out.println("Revome o elemento se a chave e o valor bater e retorna true ou false: " + usuarios.remove(4, "Vancley"));

        // percorrendo os valores das chaves
        for(int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        // percorrendo os valores
        for (String valor: usuarios.values()) {
            System.out.println(valor);
        }

        // Percorrendo o MAP Buscando as chaves e os valores
        for (Map.Entry<Integer, String> registro: usuarios.entrySet()) {
            System.out.print(registro.getKey() + " - ");
            System.out.println(registro.getValue());
        }
    }
}
