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
public class Curso {
    public Curso(String nome) {
    	this.nome = nome;
    	setQtdTurmas(0);
    }

    private String nome;
    private int qtdTurmas; //pode ter varias turmas
    private List<Turma> turmas = new ArrayList<>();

    public String getName() {
        return nome;
    }

    public void setName(String pNome ) {
    	this.nome = pNome;
    }

    public Turma getTurma(int id) {
    	return turmas.get(id);
    }
    
    public void novaTurma(Turma turma) {
    	turma.setId(qtdTurmas);
    	turmas.add(turma);
    	setQtdTurmas(turmas.size());
    }

    public int getQtdTurmas() {
            return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
            this.qtdTurmas = qtdTurmas;
    }

    public Turma turmaDisponivel() {
            if(qtdTurmas != 0 && turmas.get(qtdTurmas - 1).getNumAluno() < 10) {
                    return turmas.get(qtdTurmas - 1);
            } else {
                    Turma novaTurma = new Turma(this);
                    novaTurma(novaTurma);
                    return novaTurma;
            }
    }

    public void mostraTurmas() {
            for (Turma turma : turmas) {
                    System.out.println("Turma: " + turma.getId());
            }
    }

    public void mostraAlunos() {
            for (Turma turma : turmas) {
                    for (Matricula matricula : turma.getMatriculas()) {
                            System.out.println("Aluno(a): " + matricula.getNomeAluno() + " da turma " + matricula.getNumTurma());
                    }
            }
    }
}
