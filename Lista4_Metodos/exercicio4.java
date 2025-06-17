import java.util.Scanner;

// Crie um programa que receba os valores antigo e atual de um produto.
// Chame uma sub-rotina que determine o percentual de acréscimo entre esses valores.
// O resultado deverá ser mostrado no programa principal.

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor antigo: "); double valorAntigo = sc.nextDouble();
        System.out.print("Digite o valor atual: "); double valorAtual = sc.nextDouble();
        double percentual = calcularAumento(valorAntigo, valorAtual);
        System.out.printf("Percentual de acréscimo: %.2f%%", percentual);
    }

    public static double calcularAumento(double antigo, double atual) {
        return ((atual - antigo) / antigo) * 100;
    }
}
