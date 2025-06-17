import java.util.Scanner;

// Faça uma sub-rotina que receba como parâmetro um inteiro no intervalo de 1 a 9
// e mostre a seguinte tabela de multiplicação.

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro entre 1 e 9: ");
        int n = sc.nextInt();
        sc.close();

        if (n < 1 || n > 9) {
            System.out.println("Número fora do intervalo permitido!");
            return;
        }

        imprimirPiramide(n);
    }

    // Sub-rotina que imprime a pirâmide
    public static void imprimirPiramide(int n) {
        for (int linha = 1; linha <= n; linha++) {
            for (int col = 1; col <= linha; col++) {
                int valor = linha * col;
                System.out.print(valor);

                // Tabulação entre valores, exceto após o último da linha
                if (col < linha) System.out.print("\t");
            }
            System.out.println(); // quebra de linha depois de cada linha impressa
        }
    }
}

