
// Faça um programa que leia um vetor de dez posições. Em seguida, compacte o vetor,
// retirando os valores nulos e negativos. Coloque o resultado no vetor B, mostrando o vetor resultante.

package Lista3_Vetores;

import java.util.Random;
import java.util.ArrayList;

public class exercicio5 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        ArrayList<Integer> vetorB = new ArrayList<>();
        Random gerador = new Random();

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = gerador.nextInt(41) - 20; // -20 a 20
            if (vetorA[i] > 0) {
                vetorB.add(vetorA[i]);
            }
        }

        System.out.print("Vetor original: ");
        for (int n : vetorA) System.out.print(n + " ");

        System.out.print("\nVetor compactado (sem negativos ou zeros): ");
        for (int n : vetorB) System.out.print(n + " ");
    }
}
