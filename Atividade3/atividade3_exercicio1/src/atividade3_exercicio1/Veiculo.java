package atividade3_exercicio1;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected String numChassi;
    protected String cor;
    protected int ano;
    protected int rev; // quantos meses desde a ultima revisao
    protected int arRodas; // verifica calibraçao dos pneus
    protected boolean sujeira;
    
    Veiculo(String pMarca, String pModelo, String pNumChassi, String pCor, int pAno, int pRev, int pAr, boolean pSujeira) {
        marca = pMarca;
        modelo = pModelo;
        numChassi = pNumChassi;
        cor = pCor;
        ano = pAno;
        rev = pRev;
        arRodas = pAr;
        sujeira = pSujeira;
    }
    
    public abstract int listarVerificacoes();
    public abstract void ajustar(int tipo);
    public abstract void limpar();
}