/*Dado um número N inteiro qualquer digitado pelo usuário, verificar se ele é ou não primo. */
package Lista2_Repeticao;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = entrada.nextInt();

        boolean primo = true;  // assume que é primo, até provar o contrário

        if (n <= 1) {
            primo = false;  // números <= 1 não são primos
        } else {
            int i = 2;
            while (i <= n / 2) {  // basta verificar até n/2
                if (n % i == 0) {
                    primo = false;
                    break;  // já achou um divisor, pode parar
                }
                i++;
            }
        }

        if (primo) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " NÃO é um número primo.");
        }

        entrada.close();
    }
}

