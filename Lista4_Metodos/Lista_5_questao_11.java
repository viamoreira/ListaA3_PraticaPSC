// Livia Gonçalves Moreira
// QUESTÃO Nº11
// Sub-rotina que retorne vetor com os três primeiros números perfeitos

public class Lista_5_questao_11 {
    public static void main(String[] args) {
        int[] perfeitos = encontrarPerfeitos(3);
        System.out.print("Primeiros números perfeitos: ");
        for (int p : perfeitos) {
            System.out.print(p + " ");
        }
    }

    public static int[] encontrarPerfeitos(int quantidade) {
        int[] resultado = new int[quantidade];
        int count = 0, num = 2;
        while (count < quantidade) {
            if (ehPerfeito(num)) {
                resultado[count++] = num;
            }
            num++;
        }
        return resultado;
    }

    public static boolean ehPerfeito(int n) {
        int soma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) soma += i;
        }
        return soma == n;
    }
}
