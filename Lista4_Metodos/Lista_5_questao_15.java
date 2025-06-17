// Livia Gonçalves Moreira
// QUESTÃO Nº15
// Sub-rotina que recebe pares de inteiros x < y e retorna soma de primos entre eles
// O algoritmo encerra quando x == y

import java.util.Scanner;

public class Lista_5_questao_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Digite x e y (x < y): ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == y) break;
            int soma = somarPrimosEntre(x, y);
            System.out.println("Soma dos primos entre " + x + " e " + y + ": " + soma);
        }
    }

    public static int somarPrimosEntre(int x, int y) {
        int soma = 0;
        for (int i = x; i <= y; i++) {
            if (ehPrimo(i)) soma += i;
        }
        return soma;
    }

    public static boolean ehPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
