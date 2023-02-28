/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retangulo_area_perim;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Retangulo_area_perim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        double A,B,area,perimetro;
        
        System.out.println("Por favor, insira a largura do retângulo em metros:");
        A=entrada.nextDouble();
        System.out.println("Por favor, insira o comprimento do restângulo em metros:");
        B=entrada.nextDouble();
        area=A*B;
        perimetro=2*A+2*B;
        System.out.println("A área do retângulo é de "+area+ " metros quadrados." );
        System.out.println("O perímetro do Retângulo é de " +perimetro+ "metros");
        
    }
    
}
