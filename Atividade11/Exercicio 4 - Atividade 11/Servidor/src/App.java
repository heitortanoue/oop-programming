import Executaveis.*;

public class App {
    public static void main(String[] args) throws Exception {
        Servidor s = new Servidor();

        s.conectar(8008);

        s.ouvir();

        s.desconectar();
    }
}
