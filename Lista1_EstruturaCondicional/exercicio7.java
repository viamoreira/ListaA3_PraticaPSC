package Lista1_EstruturaCondicional;
/*Uma empresa decide dar aumento de 30% aos funcionários com salários inferiores a R$1000,00. Faça um programa que receba o salário do funcionário e mostre o valor do salário reajustado ou uma mensagem, caso o funcionário não tenha direito ao aumento. */

import java.util.Scanner;

public class exercicio7 {
    public static void main (String[] args) {

//Variáveis
double salario, porcentagem, aumento;

//Entradas do usuário
Scanner teclado = new Scanner (System.in);
System.out.println("Digite o salário do funcionário:");
salario = teclado.nextDouble();

//Lógica
    if (salario < 1000) {
        porcentagem = 0.3*salario;
        aumento =  salario + porcentagem;
        System.out.println("Você irá receber o aumento! Seu salário atual será: "+ aumento);
    }
    else {
        System.out.println("Você não está dentro da faixa salarial deseja para receber o aumento. :(");
    }
    

teclado.close();
    } 
}
