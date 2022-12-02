package lista9ex3;
import java.util.Scanner;

public class Lista9ex3 {

    public static void main(String[] args) throws Exception {
        //scanner para ler uma entrada de string
        Scanner ler = new Scanner(System.in);
        //variavel para armazenar a string
        String nome;
        
        //pede para o usuario digitar o nome do arquivo
        System.out.println("Digite o nome do arquivo: ");
        //armazena o nome do arquivo na variavel nome
        nome = ler.nextLine();
        
        // cria um objeto da classe lerArquivo
        lerArquivo arquivo = new lerArquivo(nome);
        int numLinhas = arquivo.getCont();

        if (numLinhas < 10 && numLinhas != -1) {
            System.out.println("O arquivo tem menos de 10 linhas");
        }
    }
}
