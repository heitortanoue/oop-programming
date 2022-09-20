package carbono;
import java.util.ArrayList;

public class Aplicativo {
	public static void main(String[] args) {
		
		ArrayList<PegadaDeCarbono> aplicativo = new ArrayList<PegadaDeCarbono>();
		// Predio predioRosa = new Predio("rua 1", 10, 200, 100);
		// Predio predioAzul = new Predio("rua 2", 25, 300, 400);
		
		Escola escolaInfantil = new Escola ("rua 1", 100, 250, 230);
		Casa casaAzul = new Casa ("rua 2", 6, 150, 100);
		Carro carroCinza = new Carro(2000, 14, "gasolina");
		Carro carroVermelho = new Carro(5000, 8, "etanol");
		Bicicleta bicicletaAmarela = new Bicicleta(300);
		Bicicleta bicicletaVerde = new Bicicleta(500);
		
		// aplicativo.add(predioRosa);
		//aplicativo.add(predioAzul);
		aplicativo.add(escolaInfantil);
		aplicativo.add(casaAzul);
		aplicativo.add(carroCinza);
		aplicativo.add(carroVermelho);
		aplicativo.add(bicicletaAmarela);
		aplicativo.add(bicicletaVerde);
		
		int pegadaTotal = 0;
	    for (PegadaDeCarbono i : aplicativo) {
	    	pegadaTotal += i.getPegadaDeCarbono();
	        System.out.println(i.getPegadaDeCarbono());
	    }
	    System.out.println("A pegada de carbono total e de " + pegadaTotal);
	}	
}

