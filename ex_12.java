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
public class ex_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escreva um algoritmo para ler um valor e escrever o seu antecessor e 
        //o seu sucessor.
        
        Scanner input = new Scanner(System.in);
        int num, ant, suc;
        
        System.out.print("Digite um número: ");
        num = input.nextInt();
        
        ant = num - 1;
        suc = num + 1;
        
        System.out.printf("\n Antecessor = %d \n Sucessor = %d \n", ant, suc);
        // TODO code application logic here
    }
    
}
