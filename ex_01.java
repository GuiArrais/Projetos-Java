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
public class ex_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crie um programa que solicita ao usu�rio dois n�meros e, em seguida, 
        //mostra a soma desses n�meros.

        Scanner input = new Scanner(System.in);
        int n1, n2, soma;
        
        System.out.println("Digite o primeiro n�mero:");
        n1 = input.nextInt();
        
        System.out.println("Digite o segundo n�mero:");
        n2 = input.nextInt();
        
        soma = n1 + n2;
        
        System.out.println("A soma de " + n1 + " + " + n2 + " � igual a: " + soma);
        
        // TODO code application logic here
    }
    
}
