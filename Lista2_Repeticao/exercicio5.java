/*Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. .Faça um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). Ao ser informado o código do combustível, o seu respectivo nome deve ser impresso na tela. O programa será encerrado quando o código informado for o número 4 escrevendo então a mensagem : "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível. */
package Lista2_Repeticao;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {

    Scanner entrada = new Scanner (System.in);
    int cl_alcool = 0;
    int cl_gasolina = 0;
    int cl_diesel = 0;
    int escolha = 0;

while (escolha != 4){
        System.out.println(" ");
        System.out.println("Digite o combustível escolhido:");
        System.out.println("1.Álcool.");
        System.out.println("2.Gasolina.");
        System.out.println("3.Diesel.");
        System.out.println("4.Fim do programa.");
        System.out.println(" ");
        escolha = entrada.nextInt();

    if (escolha < 1 || escolha > 4){
        System.out.println("Tente novamente!");
        } 
    else if (escolha ==1){
        System.out.println("Você escolheu Álcool");
        cl_alcool++;
        }
    else if (escolha ==2){
        System.out.println("Você escolheu Gasolina");
        cl_gasolina++;
        }
     else if (escolha ==3){
        System.out.println("Você escolheu Diesel");
        cl_diesel++;
        }
    else {
        System.out.println("MUITO OBRIGADO! :D");
        }


    }
    System.out.println(" ");
    System.out.println("Álcool: " + cl_alcool);
    System.out.println("Gasolina: " + cl_gasolina);
    System.out.println("Diesel: " + cl_diesel);

    entrada.close();
    }      
}
