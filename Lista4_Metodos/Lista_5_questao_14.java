// Livia Gonçalves Moreira
// QUESTÃO Nº14
// Sub-rotina que receba uma matriz 5x5 e retorne a soma de seus elementos

public class Lista_5_questao_14 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        int soma = somarMatriz(matriz);
        System.out.println("Soma dos elementos: " + soma);
    }

    public static int somarMatriz(int[][] matriz) {
        int soma = 0;
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                soma += elemento;
            }
        }
        return soma;
    }
}
