package ex3_atividade7;

public class Ex3_atividade7 {

    public static void main(String[] args) {
        // TODO code application logic here
        ArvoreBin<String> strings = new ArvoreBin();
        strings.insere("Carlos");
        strings.insere("Ana");
        strings.insere("Jose");
        strings.insere("Robson");
        strings.insere("Pedro");
        strings.insere("Antonio");
        if (strings.remove("Robson")){
            System.out.println("Robson removido com sucesso");
        }
        else{
            System.out.println("Robson NAO esta na arvore");
        }
        if (strings.busca("Robson"))
            System.out.println("Robson esta na arvore");
        else
            System.out.println("Robson NAO esta na arvore");
        strings.imprime();
    }
    
}
