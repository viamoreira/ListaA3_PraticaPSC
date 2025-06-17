
// Faça um programa que receba 6 números inteiros e armazene em um vetor e mostre:
// a. Os números pares digitados;
// b. A soma dos números pares digitados;
// c. Os números ímpares digitados;
// d. A quantidade de números ímpares digitados;
package Lista3_Vetores;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        int[] vetor = new int[6];
        Scanner sc = new Scanner(System.in);
        int somaPares = 0, contImpares = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }

        System.out.print("Números pares: ");
        for (int n : vetor) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
                somaPares += n;
            }
        }

        System.out.println("\nSoma dos pares: " + somaPares);

        System.out.print("Números ímpares: ");
        for (int n : vetor) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
                contImpares++;
            }
        }

        System.out.println("\nQuantidade de ímpares: " + contImpares);
        sc.close();
    }
}
