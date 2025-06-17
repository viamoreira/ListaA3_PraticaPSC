import java.util.Scanner;

// Faça um programa contendo uma sub-rotina que receba dois números positivos por parâmetro
// e retorne a soma dos N números inteiros existentes entre eles.

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5, b = 10;
        int resultado = somarEntre(a, b);
        System.out.println("Soma entre " + a + " e " + b + ": " + resultado);
    }

    public static int somarEntre(int a, int b) {
        int menor = Math.min(a, b);
        int maior = Math.max(a, b);
        int soma = 0;
        for (int i = menor + 1; i < maior; i++) {
            soma += i;
        }
        return soma;
    }
}
