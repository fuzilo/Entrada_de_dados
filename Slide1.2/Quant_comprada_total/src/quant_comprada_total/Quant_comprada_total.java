/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quant_comprada_total;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Quant_comprada_total {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int qtdComprada;
        double valorUnit1,valorTotal;
        String nomeProduto1;
        // TODO code application logic here
        System.out.println("Por favor, informe o nome do produto:");
        nomeProduto1=entrada.next();
        System.out.println("Por favor, insira a quantidade comprada:");
        qtdComprada=entrada.nextInt();
        System.out.println("Digite o valor unitário do produto em reais:");
        valorUnit1=entrada.nextDouble();
        valorTotal=qtdComprada*valorUnit1;
        System.out.println("Total da compra de "+qtdComprada+ " "+nomeProduto1+ " é R$ "+valorTotal );
        
        
    }
    
}
