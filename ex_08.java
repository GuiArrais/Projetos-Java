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
public class ex_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escreva um programa que converte uma quantidade de metros para 
        //centímetros.
        
        Scanner input = new Scanner(System.in);
        float metros, cent, total;
        
        System.out.println("Digite a quantidade de metros: ");
        metros = input.nextFloat();
        
        cent = 100;
        total = metros*cent;
        
        System.out.printf("%.2f metros é igual a %.0f centímetros", metros, total);
        // TODO code application logic here
    }
    
}
