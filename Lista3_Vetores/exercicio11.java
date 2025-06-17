
// Leia os elementos de um vetor de 15 posições. Calcule a média aritmética dos elementos
// e mostre os menores que a média e suas posições.
package Lista3_Vetores;

import java.util.Random;

public class exercicio11 {
    public static void main(String[] args) {
        int[] vetor = new int[15];
        Random rand = new Random();
        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100);
            soma += vetor[i];
        }

        double media = soma / vetor.length;

        boolean encontrou = false;
        System.out.println("Elementos menores que a média (" + media + "):");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.println("Valor: " + vetor[i] + " na posição " + i);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum elemento menor que a média.");
        }
    }
}
