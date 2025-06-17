
// Leia 10 números inteiros e armazene em um vetor.
// Em seguida escreva os elementos que são primos e suas respectivas posições no vetor.
package Lista3_Vetores;

import java.util.Random;

public class exercicio9 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Random rand = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100);
        }

        for (int i = 0; i < vetor.length; i++) {
            if (isPrimo(vetor[i])) {
                System.out.println("Número primo: " + vetor[i] + " na posição " + i);
            }
        }
    }

    public static boolean isPrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
