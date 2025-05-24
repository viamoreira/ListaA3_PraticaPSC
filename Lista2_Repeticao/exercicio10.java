/*Faça um programa que solicita ao usuário para pensar um número de 1 até 8. A seguir o programa deve
“adivinhar o número que o usuário pensou, sendo que para isso poderá fazer no máximo três perguntas ao
usuário cuja resposta deve ser sim ou não. */
package Lista2_Repeticao;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
    boolean par = false;
    boolean maior_que_4 = false;
    int resposta = 0;

    Scanner entrada = new Scanner(System.in);
    System.out.println("Seu número é par?");
    System.out.println("1 - Sim");
    System.out.println("0 - Não");
    resposta = entrada.nextInt();

    if (resposta == 1)par = true;

    System.out.println("Seu número é maior que 4?");
    System.out.println("1 - Sim");
    System.out.println("0 - Não");
    resposta = entrada.nextInt();

    if (resposta == 1)maior_que_4 = true;

    if(par == true && maior_que_4 == true){

    System.out.println("Seu número é maior que 7?");
    System.out.println("1 - Sim");
    System.out.println("0 - Não");
    resposta = entrada.nextInt();

    if(resposta == 1) System.out.println("Seu número é: "+8);
    else System.out.println("Seu número é: "+6);

    }
    else if(par == true && maior_que_4 == false){

    System.out.println("Seu número é maior que 3?");
    System.out.println("1 - Sim");
    System.out.println("0 - Não");
    resposta = entrada.nextInt();

    if(resposta == 1) System.out.println("Seu número é: "+4);
    else System.out.println("Seu número é: "+2);

    }
    else if(par == false && maior_que_4 == true){

    System.out.println("Seu número é maior que 6?");
    System.out.println("1 - Sim");
    System.out.println("0 - Não");
    resposta = entrada.nextInt();

    if(resposta == 1) System.out.println("Seu número é:"+7);
    else System.out.println("Seu número é: "+5);

    }
    else if(par == false && maior_que_4 == false){

    System.out.println("Seu número é maior que 2?");
    System.out.println("1 - Sim");
    System.out.println("0 - Não");
    resposta = entrada.nextInt();

    if(resposta == 1) System.out.println("Seu número é: "+3);
    else System.out.println("Seu número é: "+1);

    }
    entrada.close();
    }
    
    
}
