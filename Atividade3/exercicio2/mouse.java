package loja;

public class mouse extends produto {
	//Atributos
	protected String tipo;
	
	//Construtotres
	public mouse(String nomeLoja, double preco, String descricao, String tipo) {
		super(nomeLoja, preco, descricao);
		this.tipo = tipo;
	}


	//Getters e setter
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String getDescricao() {
		return descricao + " " +this.tipo;
	}
	
	
	
	

}
