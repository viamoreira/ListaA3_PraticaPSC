/*Faça um programa que leia o um número inteiro entre 1 e 7 e escreva o dia da semana correspondente. Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando que não existe dia da semana com esse número. */

package Lista1_EstruturaCondicional;

import java.util.Scanner;

public class exercicio10 {
    public static void main (String[] args) {

//Variáveis
int numero;

//Entrada do Usuário
Scanner teclado = new Scanner(System.in);
System.out.println("Digite um número de 1 a 7: ");
numero = teclado.nextInt();

    switch (numero) {
        case 1:
            System.out.println("Domingo");
             break;
        case 2:
            System.out.println("Segunda-feira");
            break;
        case 3:
            System.out.println("Terça-feira");
            break;
        case 4:
            System.out.println("Quarta-feira");
            break;
        case 5:
            System.out.println("Quinta-feira");
            break;
        case 6:
            System.out.println("Sexta-feira");
            break;
        case 7:
            System.out.println("Sábado");
            break;
        default:
            System.out.println("Não existe dia da semana com esse número.");
        }

        teclado.close();
    }
}

