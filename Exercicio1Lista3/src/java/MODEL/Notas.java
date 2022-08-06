/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author gusta
 */
public class Notas {
    private double nota1; 
    private double nota2;
    private double nota3;
    private double nota4;
    private String nomeAluno; 
    
    public Notas(){
        
    }

    public Notas(double nota1, double nota2, double nota3, double nota4, String nomeAluno) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nomeAluno = nomeAluno;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    
    public String calcularMedia(){
        double media; 
        String mensagem;
        
        media = (nota1+nota2+nota3+nota4)/4;
        
        if(media >=5 ){
            mensagem = "Você foi APROVADO com média igual a: "+media;
        }
        else{
            mensagem = "Você foi REPROVADO com média igual a: "+media;
        }
        
        return mensagem; 
    }
    
}
