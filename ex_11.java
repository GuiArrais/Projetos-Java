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
public class ex_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crie um programa que calcula a média simples de três notas fornecidas 
        //pelo usuário.
        
        Scanner input = new Scanner(System.in);
        float N1, N2, N3, media;
        
        System.out.print("Digite a primeira nota: ");
        N1 = input.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        N2 = input.nextFloat();
        
        System.out.print("Digite a terceira nota: ");
        N3 = input.nextFloat();
        
        media = (N1 + N2 + N3) / 3;
        
        System.out.printf("A media das notas = %.1f \n", media);
        // TODO code application logic here
    }
    
}
