
// Leia um vetor com 10 inteiros, solicite um número e verifique se está presente no vetor.
package Lista3_Vetores;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner sc = new Scanner(System.in);
        boolean encontrado = false;

        System.out.println("Digite os 10 números:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextInt();
        }

        System.out.print("Digite um número para buscar: ");
        int numero = sc.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("Número encontrado na posição: " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Número não encontrado no vetor.");
        }
    }
}
