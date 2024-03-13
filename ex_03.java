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
public class ex_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crie um algoritmo que leia o primeiro nome do usuário e escreva uma 
        //saudação para ele.
        
        Scanner input = new Scanner(System.in);
        String nome;
        
        System.out.println("Digite seu nome:");
        nome = input.next();
        
        System.out.println("Olá " + nome);
        System.out.printf("Olá %s \n", nome);
        // TODO code application logic here
    }
    
}
