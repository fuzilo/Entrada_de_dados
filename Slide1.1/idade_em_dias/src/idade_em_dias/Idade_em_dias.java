/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idade_em_dias;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Idade_em_dias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int idade,dias;
        System.out.println("Prezado, digite a sua idade em anos:");
        idade=entrada.nextInt();
        dias=idade*365;
        System.out.println("Você já viveu " + dias + " dias. Aproveite o tempo que lhe resta.");
        
        
    }
    
}
