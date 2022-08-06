
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gusta
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nomes = 4;
        String [] nome = new String[nomes];
        
        Scanner ler = new Scanner(System.in);
        
        for(int i=0; i < nomes; i++){
            System.out.println("Insira o nome do "+(i+1)+" aluno: ");
            nome[i] = ler.nextLine();
            
        }
        
        for(int i=0; i < nomes; i++){
            System.out.println("As notas inseridass foram: "+nome[i]);
            
        }
    }
    
}
