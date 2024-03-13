
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
public class ex_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Construa um programa que calcule as raízes de uma equação de 2º grau 
        //(Ax2+Bx+C). Sendo que os valores A,B e C são fornecidos pelo usuário. 
        //Considere que tem duas raízes.
        
        Scanner input = new Scanner(System.in);
        Double a, b, c, delta, x1, x2;
        
        System.out.println("Ax²+Bx+C");
        System.out.println("Digite um valor para A:");
        a = input.nextDouble();
        
        System.out.println("Digite outro valor para B:");
        b = input.nextDouble();
        
        System.out.println("Digite novamente um valor para C:");
        c = input.nextDouble();
        
        delta = (b*b) - (4*a*c);
        
        x1 = (-b + Math.sqrt(delta))/(2*a);
        x2 = (-b - Math.sqrt(delta))/(2*a);
        
        System.out.printf("O valor de x1= %.0f \n", x1);
        System.out.printf("O valor de x2= %.0f \n", x2);
        
                // TODO code application logic here
    }
    
}
