// Livia Gonçalves Moreira
// QUESTÃO Nº13
// Sub-rotina que receba dois vetores A e B e retorne vetor C com elementos de A e B em ordem decrescente

import java.util.*;

public class Lista_5_questao_13 {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 9, 2, 4, 6, 8, 10};
        int[] B = {11, 13, 12, 15, 14, 20, 18, 16, 19, 17};

        int[] C = unirDecrescente(A, B);
        System.out.print("Vetor C ordenado decrescente: ");
        for (int c : C) {
            System.out.print(c + " ");
        }
    }

    public static int[] unirDecrescente(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];
        System.arraycopy(A, 0, C, 0, A.length);
        System.arraycopy(B, 0, C, A.length, B.length);
        Arrays.sort(C);
        for (int i = 0; i < C.length / 2; i++) {
            int temp = C[i];
            C[i] = C[C.length - 1 - i];
            C[C.length - 1 - i] = temp;
        }
        return C;
    }
}
