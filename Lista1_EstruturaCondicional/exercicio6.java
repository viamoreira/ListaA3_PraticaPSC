package Lista1_EstruturaCondicional;
/*Construa um programa para determinar se o indivíduo está com um peso favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida como sendo a relação entre o peso (PESO – em kg) e o quadrado da Altura (ALTURA – em m) do indivíduo. Ou seja,IMC= PESO/ALTURA2 e, a situação do peso é determinada pela tabela abaixo: 
 * IMC ABAIXO DE 20 = ABAIXO DO PESO
 * IMC DE 20 ATÉ 25 = PESO NORMAL
 * IMC 25 ATÉ 30 = SOBRE PESO
 * IMC DE 30 ATÉ 40 = OBESO
 * IMC DE 40 OU MAIS = OBESO MÓRBIDO
*/
import java.util.Scanner;

public class exercicio6 {
    public static void main (String[] args) {

//Variáveis 
double peso, altura, imc;

//Entradas do usuário
Scanner teclado = new Scanner (System.in);
System.out.println("Digite o seu peso em kg:");
peso = teclado.nextDouble();
System.out.println("Digite a sua altura em metros: ");
altura = teclado.nextDouble();

//Lógica
imc = peso / Math.pow(altura,2);

    if (imc < 20) {
        System.out.println("Você está ABAIXO DO PESO");
    }
    else if (imc < 25 ) {
        System.out.println("Você está em seu PESO NORMAL");
    }
    else if (imc < 30) {
        System.out.println("Você está SOBRE PESO");
    }
    else if (imc < 40) {
            System.out.println("Você está OBESO");
        }
    else {
        System.out.println("Você está em OBESIDADE MORBIDA");
    }


teclado.close();

    } 
}
