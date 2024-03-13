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
public class ex_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crie um algoritmo que solicite o nome, o endereço e o telefone do 
        //usuário e depois mostre os dados digitados.
        
        Scanner input = new Scanner(System.in);
        String nome, endereco, tel;
        
        System.out.println("Digite seu nome:");
        nome = input.next();
        
        System.out.println("Digite seu endereço:");
        endereco = input.next();
        
        System.out.println("Digite seu telefone:");
        tel = input.next();
        
        System.out.println("Nome: " + nome + "\n Endereço: " + endereco + "\n Telefone: " + tel);
        // TODO code application logic here
    }
    
}
