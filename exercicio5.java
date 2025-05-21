/*Faça um programa que leia o sexo e a altura (H - em metros) de uma pessoa, calcule e apresente seu peso ideal utilizando as seguintes fórmulas: 
            Peso ideal (homens) = (72,7 * H) – 58. 
            Peso ideal (mulheres) = (62,1 * H) – 44,7 
Sugestão: para identificar o sexo da pessoa, solicite ao usuário que informe 1 para homens, e 2 para mulheres*/

import java.util.Scanner;

public class exercicio5 {
    public static void main (String[] args){

//Variáveis
double genero, altura,  peso_h, peso_m;

//Entradas do usuário
Scanner teclado = new Scanner (System.in);
System.out.println("Digite o seu gênero (PARA MASC DIGITE 1 | PARA FEMIN. DIGITE 2):");
genero = teclado.nextDouble();
System.out.println("Digite a sua altura (em metros): ");
altura = teclado.nextDouble();

//Lógica
        if (genero == 1){  
            peso_h = (72.7 * altura) - 58;
            System.out.println("O seu peso ideal é "+peso_h);
        }
        else if (genero == 2 ){
            peso_m = (62.1 * altura) - 44.7;
            System.out.println("O seu peso ideal é "+peso_m);
        }
        else {
            System.out.println("O número digitado na definição do gênero é INVÁLIDO. Digite novamente.");
        }

teclado.close();

    }
}
