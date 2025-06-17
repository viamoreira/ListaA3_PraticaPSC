
// Faça um programa que leia um vetor de 15 posições com números inteiros.
// Crie um vetor resultante que contenha todos os números primos do vetor digitado.

package Lista3_Vetores;

import java.util.Random;
import java.util.ArrayList;

public class exercicio7 {
    public static void main(String[] args) {
        int[] vetor = new int[15];
        ArrayList<Integer> primos = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100);
            if (isPrimo(vetor[i])) {
                primos.add(vetor[i]);
            }
        }

        System.out.print("Primos encontrados: ");
        for (int p : primos) System.out.print(p + " ");
    }

    public static boolean isPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
