/*Supondo que a população da República Democrática dos Bruzundangas seja da ordem de 90.000.000 (noventa milhões) de habitantes com uma taxa anual de crescimento de 3% e que a população de um país União Federalista do Milano seja de aproximadamente 200.000.000 (duzentos milhões) de habitantes com uma taxa anual de crescimento de 1,5%. Faça um algoritmo que calcule e escreva o número de anos necessários para que a população dos Bruzundangas alcance ou ultrapasse a população dos Milanos. Suponha que serão mantidas essas taxas de crescimento. */
package Lista2_Repeticao;

public class exercicio11 {
    public static void main(String[] args) {

//Variáveis        
    double populacao_bruzundangas = 90000000; 
    double populacao_milanos = 200000000;    
    double taxa_bruz = 0.03;   
    double taxa_milanos = 0.015; 
    int anos = 0;


//Lógica
    while (populacao_bruzundangas < populacao_milanos) {
           populacao_bruzundangas =populacao_bruzundangas * (1 + taxa_bruz);
            populacao_milanos = populacao_milanos * (1 + taxa_milanos);
            anos++;
        }

System.out.println("Serão necessários " + anos + " anos para que a população dos Bruzundangas alcance ou ultrapasse a dos Milanos.");

    }
}
