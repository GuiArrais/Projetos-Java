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
public class ex_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Desenvolva um programa que, dados dois valores A e B, troque os 
        //valores de forma que A passe a ter o valor de B e vice-versa. 
        //Exiba os valores após a troca.
        Scanner input = new Scanner(System.in);
        int A, B;
        
        System.out.println("Digite o valor de 'A': ");
        A = input.nextInt();
        
        System.out.println("Digite o valor de 'B': ");
        B = input.nextInt();
        
        System.out.println("Invertendo...");
        
        System.out.println("A = " + B);
        System.out.println("B = " + A);
        // TODO code application logic here
    }
    
}
