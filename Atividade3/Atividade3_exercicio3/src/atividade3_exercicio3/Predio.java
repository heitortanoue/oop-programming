/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3_exercicio3;

public abstract class Predio implements PegadaDeCarbono {
	public String endereco;
	
	public Predio(String endereco, int areaVerde, int areaConstruida) {
		super();
		this.endereco = endereco;
		this.areaVerde = areaVerde;
		this.areaConstruida = areaConstruida;
	}

	public int areaVerde;
	public int areaConstruida;
}
