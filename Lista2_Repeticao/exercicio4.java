/*Desafio: Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Este tempo é chamado na físico-química de MEIA-VIDA. Dada a massa inicial, em gramas, faça um algoritmo que determine o tempo necessário para que essa massa se torne menor que 0.5 gramas. Ao final do algoritmo escreva a massa inicial e o tempo calculado em horas, minutos e segundos. */
package Lista2_Repeticao;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

//Variáveis
double massa;
int contador = 0;
int totalSeg, horas, minutos,segundos;


//Entradas
Scanner entrada = new Scanner (System.in);
System.out.println("Digite a massa do elemento: ");
massa = entrada.nextDouble();

//Lógica
double massa_inicial = massa;

    while (massa >= 0.5) {
        massa = massa/2;
        contador++;
        }

    System.out.println(contador);

    totalSeg = contador*50;
    horas = totalSeg / 3600;
    minutos = (totalSeg % 3600) / 60;
    segundos = totalSeg % 60;


    System.out.println("A massa inicial é "+massa_inicial+". A massa final é "+massa+". O tempo gasto foi de: "+horas+"h,"+minutos+"m,"+segundos+"s.");

    
entrada.close();
    }
}
