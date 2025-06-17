
// Faça uma sub-rotina que receba um único valor representando segundos. Essa sub-rotina
// deverá convertê-lo para horas, minutos e segundos. Todas as variáveis devem ser passadas como
// parâmetro, não havendo variáveis globais.

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o total de segundos: "); 
        int segundos = sc.nextInt();
        int[] tempo = new int[3]; // [horas, minutos, segundos]
        converterSegundos(segundos, tempo);
        System.out.println(segundos + " segundos = " + tempo[0] + "h " + tempo[1] + "min " + tempo[2] + "s");
        sc.close();
    }

    public static void converterSegundos(int totalSegundos, int[] tempo) {
        tempo[0] = totalSegundos / 3600;
        totalSegundos %= 3600;
        tempo[1] = totalSegundos / 60;
        tempo[2] = totalSegundos % 60;
    }
}
