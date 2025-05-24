/*Para a realização de uma pesquisa entre os habitantes de uma região, faça um algoritmo que receba os dados da população correspondentes à idade, sexo (M/F/I) e salário. Faça um programa que calcule e mostre:
a. A média dos salários do grupo;
b. A maior e a menor idade do grupo;
c. A quantidade de mulheres na região;
d. A idade e o sexo da pessoa que possui o menor salário;
Finalize o programa quando for digitado uma idade negativa. */
package Lista2_Repeticao;

import java.util.Scanner;

public class exercicio12 {
     public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int idade;
        char sexo;
        double salario;
        int contador = 0;
        double somaSalarios = 0;
        int maiorIdade = 0;
        int menorIdade = 0;
        int quantidadeMulheres = 0;
        double menorSalario = 0;
        int idadeMenorSalario = 0;
        char sexoMenorSalario = ' ';

        boolean primeiroRegistro = true;

        while (true) {
            System.out.print("Digite a idade (ou negativa para encerrar): ");
            idade = teclado.nextInt();

            if (idade < 0) {
                break; // Finaliza o programa
            }

            System.out.print("Digite o sexo (M/F/I): ");
            sexo = teclado.next().toUpperCase().charAt(0);

            System.out.print("Digite o salário: ");
            salario = teclado.nextDouble();

            // Para o primeiro registro, inicializa as variáveis
            if (primeiroRegistro) {
                maiorIdade = idade;
                menorIdade = idade;
                menorSalario = salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
                primeiroRegistro = false;
            }

            //Somar salários
                somaSalarios += salario;
                contador++;

            //Maior e menor idade
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (idade < menorIdade) {
                menorIdade = idade;
            }

            // c) Contar mulheres
            if (sexo == 'F') {
                quantidadeMulheres++;
            }

            // d) Menor salário
            if (salario < menorSalario) {
                menorSalario = salario;
                idadeMenorSalario = idade;
                sexoMenorSalario = sexo;
            }
        }

        if (contador > 0) {
            System.out.println("\nResultados da pesquisa:");
            System.out.println("a) Média dos salários: " + (somaSalarios / contador));
            System.out.println("b) Maior idade: " + maiorIdade);
            System.out.println("b) Menor idade: " + menorIdade);
            System.out.println("c) Quantidade de mulheres: " + quantidadeMulheres);
            System.out.println("d) Pessoa com menor salário: idade " + idadeMenorSalario + ", sexo " + sexoMenorSalario + ", salário " + menorSalario);
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }

        teclado.close();
    }

}
