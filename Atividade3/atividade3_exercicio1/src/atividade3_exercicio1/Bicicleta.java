package atividade3_exercicio1;

public class Bicicleta extends Veiculo {
    private boolean ehMountainBike;
    private boolean marcha; // marcha da bicilceta funcionando
    
    Bicicleta(String pMarca, String pModelo, String pNumChassi, String pCor, int pAno, int pRev, int pAr, boolean pSujeira, boolean pMB, boolean pMarcha) {
        super(pMarca, pModelo, pNumChassi, pCor, pAno, pRev, pAr, pSujeira);
        ehMountainBike = pMB;
        marcha = pMarcha;
    }
    
    public int listarVerificacoes() {
        String tipo;
        if(ehMountainBike){
            tipo = "Mountain Bike";
        }
        else{
            tipo = "comum";
        }
        System.out.println("Listando verificacoes da bicicleta " + tipo + " " + super.modelo);
        
        if ((super.arRodas == 16 && ehMountainBike) || (super.arRodas == 14 && !(ehMountainBike))){
            System.out.println("Rodas calibradas");
        }
        else{
            System.out.println("As rodas serao calibradas");
            return 2;
        }
        
        if (marcha){
            System.out.println("A marcha funciona!");
        }
        else{
            System.out.println("A marcha sera ajustada");
            return 1;
        }
        rev = 0;
        return 0;
    }
    
    public void ajustar(int tipo) {
        System.out.println("Ajustando a bicicleta...");
        if(tipo == 2){
            if (ehMountainBike){
                super.arRodas = 16;
            }
            else{
                super.arRodas = 14;
            }
            System.out.println("Rodas calibradas!");
        }
        else{
            marcha = true;
            System.out.println("Marcha ajustada!");
        }
    }
    
    public void limpar() {
        if (sujeira){
            System.out.println("Limpando a bicicleta...");
            super.sujeira = false;
            System.out.println("Bicicleta limpa!");
        }
        else{
            System.out.println("Bicicleta limpa!");
        }
    }
}
