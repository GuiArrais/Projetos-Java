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
public class ex_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crie um algoritmo que leia a idade de uma pessoa e calcule quantos 
        //dias essa pessoa já viveu.
        
        Scanner input = new Scanner(System.in);
        int idade, dias, total;
        
        System.out.println("Digite quantos anos tem:");
        idade = input.nextInt();
        
        dias = 365;
        total = idade * dias;
        
        System.out.println("Você tem " + total + " dias");

        // TODO code application logic here
    }
    
}
