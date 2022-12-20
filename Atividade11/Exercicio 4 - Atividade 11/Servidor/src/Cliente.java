import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;

import Executaveis.Executavel;

public class Cliente {
    private Socket socket;
    private ObjectOutputStream oos;
    private BufferedReader br;

    public void conectar() {
        try {
            System.out.println("[CLIENTE] Conectando ao Servidor...");
            this.socket = new Socket("localhost", 8008);
        } catch (Exception e) {
            System.out.println("[CLIENTE] Erro ao conectar ao Servidor");
            return;
        }

        // envia dados para o Servidor
        try {
            this.oos = new ObjectOutputStream(this.socket.getOutputStream());
            this.br = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
        } catch (Exception e) {
            System.out.println("[CLIENTE] Erro ao criar objeto de envio de dados para o Servidor");
            return;
        }
    }

    public void enviar (Executavel e) {
        try {
            System.out.println("[CLIENTE] Enviando dados para o Servidor... (" + e.getClass().getName() + ")");
            this.oos.writeObject(e);
        } catch (Exception ex) {
            System.out.println("[CLIENTE] Erro ao enviar dados para o Servidor");
            return;
        }
    }

    public void desconectar() {
        try {
            System.out.println("[CLIENTE] Desconectando do Servidor...");
            this.socket.close();
        } catch (Exception e) {
            System.out.println("[CLIENTE] Erro ao desconectar do Servidor");
            return;
        }
    }
}
