/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto.ex_01;

import java.util.Scanner;

/**
 *
 * @author guiol
 */
public class ex_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crie um algoritmo que l� um valor real em d�lar, e converte o valor 
        //para reais. Considere que a cota��o � US$ 1 = R$ 4,95.
        
        Scanner input = new Scanner(System.in);
        double dolar, real, total;
        
        System.out.println("Digite o pre�o em d�lar: ");
        dolar = input.nextDouble();
        
        real = (4.95);
        total = dolar*real;
        
        System.out.printf("O valor � de: R$%.2f \n", total);
        // TODO code application logic here
    }
    
}
