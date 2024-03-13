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
public class ex_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crie um algoritmo que lê dois números, X e Y, e mostra o resto da 
        //divisão entre eles.
        
        Scanner input = new Scanner(System.in);
        float n1, n2, resto;
        System.out.println("Digite o primeiro número:");
        n1 = input.nextFloat();
        
        System.out.println("Digite o segundo número:");
        n2 = input.nextFloat();
        
        resto = n1 % n2;
        
        System.out.println("O resto da divisão é: " + resto);
        System.out.printf("O resto da divisão é %f \n", resto);
        // TODO code application logic here
    }
    
}
