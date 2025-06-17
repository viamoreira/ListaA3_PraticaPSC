
// Um programa que declare um inteiro, inicialize-o com 0, e incremente-o de 1000 em 1000,
// imprimindo seu valor na tela, até que seu valor seja 100000 (cem mil).
package Lista3_Vetores;

public class exercicio2 {
    public static void main(String[] args) {
        int numero = 0;

        while (numero <= 100000) {
            System.out.println(numero);
            numero += 1000;
        }
    }
}
