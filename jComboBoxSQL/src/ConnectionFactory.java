
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gustavo Moretti
 */
public class ConnectionFactory {
        
    //public Statement stm;  //  (java.sql) responsável por preparar e realizar pesquisas no banco de dados
    public PreparedStatement stm;
    public ResultSet rs;   //  (java.sql) responsável por armazenar o resultado de uma pesquisa passada para o statement
        
    //  --  Configurações para acesso ao SQL Server    
    private String host = "192.168.1.2";   //  --- nome do servidor SQL (alias ou IP address)        
    private String bd = "g..._2015";     //  --- nome do banco de dados que deseja conectar
    private String usuario = "g..._user";
    private String senha = "digitar a senha informada pelo professor";
            
    private String caminho =  "jdbc:sqlserver://" + host + ";databaseName=" + bd +
                              ";user=" + usuario + ";password="+senha;
    
    
    public Connection conn; // responsável por realizar a conexão com o banco de dados
    
    public Connection conexao() {     //  método responsável por realizar a conexão com o banco de dados   
        try {   //  tentativa inicial           
            conn = DriverManager.getConnection(caminho, usuario, senha);    //  realiza a conexão com o banco de dados                       
            JOptionPane.showMessageDialog(null, "Conexão com o banco de dados efetuada !"); //  exibe uma caixa de mensagem
        } catch (SQLException ex) { //  excessão (executa se a tentativa inicial não funcionar)
            JOptionPane.showMessageDialog(null, "Erro de conexão com o banco de dados !\nErro: " + ex.getMessage());  //  exibe uma caixa de mensagem
        }
        return null;
    }
    
    public void desconecta() {  //  método para fechar a conexão com o banco de dados
        try {
            conn.close();
            JOptionPane.showMessageDialog(null, "Conexão com o banco de dados foi fechada !");  //  exibe uma caixa de mensagem
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão com o banco de dados !\nErro: " + ex.getMessage());  //  exibe uma caixa de mensagem
        }
    }    
    
    public void executaSQL(String sql) {
        try {
      
            PreparedStatement comando = conn.prepareStatement(sql) ;
            comando.execute(sql);
            
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro executaSQL !\nErro: " + ex.getMessage());  //  exibe uma caixa de mensagem
            ex.printStackTrace();    // exibe o erro na janela de Saída do Netbeans
        }                         
    }
        
    }
                
              
