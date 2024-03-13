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
public class ex_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Desenvolva um programa que calcula a área de um círculo, onde o raio 
        //é fornecido pelo usuário.
        
        Scanner input = new Scanner(System.in);
        double PI, raio, area;
        
        System.out.println("Digite o valor do raio:");
        raio = input.nextDouble();
        
        PI = 3.14159;
        area = PI * (raio*raio);
        
        System.out.printf("A área do círculo = %.2f \n", area);
        // TODO code application logic here
    }
    
}
