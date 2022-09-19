package carbono;

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
