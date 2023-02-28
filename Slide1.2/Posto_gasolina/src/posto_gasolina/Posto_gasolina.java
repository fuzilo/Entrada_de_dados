/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posto_gasolina;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Posto_gasolina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
// TODO code application logic here
            Scanner entrada = new Scanner(System.in);
    double litros,valorF,preco;
    
        System.out.println("Por favor, insira a quantidade de litros comprados: ");
        litros=entrada.nextDouble();
        System.out.println("Por favor, digite o valor unitário da Gasolina");    
        preco=entrada.nextDouble();
        valorF=litros*preco;
        System.out.println("O valor a ser pago será: R$ "+valorF);
    }
    
}
