package carbono;

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
