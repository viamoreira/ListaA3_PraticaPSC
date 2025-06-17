// Livia Gonçalves Moreira
// QUESTÃO Nº10
// Sub-rotina que receba um vetor A com 10 elementos e retorne vetor B com os fatoriais dos elementos de A

public class Lista_5_questao_10 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 3, 2, 6, 4, 3};
        long[] B = new long[10];

        calcularFatoriais(A, B);

        System.out.print("Vetor B (fatoriais): ");
        for (long val : B) {
            System.out.print(val + " ");
        }
    }

    public static void calcularFatoriais(int[] A, long[] B) {
        for (int i = 0; i < A.length; i++) {
            B[i] = fatorial(A[i]);
        }
    }

    public static long fatorial(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
