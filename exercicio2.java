/* COMANDO
Faça um programa que receba as duas notas de um aluno, calcule sua média, e que imprima a sua situação: >= 7 -> Aprovado < 7 -> Reprovado*/

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {

//Variáveis
float nota_um, nota_dois, media;

//Entradas do Usuário
Scanner entrada = new Scanner (System.in);
System.out.println("Digite a primeira nota: ");
nota_um = entrada.nextFloat();
System.out.println("Digite a segunda nota: ");
nota_dois = entrada.nextFloat();

//Lógica
media = (nota_um+nota_dois)/2;

if (media >= 7) {
    System.out.println("Aprovado!");
}
else {
    System.out.println("Reprovado!");
}

entrada.close();
    }
}
