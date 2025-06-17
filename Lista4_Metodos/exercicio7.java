
// Sub-rotina que receba hora e minuto de início e término de um jogo
// Deve retornar a duração em minutos, considerando jogos que cruzam a meia-noite

public class exercicio7 {
    public static void main(String[] args) {
        int minutos = calcularDuracao(22, 30, 1, 15);
        System.out.println("Duração do jogo: " + minutos + " minutos");
    }

    public static int calcularDuracao(int h1, int m1, int h2, int m2) {
        int inicio = h1 * 60 + m1;
        int fim = h2 * 60 + m2;
        if (fim < inicio) {
            fim += 24 * 60;
        }
        return fim - inicio;
    }
}
