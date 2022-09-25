package loja;

public class produto {
	//atributos
	protected String nomeLoja;
	protected  double preco;
	protected String descricao;
	
	//construtores
	public produto(String nomeLoja, double preco, String descricao) {
		this.nomeLoja = nomeLoja;
		this.preco = preco;
		this.descricao = descricao;
	}
		
	
	//Getters e setters
	public String getNomeLoja() {
		return nomeLoja;
	}
	
	public void setNomeLoja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		String des = "Produto de informática";
		return des;
	}
	
	
	
	

}
