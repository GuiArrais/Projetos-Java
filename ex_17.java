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
public class ex_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Faça um programa para o seguinte problema: Compraram-se N canetas 
        //iguais, que foram pagas com uma nota de Z reais, obtendo-se Y reais 
        //como troco. Quanto custou cada caneta?
        
        Scanner input = new Scanner(System.in);
        float canetas, nota, troco, preco;
        
        System.out.println("Quantas canetas foram compradas?");
        canetas = input.nextFloat();
        
        System.out.println("Qual o valor da nota usada para pagar?");
        nota = input.nextFloat();
        
        System.out.println("De quanto foi o troco?");
        troco = input.nextFloat();
        
        preco = (nota-troco) / canetas;
        
        System.out.printf("Cada caneta custa: R$%.2f \n", preco);
        // TODO code application logic here
    }
    
}
