// Livia Gonçalves Moreira
// QUESTÃO Nº12
// Sub-rotinas para analisar características de 5 habitantes (sexo, olhos, cabelos, idade)

import java.util.Scanner;

public class Lista_5_questao_12 {
    public static void main(String[] args) {
        char[] sexo = new char[5];
        char[] olhos = new char[5];
        char[] cabelo = new char[5];
        int[] idade = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Sexo (M/F): "); sexo[i] = sc.next().toUpperCase().charAt(0);
            System.out.print("Olhos (A/C): "); olhos[i] = sc.next().toUpperCase().charAt(0);
            System.out.print("Cabelo (L/P/C): "); cabelo[i] = sc.next().toUpperCase().charAt(0);
            System.out.print("Idade: "); idade[i] = sc.nextInt();
        }

        double media = mediaIdadeCastanhoPreto(olhos, cabelo, idade);
        int maior = maiorIdade(idade);
        int qtdMulheres = contarMulheresAzuisLouros(sexo, olhos, cabelo, idade);

        System.out.println("Média de idade (castanho/preto): " + media);
        System.out.println("Maior idade: " + maior);
        System.out.println("Qtd. mulheres 18-35 com olhos azuis e cabelos louros: " + qtdMulheres);
    }

    public static double mediaIdadeCastanhoPreto(char[] olhos, char[] cabelo, int[] idade) {
        int soma = 0, cont = 0;
        for (int i = 0; i < olhos.length; i++) {
            if (olhos[i] == 'C' && cabelo[i] == 'P') {
                soma += idade[i];
                cont++;
            }
        }
        return cont > 0 ? (double) soma / cont : 0;
    }

    public static int maiorIdade(int[] idade) {
        int max = idade[0];
        for (int i : idade) if (i > max) max = i;
        return max;
    }

    public static int contarMulheresAzuisLouros(char[] sexo, char[] olhos, char[] cabelo, int[] idade) {
        int cont = 0;
        for (int i = 0; i < sexo.length; i++) {
            if (sexo[i] == 'F' && olhos[i] == 'A' && cabelo[i] == 'L' && idade[i] >= 18 && idade[i] <= 35) {
                cont++;
            }
        }
        return cont;
    }
}
