
// Faça um programa que leia um vetor de 50 posições de números inteiros e mostre somente os números positivos.
package Lista3_Vetores;

import java.util.Random;

public class exercicio3 {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        Random gerador = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = gerador.nextInt(101) - 50;
        }

        System.out.println("Números positivos:");
        for (int valor : numeros) {
            if (valor > 0) {
                System.out.print(valor + " ");
            }
        }
    }
}
