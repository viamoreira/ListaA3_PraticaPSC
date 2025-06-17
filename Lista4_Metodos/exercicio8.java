import java.util.Scanner;

// Sub-rotina que receba um número inteiro positivo N e retorne S, com a fórmula:
// S = 1 + 1/2 + 1/3 + ... + 1/N

public class exercicio8 {
 public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Solicita ao usuário o valor de N
            System.out.print("Digite um número inteiro positivo: ");
            int n = sc.nextInt();

            // Validação de entrada
            if (n < 0) {
                System.out.println("Número inválido. Deve ser zero ou positivo.");
                return;
            }

            // Chama a sub-rotina para calcular a série com fatoriais
            double resultado = calcularSerieComFatorial(n);

            // Exibe o resultado da série
            System.out.printf("S = %.6f\n", resultado);
        }
    }

    // Sub-rotina que calcula a série S = 1 + 1/1! + 1/2! + ... + 1/N!
    public static double calcularSerieComFatorial(int n) {
        double s = 1.0; // inicia com o termo 1 (equivalente a 1/0!)
        long fatorial = 1;

        for (int i = 1; i <= n; i++) {
            fatorial *= i;        // calcula i!
            s += 1.0 / fatorial;  // adiciona 1/i! à soma
        }

        return s;
    }
}