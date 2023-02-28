/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package media_aritmetica;

import java.util.Scanner;

/**
 *
 * @author dsm-2
 */
public class Media_aritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// TODO code application logic here
    double n1,n2,n3,n4,n5,n6,media1,media2,mediaF;
    String nome;    
    Scanner entrada=new Scanner(System.in);
    
        System.out.println("Aluno, digite o seu nome:");
        nome=entrada.next();
        
        System.out.println("Digite a sua nota N1");
        n1=entrada.nextDouble();
        System.out.println("Digite a sua nota N2");
        n2=entrada.nextDouble();
        System.out.println("Digite a sua nota N3");
        n3=entrada.nextDouble();
        System.out.println("Digite a sua nota N4");
        n4=entrada.nextDouble();   
        System.out.println("Digite a sua nota N5");
        n5=entrada.nextDouble();
        System.out.println("Digite a sua nota N6");
        n6=entrada.nextDouble();
        
        media1=(n1+n2+n3)/3;
        media2=(n4+n5+n6)/3;
        mediaF=(media1+media2)/2;
        System.out.println(nome+ ", a sua média para o primeiro semestre é:"+ media1);
        System.out.println(nome+ ", a sua média para o Segundo semestre é:"+ media2 );
        System.out.println("A sua média final é:" + mediaF);
    }
    
}
