
// Faça um programa que leia dois vetores (A e B) de cinco posições de números inteiros.
// O programa deve subtrair o primeiro elemento de A do último de B, acumulando o valor,
// o segundo de A do penúltimo de B, e assim por diante. Mostre o resultado em um terceiro vetor.
package Lista3_Vetores;

import java.util.Random;
import java.util.Arrays;

public class exercicio6 {
    public static void main(String[] args) {
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            A[i] = rand.nextInt(20);
            B[i] = rand.nextInt(20);
            C[i] = B[4 - i] - A[i];
        }

        System.out.println("Vetor A: " + Arrays.toString(A));
        System.out.println("Vetor B: " + Arrays.toString(B));
        System.out.println("Vetor C (resultado): " + Arrays.toString(C));
    }
}
