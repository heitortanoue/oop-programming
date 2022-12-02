package lista9ex3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lerArquivo {
    private int cont;

    public lerArquivo(String nomeArquivo) throws Exception {
        cont = 0;
        try {
            FileReader arq = new FileReader(nomeArquivo);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            while (linha != null) {
                cont++;
                linha = lerArq.readLine();
                // se chegar na linha 10 printa a mensagem
                if (cont == 10) {
                    System.out.println("O arquivo chegou na linha 10");
                }
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
            cont = -1;
        }
    }

    public int getCont() {
        return cont;
    }
}