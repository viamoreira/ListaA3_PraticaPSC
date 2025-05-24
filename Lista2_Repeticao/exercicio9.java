/*Faça um programa que leia um número N e imprima os valores entre 2 e N que são divisores de N. */
package Lista2_Repeticao;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite um número N: ");
    int N = entrada.nextInt();
    boolean tem_divisor = false;

    System.out.println("");
    System.out.println("Divisores de " + N + " entre 2 e " + N + ":");

    for (int i = 3; i < N; i++) {
        if (N % i == 0) {
            System.out.println(i);
            System.out.println("");
            tem_divisor = true;
        }
        
    }


    if (!tem_divisor) {    
        System.out.println("Nenhum divisor encontrado.");
        System.out.println("");
    }

        entrada.close();
    }
}

