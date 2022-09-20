/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3_exercicio3;

public class Escola extends Predio {
	public int alunos;

	public Escola(String endereco, int alunos, int areaVerde, int areaConstruida) {
		super(endereco, areaVerde, areaConstruida);
		this.alunos = alunos;
	}
	
	public int getPegadaDeCarbono() {
		return (this.areaConstruida - this.areaVerde) * this.alunos;
	}
}