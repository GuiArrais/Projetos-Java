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
        //Faça um programa que receba de entrada a distância total (em km) 
        //percorrida por um automóvel e a quantidade de combustível (em litros) 
        //consumida para percorrê-la, calcule e imprima o consumo médio de 
        //combustível. Fórmula: distância/litro.
        
        Scanner input = new Scanner(System.in);
        double distancia, combustivel, KMporLITRO;
        
        System.out.println("Qual foi a distância total percorrida (em km) pelo automóvel?");
        distancia = input.nextDouble();
        
        System.out.println("Quantos litros esse carro gastou para percorrer essa distância?");
        combustivel = input.nextDouble();
        
        KMporLITRO = distancia / combustivel;
        
        System.out.printf("O consumo médio de combustível é de: %.2f km por litro \n", KMporLITRO);
        // TODO code application logic here
    }
    
}
