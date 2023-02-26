package colecoes;

import java.util.HashSet;
import java.util.Set;

/** @noinspection ALL*/
public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("Tamanho e: " + conjunto.size());

        conjunto.add("Teste");
        conjunto.add('x');
        System.out.println("Tamanho e: " + conjunto.size());

        System.out.println(conjunto.remove("teste")); // false não remove pq nao tem "teste"
        System.out.println(conjunto.remove("Teste")); // true
        System.out.println(conjunto.remove('x')); // true

        System.out.println("Tamanho e: " + conjunto.size());

        System.out.println(conjunto.contains('x')); // false pq 'x' ja foi removido
        System.out.println(conjunto.contains(1)); // true
        System.out.println(conjunto.contains(false)); // false
        System.out.println(conjunto.contains(true)); // true

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        // conjunto.addAll(nums); // addAll = Uniao entre dois conjuntos
        conjunto.retainAll(nums); // retainAll = interceção de um conjunto com outro, retorna o que tem de igual nos dois conjuntos
        System.out.println(conjunto);

        conjunto.clear(); // clear() = remove tudo que estava dentro do conjunto
        System.out.println(conjunto);
    }
}
