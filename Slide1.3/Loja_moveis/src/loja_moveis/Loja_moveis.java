/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja_moveis;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Loja_moveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        double salario,bonus,salarioF,moveis;
        
        System.out.println("Por favor, insira a quantidade de moveis vendidos:");
        moveis=entrada.nextDouble();
        salario=1000;
        bonus=50;
        salarioF=1000+(bonus*moveis);
        System.out.println("O salário final do funcionario sera de: "+salarioF+ "Reais");
                
        
        
        // TODO code application logic here
    }
}
