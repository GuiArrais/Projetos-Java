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
        //Escreva um programa que calcula o salário líquido de um funcionário. 
        //O programa deve solicitar o valor da hora de trabalho, o número de 
        //horas trabalhadas no mês e o percentual de desconto do INSS.
        
        Scanner input = new Scanner(System.in);
        double valorHoras, quantHoras, INSS, salLiq, salBruto;
        
        System.out.println("Digite quanto um funcionário ganha por hora:");
        valorHoras = input.nextDouble();
        
        System.out.println("Digite quantas horas o funcionário trabalhou no mês:");
        quantHoras = input.nextDouble();
        
        salBruto = valorHoras * quantHoras;
        System.out.printf("Salário bruto: R$%.2f \n", salBruto);
        
        INSS = (valorHoras * quantHoras) * 0.08;
        System.out.printf("Desconto INSS: R$%.2f \n", INSS);
        
        salLiq = salBruto - INSS;
        
        System.out.printf("O valor do salario líquido é = R$%.2f \n", salLiq);
        // TODO code application logic here
    }
    
}
