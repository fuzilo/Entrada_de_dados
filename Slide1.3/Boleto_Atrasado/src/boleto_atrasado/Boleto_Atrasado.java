/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boleto_atrasado;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Boleto_Atrasado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        double valor_atraso, valor, tempo, taxa;
        
        DecimalFormat dados = new DecimalFormat("#.##");
        
        System.out.println("Digite o valor da Prestacao");
        valor=entrada.nextDouble();
        System.out.println("Insira a taxa de juros do banco");
        taxa=entrada.nextDouble();
        System.out.println("Insira a quantidade de meses em atraso");
        tempo=entrada.nextDouble();
        
        valor_atraso=valor+(valor*(taxa/100)*tempo);
        
        System.out.println("O valor da prestação em atraso sera:"+valor_atraso+"Reais");
        
        
    }
    
}
