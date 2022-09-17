/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade2_exercicio2;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author 11798853
 */
public class Turma {
    public Turma(Curso curso) {
    this.cursoNome = curso.getName();
    numAluno = 0;
    }
    
    private String cursoNome;
    private int id; 
    private int numAluno; //0 a 10 alunos
    private List<Matricula> matriculas = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
    	this.id = id;
    }

    public Matricula getMatricula(int id) {
    	return matriculas.get(id);
    }
    
    public void novaMatricula(Matricula matricula) {
	    if (numAluno < 10) {
    		matricula.setIdMatricula(numAluno);
    		matricula.setNumTurma(id);
	    	matriculas.add(matricula);
	    	numAluno = matriculas.size();
	    } else {
	    	System.out.println("Turma lotada");
	    }
    }

    public String getCursoNome() {
            return cursoNome;
    }

    public int getNumAluno() {
            return numAluno;
    }

    public void mostraAlunos() {
            for (Matricula matricula : matriculas) {
                    System.out.println("Aluno(a): " + matricula.getNomeAluno());
            }
    }

    public List<Matricula> getMatriculas(){
            return matriculas;
    }
}
