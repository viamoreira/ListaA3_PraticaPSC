/*Faça um programa que leia a idade de uma pessoa e informe a sua classe eleitoral:
- não eleitor (abaixo de 16 anos);
- eleitor obrigatório (entre a faixa de 18 e menor de 65 anos);
- eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive) */

package Lista1_EstruturaCondicional;

import java.util.Scanner;

public class exercicio9 {
    public static void main (String[] args) {

//Variáveis
int idade;

//Entradas do usuário
Scanner teclado = new Scanner (System.in);
System.out.println("Digite a sua idade para verificar sua classe eleitoral:");
idade = teclado.nextInt();

//Lógica
    if (idade < 16){
        System.out.println("Não eleitor");
    }
    else if (idade >= 18 && idade < 65 ) {
        System.out.println("Eleitor obrigatório");
    }
    else {
        System.out.println("Eleitor facultativo");
    }

teclado.close();
    }      
}
