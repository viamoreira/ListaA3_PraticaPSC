/*Dados três valores X,Y,Z, verificar se eles podem ser os comprimentos dos lados de um triângulo. Se eles não formarem um triângulo escrever uma mensagem. Considerar que o comprimento de cada lado de um triângulo é menor que a soma dos outros dois lados. */
package Lista1_EstruturaCondicional;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

//Variáveis
int lado_um, lado_dois, lado_tres,soma_um, soma_dois, soma_tres;

//Entradas do usuário
Scanner teclado = new Scanner (System.in);
System.out.println("Digite o primeiro valor: ");
lado_um = teclado.nextInt();
System.out.println("Digite o segundo valor: ");
lado_dois = teclado.nextInt();
System.out.println("Digite o terceiro valor: ");
lado_tres = teclado.nextInt();

//Lógica
soma_um = lado_um + lado_dois;
soma_dois =  lado_um + lado_tres;
soma_tres = lado_dois + lado_tres;

if (lado_um < soma_tres && lado_dois < soma_dois && lado_tres < soma_um){
    System.out.println("Parabéns! Com esses valores você consegue formar um triângulo!");
}
else{
    System.out.println("Esses valores não formam um triângulo. :/ ");
}


teclado.close();

    }
}
