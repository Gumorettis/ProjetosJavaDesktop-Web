/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeaps;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
/**
 *
 * @author Gustavo Moretti
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        ServerSocket servidor = new ServerSocket(5000);
        
        while (true) {            
           Socket socket =  servidor.accept();
           try(PrintWriter w = new PrintWriter(socket.getOutputStream())){
            w.println("Porta 5000 aberta!");
           }
        }
        //System.out.println("Porta 12345 aberta! ");
        
       // Socket cliente = servidor.accept();
        
       // System.out.println("Conexão feita com o cliente: "+cliente.getInetAddress().getHostAddress());
        
       // Scanner s = new Scanner(cliente.getInputStream());
        
       // while (s.hasNextLine()) {            
         //   System.out.println(s.nextLine());
       // }
        
       // s.close();
        //servidor.close();
       // cliente.close();
        
    }
    
}
