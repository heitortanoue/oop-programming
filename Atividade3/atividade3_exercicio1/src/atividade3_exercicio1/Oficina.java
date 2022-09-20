package atividade3_exercicio1;

import java.util.ArrayList;

public class Oficina {
    private ArrayList<Veiculo> filaEspera;
    private int idProximo = 0;
    
    Oficina() {
        filaEspera = new ArrayList();
        filaEspera.add(new Automovel("Fiat", "Argo", "1", "vermelho", 2020, 6, 25, "ABC-1234", false, 2500, true));
        filaEspera.add(new Automovel("Chevrolet", "Onix", "2", "azul", 2019, 8, 30, "DEF-5678", true, 2800, false));
        filaEspera.add(new Bicicleta("Caloi", "Ceci", "3", "bordo", 2021, 10, 15, false, false, true));
        filaEspera.add(new Automovel("Ford", "Ka", "4", "indigo", 2004, 15, 24, "GHI-9012", false, 8000, true));
    }
    
    public void manutencao(Veiculo v) {
        int tipo = v.listarVerificacoes();
        while (tipo != 0){
            v.ajustar(tipo);
            tipo = v.listarVerificacoes();
        }
        v.limpar();
        if (v instanceof Automovel)
            ((Automovel) v).trocarOleo();
    }
    
    public Veiculo proximo() {
        return filaEspera.get(idProximo++);
    }   
}