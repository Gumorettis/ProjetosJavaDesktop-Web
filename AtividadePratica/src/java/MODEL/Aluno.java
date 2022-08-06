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
public class Aluno {
    
    private String nomeAluno;
    private int semestre; 
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;
    private int mediaFinal;
    
    public Aluno(){
        
    }

    public Aluno(String nomeAluno, int semestre, int nota1, int nota2, int nota3, int nota4, int mediaFinal) {
        this.nomeAluno = nomeAluno;
        this.semestre = semestre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.mediaFinal = mediaFinal;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    public int getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(int mediaFinal) {
        this.mediaFinal = mediaFinal;
    }
    
    
}
