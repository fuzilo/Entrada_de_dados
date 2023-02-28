/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quatro_operacoes;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Quatro_operacoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, soma, multiplica, divide,subtrai;
        /*adicionar biblioteca de java  scanner*/
        /*Selecionar na lâmapda, e escolher Java.util.scanner*/
        /*Para poder dar entrada de dados, */
        
        /* Comando Leia inteiros - entrada.nextInt()
                         reais -   entrada.nextDouble()
                                    entrada.nextFloat()
                         caracter  entrada.next()    */
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Primeiro número: ");
        num1 = entrada.nextInt();
        System.out.println("Digite o Segundo número: ");
        num2 = entrada.nextInt();
        soma=num1+num2;
        System.out.println("O valor da soma é: "+soma);
        multiplica = num1*num2;
        divide=num1/num2;
        subtrai=num1-num2;
        System.out.println("O Resultado de multiplicação é: "+ multiplica);
        System.out.println("O Resultado da divisão é: "+ divide);
        System.out.println("O Resultado da subtracao é:"+subtrai);
    }
    
}
