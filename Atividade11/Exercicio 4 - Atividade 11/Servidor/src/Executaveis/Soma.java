package Executaveis;

public class Soma implements Executavel {
    private int a;
    private int b;

    public Soma(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void fazer() {
        System.out.println(this.a + this.b);
    }
}
