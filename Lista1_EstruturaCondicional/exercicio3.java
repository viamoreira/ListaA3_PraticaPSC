package Lista1_EstruturaCondicional;
/*COMANDO
Faça um programa que receba 3 notas de um aluno, calcule e mostre uma mensagem de acordo com sua média:
>= 0 e <3 --> Reprovado
>= 3 e <7 --> Exame
>= 7 e <=10 --> Aprovado 
*/

import java.util.Scanner;

public class exercicio3 {
        public static void main(String[] args) {

//Variáveis
float nota_um, nota_dois, nota_tres, media;

//Entradas do usuário
Scanner teclado = new Scanner (System.in);
System.out.println("Digite a primeira nota:");
nota_um = teclado.nextFloat();
System.out.println("Digite a segunda nota:");
nota_dois = teclado.nextFloat();
System.out.println("Digite a terceira nota:");
nota_tres = teclado.nextFloat();

//Lógica
media  = (nota_um + nota_dois + nota_tres)/3;

    if (media < 0 || media > 10 ) {
        System.out.println("ERRO:  A nota digitada é inválida");
        }
    else if (media < 3) {
        System.out.println("Reprovado");
        }
    else if (media < 7) {
        System.out.println("Fazer Exame");
        }
    else {
        System.out.println("Aprovado");
        }

teclado.close();

 }
}
