package loja;

import java.util.ArrayList;

public class principal {

	public static void main(String[] args) {
		ArrayList<produto> carrinho = new ArrayList<produto>();
		
		//Instanciar objetos
		livro livro1 = new livro("Saraiva", 135.24, "Livro de romance generico", "Jose de Alencar");
		livro livro2 = new livro("Sebo", 1.24, "Livro de terror generico", "Heitor");
		livro livro3 = new livro("vozes da cabeça", 132.24, "Livro de suspense generico", "Beatriz Cardoso");
		livro livro4 = new livro("Sebo", 155.24, "Livro de ação generico", "Torrent");
		mouse mouse1 = new mouse("Padrão", 10, "MOuse de notebooks","TX" );
		mouse mouse2 = new mouse("EPA EPA", 300, "Mouse genérico caro", "Mouse RGB");
		
		//Adicionar produtos no carrinho
		carrinho.add(livro1);
		carrinho.add(livro2);
		carrinho.add(livro3);
		carrinho.add(livro4);
		carrinho.add(mouse1);
		carrinho.add(mouse2);
		
		//Chamar o método getDEscriçãpo
		for(int i=0; i<carrinho.size();i++) {
			String descricao = carrinho.get(i).getDescricao();
			System.out.println(descricao);
		}
		
		
		
		

	}

}
