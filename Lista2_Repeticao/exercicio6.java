/*Faça um programa que solicita ao usuário uma quantidade indeterminada de números inteiros.
O programa deve calcular e escrever a média aritmética apenas dos números pares.
A entrada de dados deve ser encerrada quando o número ZERO for digitado. */
package Lista2_Repeticao;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

    Scanner entrada = new Scanner (System.in);

    int contadornum = 0;
    int escolha = 1;
    int somanum = 0;

    while (escolha != 0) {

        System.out.println(" ");
        System.out.println("Digite o número escolhido ou digite 0 para encerrar: ");
        System.out.println(" ");
        escolha = entrada.nextInt();
        if (escolha == 0) break;

        if(escolha%2 == 0){
            System.out.println(" ");
            System.out.println("#######Número par, foi considerado");
            somanum = somanum + escolha;
            contadornum++;
        }
        else{ 
            System.out.println(" ");
            System.out.println("########Número ímpar, não foi considerado");
        }
    }

    int media = somanum/contadornum;
        System.out.println(" ");
        System.out.println("Média:"+media);


    entrada.close();
    }
}
