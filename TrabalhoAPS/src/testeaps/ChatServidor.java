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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.awt.windows.ThemeReader;

/**
 *
 * @author Gustavo Moretti
 */
public class ChatServidor {
    
    //varias mensagens chegando com varios escritores escrevendo no servidor
    List<PrintWriter> escritores = new ArrayList<>();
            
    public void encaminharMensagem(String texto){
            for(PrintWriter w : escritores){
                w.println(texto);
                w.flush();
            }
    }
            
    public ChatServidor(){
        ServerSocket server;        
        try {
            server = new ServerSocket(5000);
            while (true) {            
            Socket socket = server.accept();
            new Thread(new EscutaCliente(socket)).start();
            PrintWriter p =  new PrintWriter(socket.getOutputStream());
            escritores.add(p);
        }
            
        } catch (Exception e) {
        }
    }
    
    private class EscutaCliente implements Runnable{
        Scanner leitor;       
        public EscutaCliente(Socket socket){
            try {
            leitor = new Scanner(socket.getInputStream());
            } catch (Exception e) {}
        }
        @Override
        public void run() {
            try {
                String text;
                while ((text = leitor.nextLine()) != null) {                
                    System.out.println("> "+text);
                    encaminharMensagem(text);
                }
            } catch (Exception e) {
            }
        }
        }

    public static void main(String[] args) {
        new ChatServidor();
    }
}
        
    