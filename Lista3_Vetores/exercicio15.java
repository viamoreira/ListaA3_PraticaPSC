
// Leia um vetor com 10 elementos e substitua valores negativos por 0.
package Lista3_Vetores;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os 10 valores:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
            if (vetor[i] < 0) vetor[i] = 0;
        }

        System.out.println("Vetor atualizado:");
        for (int n : vetor) System.out.print(n + " ");
    }
}
