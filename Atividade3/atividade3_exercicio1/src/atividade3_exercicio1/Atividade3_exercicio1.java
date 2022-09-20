package atividade3_exercicio1;

public class Atividade3_exercicio1 {
    public static void main(String args[]){
        Oficina o = new Oficina();
        Veiculo v;
        for(int i=0;i<4;++i){
            v=o.proximo();
            o.manutencao(v);
        }
    }
}
