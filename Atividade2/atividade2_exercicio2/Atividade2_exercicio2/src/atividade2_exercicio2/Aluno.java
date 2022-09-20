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
public class Aluno {
    public Aluno(String nome, Curso curso) {
    	Turma turmaMatricula = curso.turmaDisponivel();
    	this.nome = nome;
    	this.matricula = new Matricula(turmaMatricula, nome, curso.getName());
    }

    private String nome;
    private Matricula matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String pNome) {
    	nome = pNome;
    }
    
    public Matricula getMatricula() {
    	return matricula;
    }
}
