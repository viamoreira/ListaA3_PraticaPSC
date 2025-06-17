
// Elabore um programa com uma sub-rotina que receba 3 notas e uma letra ('A' ou 'P')
// 'A' calcula média aritmética e 'P' média ponderada (pesos 5, 3, 2)

public class exercicio6 {
    public static void main(String[] args) {
        double m = calcularMedia(7, 8, 9, 'P');
        System.out.printf("Média calculada: %.2f", m);
    }

    public static double calcularMedia(double n1, double n2, double n3, char tipo) {
        if (tipo == 'A') {
            return (n1 + n2 + n3) / 3;
        } else if (tipo == 'P') {
            return (n1 * 5 + n2 * 3 + n3 * 2) / 10;
        } else {
            return -1; // tipo inválido
        }
    }
}
