/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTIL;

/**
 *
 * @author gusta
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int vetor[] = new int[3];
        vetor[0] = 5;
        vetor[1] = 4;
        vetor[2] = 6;
        int i,j;
  
  
    for(i= 0; i<3; i++){
    
    vetor[i] = (vetor[i]+vetor[i]+3)*(vetor[i]-2);

    }
    
    for(i=0; i<3; i++){
        System.out.println(vetor[i]);
    }
    
        System.out.println("FIM: ");
    }
    
}
