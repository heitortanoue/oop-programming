package atividade3_exercicio1;

public class Automovel extends Veiculo {
    private String placa;
    private boolean motor; // funcionamento motor
    private int oleo; // km rodados desde a ultima troca de oleo
    
    Automovel(String pMarca, String pModelo, String pNumChassi, String pCor, int pAno, int pRev, int pAr, String pPlaca, boolean pMotor, int pOleo, boolean pSujeira) {
        super(pMarca, pModelo, pNumChassi, pCor, pAno, pRev, pAr, pSujeira);
        placa = pPlaca;
        motor = pMotor;
        oleo = pOleo;
    }
    
    public int listarVerificacoes() {
        System.out.println("Listando verificacoes do automovel " + placa);
        if (motor){
            System.out.println("Motor funcionando!");
        }
        else{
            System.out.println("O motor sera consertado, ele esta quebrado");
            return 1;
        }
        if (super.arRodas == 30){
            System.out.println("Rodas calibradas");
        }
        else{
            System.out.println("As rodas serao calibradas");
            return 2;
        }
        
        rev = 0;
        return 0;
    }
    
    public void ajustar(int tipo) {
        System.out.println("Ajustando o automovel " + placa);
        if (tipo == 2){
            super.arRodas = 30;
            System.out.println("Rodas calibradas");
        }
        else{
            motor = true;
            System.out.println("Motor funcionando!");
        }
    }
    
    public void limpar() {
        if (super.sujeira){
            System.out.println("Limpando o automovel " + placa);
            super.sujeira = false;
            System.out.println("Automovel limpo!");
        }
        else{
            System.out.println("Automovel limpo!");
        }
    }
    
    public void trocarOleo() {
        if (oleo > 5000){
            System.out.println("Trocando o oleo do automovel " + placa);
            oleo = 0;
        }
        else{
            System.out.println("Oleo esta bom!");
        }
    }
}
