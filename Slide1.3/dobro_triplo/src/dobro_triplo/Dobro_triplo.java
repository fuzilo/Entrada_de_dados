/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dobro_triplo;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Dobro_triplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada =new Scanner(System.in);
        int A,B,dobro,triplo;
        System.out.println("Por favor, digite o primeiro numero:");
        A=entrada.nextInt();
        System.out.println("Por favor, digite o segundo numero:");
        B=entrada.nextInt();
        dobro=A*2;
        triplo=B*3;
        System.out.println("O dobro do primeiro numero é: "+dobro);
        System.out.println("O triplo do segundo número é: "+triplo);
        
        
        
        
    }

    
}
