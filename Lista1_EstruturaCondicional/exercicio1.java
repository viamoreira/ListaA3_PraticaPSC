/*COMANDO
    Faça um programa que receba dois números e mostre o maior e o menor. Emita uma mensagem, caso os dois sejam iguais.*/
package Lista1_EstruturaCondicional;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {

//Variáveis
int numero_um, numero_dois;//Declaração das variáveis numero_um e numero_dois como inteiras.


//Entrada do Usuário
Scanner teclado= new Scanner(System.in); //Criação de um Scanner.
System.out.println("Digite o primeiro número:");//Escrever na tela a mensagem para o usuário.
numero_um = teclado.nextInt();//Armazenar a entrada no usuário na variável numero_um.
System.out.println("Digite o segundo número: ");//Escrever na tela a mensagem para o usuário.
numero_dois = teclado.nextInt();//Armazenar a entrada no usuário na variável numero_dois.

//Lógica
    if (numero_um == numero_dois) {//Condição que verifica se a variável numero_um é igual a da numero_dois.
        System.out.println("Os dois números digitados são iguais");//Escreve na tela a mensagem para o usuário.
        }
    else if  (numero_um > numero_dois) {//Condição que verifica se a variável numero_um é maior que a numero_dois.
        System.out.println("O número "+ numero_um + " é maior que o número "+ numero_dois);//Escreve na tela a mensagem para o usuário.
        }
    else {
        System.out.println("O número "+ numero_dois + " é maior que o número "+ numero_um); //Escreve na tela a mensagem para o usuário.
        }


teclado.close();

    }
}