import Executaveis.*;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente c = new Cliente();

        c.conectar(8008);

        Soma soma = new Soma(2, 3);
        Divisao divisao = new Divisao(8, 2);

        // quando apertar a tecla ENTER, o programa irá enviar os dados para o Servidor
        // Quando apertar a tecla S, sai do loop
        while (true) {
            if (System.in.read() == 's') {
                break;
            }
            c.enviar(soma);
            c.enviar(divisao); 
        }

        c.desconectar();
    }
}
