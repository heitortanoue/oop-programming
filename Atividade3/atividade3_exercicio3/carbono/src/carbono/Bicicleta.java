package carbono;

public class Bicicleta implements PegadaDeCarbono {
	public int kmsRodados;
	
	public Bicicleta(int kmsRodados) {
		super();
		this.kmsRodados = kmsRodados;
	}

	public int getPegadaDeCarbono () {
		return 0;
	}
}
