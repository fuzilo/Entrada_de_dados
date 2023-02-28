/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarios_minimos;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Salarios_minimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada =new Scanner(System.in);
        DecimalFormat dados = new DecimalFormat("#.##");
        double salarioF,salarioM,qtdSAL;
        
        System.out.println("Por favor, digite o valor do salário mínimo:");
        salarioM=entrada.nextDouble();
        System.out.println("Por favor, digite o valor do salário do Funcionário:");
        salarioF=entrada.nextDouble();
        qtdSAL=salarioF/salarioM;
        System.out.println("O funcionário recebe " + dados.format(qtdSAL) + " salários mínimos." );
    }
}
