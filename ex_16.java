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
public class ex_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Fa�a um programa que receba de entrada a dist�ncia total (em km) 
        //percorrida por um autom�vel e a quantidade de combust�vel (em litros) 
        //consumida para percorr�-la, calcule e imprima o consumo m�dio de 
        //combust�vel. F�rmula: dist�ncia/litro.
        
        Scanner input = new Scanner(System.in);
        double distancia, combustivel, KMporLITRO;
        
        System.out.println("Qual foi a dist�ncia total percorrida (em km) pelo autom�vel?");
        distancia = input.nextDouble();
        
        System.out.println("Quantos litros esse carro gastou para percorrer essa dist�ncia?");
        combustivel = input.nextDouble();
        
        KMporLITRO = distancia / combustivel;
        
        System.out.printf("O consumo m�dio de combust�vel � de: %.2f km por litro \n", KMporLITRO);
        // TODO code application logic here
    }
    
}
