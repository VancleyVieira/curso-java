package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));
        lista.add(new Usuario("Manu")); // Listas aceitam repetições

        System.out.println(lista.get(3)); // na LISTA Conseguimos cessar pelo indice diferente do SET

        System.out.println(">>>>> " + lista.remove(1)); // Removendo pelo indice ele retorna o objeto que foi removido
        System.out.println(lista.remove(new Usuario("Manu"))); // retorna TRUE se foi removido ou FALSE se não foi removido
        
        System.out.println("TEM? " + lista.contains(new Usuario("Lia"))); // contains checa se tem determinado objeto dentro da lista
        System.out.println("TEM? " + lista.contains(u1));

        for (Usuario u: lista) {
            System.out.println(u);
        }
    }
}
