/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3_exercicio3;


public class Carro implements PegadaDeCarbono {
	public int kmsRodados;
	public int kmsPorLitro;
	private String tipoDeCombustivel;
	
	public Carro(int kmsRodados, int kmsPorLitro, String tipoDeCombustivel) {
		super();
		this.kmsRodados = kmsRodados;
		this.kmsPorLitro = kmsPorLitro;
		this.tipoDeCombustivel = tipoDeCombustivel;
	}
	
	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}
	public void setTipoDeCombustivel(String tipoDeCombustivel) {
		if (tipoDeCombustivel != "gasolina" || tipoDeCombustivel != "etanol") {
			this.tipoDeCombustivel = "gasolina";
		}
		this.tipoDeCombustivel = tipoDeCombustivel;
	}
	
	public int getPegadaDeCarbono () {
		int litros = kmsRodados / kmsPorLitro;
		int carbonoPorLitro = 10;
		if (this.tipoDeCombustivel == "etanol") {
			carbonoPorLitro = 7;
		}
		return litros * carbonoPorLitro;
	}
}