
// Leia as notas de 10 alunos, calcule a média, e imprima:
// - A média geral
// - Alunos com nota abaixo da média
// - Alunos com nota acima ou igual à média
package Lista3_Vetores;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        double[] notas = new double[10];
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / 10;
        System.out.println("Média das notas: " + media);

        System.out.println("Notas abaixo da média:");
        for (int i = 0; i < 10; i++) {
            if (notas[i] < media) {
                System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
            }
        }

        System.out.println("Notas acima ou iguais à média:");
        for (int i = 0; i < 10; i++) {
            if (notas[i] >= media) {
                System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
            }
        }
    }
}
