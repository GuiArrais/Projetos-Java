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
public class ex_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escrever um algoritmo que l�: - a porcentagem do IPI a ser acrescido 
        //no valor das pe�as - o c�digo da pe�a 1, valor unit�rio da pe�a 1, 
        //quantidade de pe�as 1 - o c�digo da pe�a 2, valor unit�rio da pe�a 2, 
        //quantidade de pe�as 2. O algoritmo deve calcular o valor total a ser 
        //pago e apresentar o resultado.//

        Scanner input = new Scanner(System.in);
        float IPI1, valorIPI1, precoP1, quantP1, p1Total, IPI2, valorIPI2, precoP2, quantP2, p2Total, soma;
        
        System.out.print("\n Qual o valor da primeira pe�a? ");
        precoP1 = input.nextFloat();
        
        System.out.print("Quantas pe�as foram vendidas? ");
        quantP1 = input.nextFloat();
        
        System.out.print("Qual a porcentagem do IPI a ser acrescido no valor da primeira pe�a? ");
        IPI1 = input.nextFloat();
        valorIPI1 = IPI1 * (precoP1 * quantP1);
        
        System.out.printf("\n Qual o valor da segunda pe�a? ");
        precoP2 = input.nextFloat();
        
        System.out.print("Quantas pe�as foram vendidas? ");
        quantP2 = input.nextFloat();
        
        System.out.print("Qual a porcentagem do IPI a ser acrescido no valor da segunda pe�a? ");
        IPI2 = input.nextFloat();
        valorIPI2 = IPI2 * (precoP2 * quantP2);
        
        p1Total = valorIPI1 + precoP1 * quantP1;
        p2Total = valorIPI2 + precoP2 * quantP2;
        soma = p1Total + p2Total;
        
        System.out.printf("O cliente dever� pagar pelas pe�as o total de RS%.2f \n", soma);
        // TODO code application logic here
    }
    
}
