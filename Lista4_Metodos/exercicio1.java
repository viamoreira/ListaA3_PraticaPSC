import java.util.Scanner;

// Faça um programa contendo uma sub-rotina que receba três números inteiros a, b e c, sendo a maior que 1.
// A sub-rotina deverá somar todos os inteiros entre b e c que sejam divisíveis por a (inclusive b e c) e retornar
// o resultado para ser impresso.

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 3, b = 1, c = 20;
        int resultado = somarDivisiveis(a, b, c);
        System.out.println("Soma dos números divisíveis por " + a + " entre " + b + " e " + c + ": " + resultado);
    }

    public static int somarDivisiveis(int a, int b, int c) {
        int soma = 0;
        for (int i = b; i <= c; i++) {
            if (i % a == 0) {
                soma += i;
            }
        }
        return soma;
    }
}
