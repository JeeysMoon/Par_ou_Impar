/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package par_ou_ímpar;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Par_ou_Ímpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        
        Scanner leitor = new Scanner(System.in);
        
        numero = leitor.nextInt();
        
    if (numero % 2 == 0) {
     System.out.println("É par"); 
    } else {
            System.out.println("É ímpar");
        }
   
    }
}