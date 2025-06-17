
// Sub-rotina que receba dois vetores de 10 elementos inteiros e mostre a união entre eles

import java.util.*;

public class exercicio9 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] B = {5, 6, 7, 11, 12, 13, 14, 15, 16, 17};
        int[] uniao = unirVetores(A, B);
        System.out.println("Vetor união:");
        for (int val : uniao) {
            System.out.print(val + " ");
        }
    }

    public static int[] unirVetores(int[] A, int[] B) {
        Set<Integer> conjunto = new LinkedHashSet<>();
        for (int a : A) conjunto.add(a);
        for (int b : B) conjunto.add(b);
        return conjunto.stream().mapToInt(Integer::intValue).toArray();
    }
}
