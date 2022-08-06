/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeaps;

import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Gustavo Moretti
 */
public class EscutaCliente implements Runnable{
    Scanner leitor;
    
    @Override
    public void run() {
            try {
                String text;
                while ((text = leitor.nextLine()) != null) {                
                    System.out.println("> : "+text);
                }
            } catch (Exception e) {
            }
    }
    
    public void EscutaCliente(Socket socket){
         try {
            leitor = new Scanner(socket.getInputStream());
            } catch (Exception e) {  
            }
    }
}
