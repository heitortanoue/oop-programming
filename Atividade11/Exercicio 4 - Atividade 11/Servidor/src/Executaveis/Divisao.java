package Executaveis;

public class Divisao implements Executavel {
    private int a;
    private int b;

    public Divisao(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void fazer() {
        System.out.println(this.a / this.b);
    }
}
