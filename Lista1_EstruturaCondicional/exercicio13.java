package Lista1_EstruturaCondicional;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args) {
    
//Variáveis
double a, b, c, delta, x, raizDelta,x1,x2;

//Entrada do Usuário        
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite o valor de a: ");
    a = teclado.nextDouble();
    System.out.print("Digite o valor de b: ");
    b = teclado.nextDouble();
    System.out.print("Digite o valor de c: ");
    c = teclado.nextDouble();

// Lógica
    delta = b * b - 4 * a * c;
    System.out.println("Delta: " + delta);

    if (delta < 0) {
        System.out.println("Não existe raiz real.");
        } 
    else if (delta == 0) {
        x = -b / (2 * a);
        System.out.println("Existe somente uma raiz real: x = " + x);
        } 
    else {
        raizDelta = Math.sqrt(delta);
        x1 = (-b + raizDelta) / (2 * a);
        x2 = (-b - raizDelta) / (2 * a);
        System.out.println("Existem duas raízes reais:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        }

        teclado.close();
    }
}

