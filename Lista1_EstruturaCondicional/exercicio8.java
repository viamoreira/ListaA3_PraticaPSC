/*Faça um programa que receba a idade de um nadador e mostre a sua categoria.
 * ATÉ 7 ANOS = INFANTIL
 * 08 ATÉ 10 ANOS = JUVENIL
 * 11  ATÉ 15 = ADOLESCENTE
 * 16 ATÉ 30 = ADULTO
 * ACIMA DE 30 =  SENIOR
 */
package Lista1_EstruturaCondicional;

import java.util.Scanner;

public class exercicio8 {
    public static void main (String[] args) {

//Variáveis
int idade;

//Entradas do usuário
Scanner teclado = new Scanner (System.in);
System.out.println("Digite a sua idade:");
idade = teclado.nextInt();

//Lógica

    if (idade < 7){
        System.out.println("Você está na categoria INFANTIL");
    }
    else if (idade <=10){
        System.out.println("Você está na categoria JUVENIL");
    }
    else if (idade <=15) {
        System.out.println("Você está na categoria ADOLESCENTE");
    }
    else if (idade <=30) {
        System.out.println("Você está na categoria ADULTO");
    }
    else {
        System.out.println("Você está na categoria SENIOR");
    }

teclado.close();
    }
}
