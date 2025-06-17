
// Faça um programa que leia um vetor inteiro de 30 posições e crie um segundo vetor,
// substituindo os valores 0 por 1. Mostre os dois vetores.
package Lista3_Vetores;


import java.util.Random;
import java.util.Arrays;

public class exercicio4 {
    public static void main(String[] args) {
        int[] vetorA = new int[30];
        int[] vetorB = new int[30];
        Random gerador = new Random();

        for (int i = 0; i < 30; i++) {
            vetorA[i] = gerador.nextInt(3) - 1; // -1, 0 ou 1
            vetorB[i] = (vetorA[i] == 0) ? 1 : vetorA[i];
        }

        System.out.println("Vetor A: " + Arrays.toString(vetorA));
        System.out.println("Vetor B: " + Arrays.toString(vetorB));
    }
}
