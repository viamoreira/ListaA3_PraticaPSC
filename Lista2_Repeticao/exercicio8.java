/*Implemente um algoritmo que leia um número e realize a soma dos números entre zero e o número lido. OBS:: utilize um acumulador para a soma e o contador para a quantidade de repetições do comando. */
package Lista2_Repeticao;

import java.util.Scanner;

public class exercicio8 {
 public static void main(String[] args) {

int soma = 0;
int contador = 0;    
int numero_limite;

Scanner entrada = new Scanner (System.in);
System.out.print("Digite um número inteiro: ");
numero_limite = entrada.nextInt();

    for (int i = 1;i < numero_limite; i++){
        contador++;
        soma = soma + i;
    }

System.out.println(contador);
System.out.println(soma);




entrada.close();
 }
}
