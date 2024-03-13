/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto.ex_01;

/**
 *
 * @author guiol
 */
public class ex_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escreva um programa que calcule os quadrados e cubos dos números de 
        //0 a 10 e imprima os valores resultantes em formato de tabela como 
        //a seguir:

//Número                       Quadrado                       Cubo

//0                                 0                                      0

//1                                 1                                      1


        int num = 0;
        int numQuad, numCubo;
        
        System.out.println("Numero  Quadrado    Cubo");
        
        while (num<=10) {
        numQuad = num * num;
        numCubo = num * num * num;
            System.out.println(num + "         " + numQuad + "          " + numCubo);
            num++;
        }
        // TODO code application logic here
    }
    
}
