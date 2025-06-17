
// Faça uma programa que leia um vetor de 15 posições de números inteiros
// e divida todos os seus elementos pelo maior valor do vetor. Mostre o vetor após os cálculos.

package Lista3_Vetores;

import java.util.Random;

public class exercicio8 {
    public static void main(String[] args) {
        int[] vetor = new int[15];
        double[] resultado = new double[15];
        Random rand = new Random();

        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100) + 1;
            if (vetor[i] > maior) maior = vetor[i];
        }

        for (int i = 0; i < vetor.length; i++) {
            resultado[i] = (double) vetor[i] / maior;
        }

        System.out.println("Vetor original:");
        for (int n : vetor) System.out.print(n + " ");

        System.out.println("\nVetor dividido pelo maior valor:");
        for (double d : resultado) System.out.printf("%.2f ", d);
    }
}
