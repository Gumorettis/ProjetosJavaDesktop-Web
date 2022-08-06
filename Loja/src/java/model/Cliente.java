
package model;


public class Cliente {
    //1º item a fazer (sempre)  -->  definição de atributos
    private Integer id; //Classe Integer
    private String nome; //Classe String
    private String email;

    //Inserir Contrutores vazios (os construtores são métodos
    public Cliente() {
    }

    //Inserindo Construtores chegios (os construtores são métodos.
    public Cliente(Integer id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
    
    // Métodos Get e Set para recuperação de váriáveis.

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //MÉTODO PARA MOSTRAR OS DADOS QUE FORAM PASSADOS PARA OS ATRIBUTOS DA CLASSE
    public String mostrar(){
        
    return " O nome é: " + this.nome + " e o mail é " + this.email;
    
    }
    
    //método exemplo de calculo
    public Integer soma(){
        Integer x = 2;
        Integer y = 4;
        return x+y;
    }
    
    
       
}
