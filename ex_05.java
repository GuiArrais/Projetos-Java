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
        //Crie um algoritmo que lê um valor real em dólar, e converte o valor 
        //para reais. Considere que a cotação é US$ 1 = R$ 4,95.
        
        Scanner input = new Scanner(System.in);
        double dolar, real, total;
        
        System.out.println("Digite o preço em dólar: ");
        dolar = input.nextDouble();
        
        real = (4.95);
        total = dolar*real;
        
        System.out.printf("O valor é de: R$%.2f \n", total);
        // TODO code application logic here
    }
    
}
