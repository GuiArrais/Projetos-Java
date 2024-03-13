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
public class ex_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crie um algoritmo que lê o salário de um funcionário, reajusta o 
        //salário em 7% e mostra o resultado.
        
        Scanner input = new Scanner(System.in);
        double salario, reajuste, total;
        
        System.out.println("Digite quanto você ganha:");
        salario = input.nextDouble();
        
        reajuste = 1.07;
        total = salario * reajuste;
        
        System.out.println("Seu salário atual é de R$" + total);
        
        // TODO code application logic here
    }
    
}
