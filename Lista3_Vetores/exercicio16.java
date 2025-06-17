
// Leia 6 números sorteados da Mega Sena e 6 do jogador. Mostre quantos acertos ele teve.
package Lista3_Vetores;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        int[] sorteados = new int[6];
        int[] aposta = new int[6];
        int acertos = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os 6 números sorteados:");
        for (int i = 0; i < 6; i++) {
            sorteados[i] = sc.nextInt();
        }

        System.out.println("Digite os 6 números da aposta:");
        for (int i = 0; i < 6; i++) {
            aposta[i] = sc.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (aposta[i] == sorteados[j]) {
                    acertos++;
                    break;
                }
            }
        }

        System.out.println("Você acertou " + acertos + " número(s).");
        sc.close();
    }
}
