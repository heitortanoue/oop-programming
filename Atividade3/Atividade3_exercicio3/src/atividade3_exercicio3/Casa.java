/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3_exercicio3;

public class Casa extends Predio {
	public int moradores;

	public Casa(String endereco, int moradores, int areaVerde, int areaConstruida) {
		super(endereco, areaVerde, areaConstruida);
		this.moradores = moradores;
	}
	
	public int getPegadaDeCarbono() {
		return (this.areaConstruida - this.areaVerde) * this.moradores;
	}
}