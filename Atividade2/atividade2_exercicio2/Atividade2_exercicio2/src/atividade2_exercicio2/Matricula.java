/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2_exercicio2;
import java.util.*;
/**
 *
 * @author 11798853
 */
public class Matricula {
    public Matricula(Turma turma, String nomeAluno, String nomeCurso) {
    	this.nomeAluno = nomeAluno;
    	this.nomeCurso = nomeCurso;
    	turma.novaMatricula(this);
    }

    private String nomeAluno;
    private String nomeCurso;
    private int numTurma;
    private int idMatricula;

    public String getNomeAluno() {
    	return nomeAluno;
    }
    
    public void setNomeAluno(String pNome) {
    	nomeAluno = pNome;
    }
    
    public String getNomeCurso(){
    	return nomeCurso;
    }
    
    public void setNomeCurso(String pNome) {
    	nomeAluno = pNome;
    }
    
    public int getNumTurma() {
    	return numTurma;
    }
    
    public void setNumTurma(int id) {
    	numTurma = id;
    }
    

    public int getIdMatricula() {
            return idMatricula;
    }


    public void setIdMatricula(int idMatricula) {
            this.idMatricula = idMatricula;
    }
    
}
