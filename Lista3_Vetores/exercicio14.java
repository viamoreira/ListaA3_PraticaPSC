
// Leia dois vetores com 10 elementos. Gere vetores com multiplicações e divisões dos valores de mesmo índice.
package Lista3_Vetores;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        int[] multiplicacao = new int[10];
        double[] divisao = new double[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < 10; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < 10; i++) {
            B[i] = sc.nextInt();
            multiplicacao[i] = A[i] * B[i];
            divisao[i] = (B[i] != 0) ? (double) A[i] / B[i] : 0;
        }

        System.out.print("Multiplicação: ");
        for (int n : multiplicacao) System.out.print(n + " ");
        System.out.print("\nDivisão: ");
        for (double d : divisao) System.out.printf("%.2f ", d);
        sc.close();
    }
}
