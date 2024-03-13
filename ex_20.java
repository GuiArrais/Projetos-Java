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
        //Escrever um algoritmo que lê: - a porcentagem do IPI a ser acrescido 
        //no valor das peças - o código da peça 1, valor unitário da peça 1, 
        //quantidade de peças 1 - o código da peça 2, valor unitário da peça 2, 
        //quantidade de peças 2. O algoritmo deve calcular o valor total a ser 
        //pago e apresentar o resultado.//

        Scanner input = new Scanner(System.in);
        float IPI1, valorIPI1, precoP1, quantP1, p1Total, IPI2, valorIPI2, precoP2, quantP2, p2Total, soma;
        
        System.out.print("\n Qual o valor da primeira peça? ");
        precoP1 = input.nextFloat();
        
        System.out.print("Quantas peças foram vendidas? ");
        quantP1 = input.nextFloat();
        
        System.out.print("Qual a porcentagem do IPI a ser acrescido no valor da primeira peça? ");
        IPI1 = input.nextFloat();
        valorIPI1 = IPI1 * (precoP1 * quantP1);
        
        System.out.printf("\n Qual o valor da segunda peça? ");
        precoP2 = input.nextFloat();
        
        System.out.print("Quantas peças foram vendidas? ");
        quantP2 = input.nextFloat();
        
        System.out.print("Qual a porcentagem do IPI a ser acrescido no valor da segunda peça? ");
        IPI2 = input.nextFloat();
        valorIPI2 = IPI2 * (precoP2 * quantP2);
        
        p1Total = valorIPI1 + precoP1 * quantP1;
        p2Total = valorIPI2 + precoP2 * quantP2;
        soma = p1Total + p2Total;
        
        System.out.printf("O cliente deverá pagar pelas peças o total de RS%.2f \n", soma);
        // TODO code application logic here
    }
    
}
