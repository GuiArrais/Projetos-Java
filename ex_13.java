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
public class ex_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escreva um programa que calcula o sal�rio l�quido de um funcion�rio. 
        //O programa deve solicitar o valor da hora de trabalho, o n�mero de 
        //horas trabalhadas no m�s e o percentual de desconto do INSS.
        
        Scanner input = new Scanner(System.in);
        double valorHoras, quantHoras, INSS, salLiq, salBruto;
        
        System.out.println("Digite quanto um funcion�rio ganha por hora:");
        valorHoras = input.nextDouble();
        
        System.out.println("Digite quantas horas o funcion�rio trabalhou no m�s:");
        quantHoras = input.nextDouble();
        
        salBruto = valorHoras * quantHoras;
        System.out.printf("Sal�rio bruto: R$%.2f \n", salBruto);
        
        INSS = (valorHoras * quantHoras) * 0.08;
        System.out.printf("Desconto INSS: R$%.2f \n", INSS);
        
        salLiq = salBruto - INSS;
        
        System.out.printf("O valor do salario l�quido � = R$%.2f \n", salLiq);
        // TODO code application logic here
    }
    
}
