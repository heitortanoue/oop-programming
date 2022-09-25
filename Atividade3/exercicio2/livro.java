package loja;

public class livro extends produto {
	//Atributos
	protected String autor;

	
	//Construtores~
	public livro(String nomeLoja, double preco, String descricao, String autor) {
		super(nomeLoja, preco, descricao);
		this.autor = autor;
	}

	
	//Getters e setters
	public String getAutor() {
		return autor;
	}

	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public String getDescricao() {
		return descricao + " " +this.autor;
	}
	
}
