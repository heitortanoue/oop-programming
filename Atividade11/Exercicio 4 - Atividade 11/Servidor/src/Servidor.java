import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import Executaveis.Executavel;

public class Servidor extends TesteDeExecucao {
    private ServerSocket ss;
    private Socket receptor;

    private ObjectInputStream ois;
    private PrintWriter pw;

    // conecta ao Receptor com dns
    public void conectar(int porta) {
        try {
            System.out.println("[SERVIDOR] Abrindo porta " + porta +"...");
            this.ss = new ServerSocket(porta);
            this.receptor = this.ss.accept();
        } catch (Exception e) {
            System.out.println("[SERVIDOR] Erro ao conectar ao Cliente");
            return;
        }
        
        try {
            this.ois = new ObjectInputStream(this.receptor.getInputStream());
            this.pw = new PrintWriter(new OutputStreamWriter(this.receptor.getOutputStream()));
            System.out.println("[SERVIDOR] Conectado ao Cliente");
        } catch (Exception e) {
            // printa erro e sai
            System.out.println(e.getMessage());
            System.out.println("[SERVIDOR] Erro ao receber/enviar dados do/ao Cliente");
            return;
        }    
    }

    public void ouvir () {
        // recebe dados do Receptor
        if (this.receptor == null) {
            System.out.println("[SERVIDOR] Não há conexão com o Cliente");
            return;
        }

        Executavel oTemp = null;
        do {
            try {
                oTemp = (Executavel) this.ois.readObject();
                this.pw.println("[SERVIDOR] Objeto recebido (" + oTemp.getClass().getName() + ")");
                this.pw.flush();
                oTemp.fazer();
            } catch (Exception e) {
                System.out.println("[SERVIDOR] Erro ao executar o objeto recebido");
            }
        } while(oTemp != null);
    }

    public void desconectar() {
        // fecha conexão com o Cliente
        try {
            System.out.println("[SERVIDOR] Desconectando do Cliente...");
            this.receptor.close();
            this.ss.close();
        } catch (Exception e) {
            System.out.println("Erro ao desconectar do Cliente");
        }
    }
}
