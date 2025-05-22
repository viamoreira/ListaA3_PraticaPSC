package Lista1_EstruturaCondicional;

import java.util.Scanner;

public class exercicio12 {
     public static void main(String[] args) {

//Variáveis
    double numero1, numero2, resultado;
    int opcao;

//Entrada do usuário
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite o primeiro número: ");
    numero1 = teclado.nextDouble();
    System.out.print("Digite o segundo número: ");
    numero2 = teclado.nextDouble();

//Exibição do menu
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Sair");
        System.out.print("Opção: ");
        opcao = teclado.nextInt();

// Lógica
        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;
            case 5:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida.");
        }

        teclado.close();
    }
}
