/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reajuste_salario;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Reajuste_salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double percent;
        double salario,salarioN;
        
        System.out.println("Por favor, digite o valor atual do salário:");
        salario=entrada.nextDouble();
        System.out.println("Insira o percentual de reajuste ");
        percent=entrada.nextDouble();
        salarioN=(salario)+(salario*(percent/100));
        System.out.println("O novo salário reajustado terá o valor de R$"+salarioN);
        
    }
    
}
