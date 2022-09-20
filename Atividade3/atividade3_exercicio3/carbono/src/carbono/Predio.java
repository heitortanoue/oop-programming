package carbono;

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
