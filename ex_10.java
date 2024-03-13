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
public class ex_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Faça um programa que converta a temperatura dada em Fahrenheit para 
        //Celsius.  Para testar se a sua resposta está correta saiba que 
        //100ºC = 212F. Considere C/5 = (F-32)/9
        
        Scanner input = new Scanner(System.in);
        float F, C;
        
        System.out.println("Digite o valor da temperatura em Fahrenheit:");
        F = input.nextFloat();
        
        C = ((F-32)/9) * 5;
        
        System.out.printf("O valor da temperatura em graus Celcius = %.2f \n", C);

        // TODO code application logic here
    }
    
}
