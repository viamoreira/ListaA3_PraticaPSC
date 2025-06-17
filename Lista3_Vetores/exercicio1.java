/*Faça um programa que carregue um vetor com 15 posições, calcule e mostre:
        a. o maior elemento do vetor e em que posição esse elemento se encontra
        b. o menor elemento do vetor e em que posição esse elemento se encontra. */
package Lista3_Vetores;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class exercicio1 {
     public static void main(String[] args) {
    
//Variáveis
int [ ] vetor = new int [15];
Scanner entrada = new Scanner(System.in);
Random random = new Random();

//Lógica
System.out.println("Irei gerar uma lista com 15 números entre 0 e 100.");
for (int i = 0; i < vetor.length; i++) {
    vetor[i] = random.nextInt(101);
    }


//Ordenando
System.out.println("");
System.out.println("Esta é a lista: " + Arrays.toString(vetor)); //Ordem original
System.out.println("");

    //Criando cópia
    int[] copia = Arrays.copyOf(vetor, 15); 

Arrays.sort(vetor); //Coloca em Ordem  crescente

//Descobrindo o maior
 int maior = vetor[14];
 int menor = vetor[0];
        // Procurando o índice do maior na cópia (para saber a posição original)
        int indiceMaior = -1; // Caso não encontre
        for (int i = 0; i < copia.length; i++) {
            if (copia[i] == maior) {
                indiceMaior = i;
                break;
            }
        }
        // Procurando o índice do menor na cópia (para saber a posição original)
        int indiceMenor = -1; // Caso não encontre
        for (int i = 0; i < copia.length; i++) {
            if (copia[i] == menor) {
                indiceMenor = i;
                break;
            }
        }
//Saída

System.out.println("O maior elemento é: "+vetor[14]+" e seu ID é: "+indiceMaior);
System.out.println("O menor elemento é: "+vetor[0]+" e seu ID é: "+indiceMenor);

/*Identificar posição
    int pos = Arrays.binarySearch(vetor, 3);
    System.out.println("Posição do 3: " + pos);*/

entrada.close();

 }  
}
     
    
