/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrado_do_primeiro;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Quadrado_do_primeiro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        int A,quadrado;
        System.out.println("Digite qualquer numero inteiro:");
        A=entrada.nextInt();
        quadrado= (int) Math.pow(A,2);
        System.out.println("O quadrado do numero inserido é "+quadrado);
    }
    
}
