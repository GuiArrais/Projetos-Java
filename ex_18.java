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
public class ex_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cada degrau de uma escada tem X de altura. Faça um programa que receba 
        //essa altura e a altura que o usuário deseja alcançar subindo a escada, 
        //calcule e mostre quantos degraus ele deverá subir para atingir seu 
        //objetivo, sem se preocupar com a altura do usuário. Todas as medidas 
        //fornecidas devem estar em metros.
        
        Scanner input = new Scanner(System .in);
        float altDegrau, altTotal, quantDegrau;
        
        System.out.println("Quantos metros tem cada degrau?");
        altDegrau = input.nextFloat();
        
        System.out.println("Qual a altura (em metros) desejada?");
        altTotal = input.nextFloat();
        
        quantDegrau = altTotal / altDegrau;
        
        System.out.printf("Para alcançar a altura desejada, você deverá subir %.0f degraus \n", quantDegrau);
        
        // TODO code application logic here
    }
    
}
