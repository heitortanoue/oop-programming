package ex1.atividade8;

public class Polinomio {
    private int x[];
    
    private int resultado;
    
    Polinomio(){
        x = new int[6];
        resultado = 0;
    }
    
    void carregarCoefientes(int v[]){
        System.arraycopy(v, 0, x, 0, 6);
    }
    
    String mostrarPolinomio(){
        String s;
        s = "";
        
        boolean flag = true; // verifica se eh o primeiro para nao add o "+" antes
        for (int i = 5; i >= 0; i--){
            if (x[i] != 0){
                if (flag){
                    if(i == 0){
                        s += String.valueOf(x[i]);
                    }
                    else{
                        s += ("x^" + String.valueOf(i) + " * " + String.valueOf(x[i]));
                    }
                    flag = false;
                }
                else{
                    if(i == 0){
                        s += (" + " + String.valueOf(x[i]));
                    }
                    else {
                        s += (" + x^" + String.valueOf(i) + " * " + String.valueOf(x[i]));
                    }
                }
            }
        }
        return s;
    }
    
    void calcularX(int valor){
        resultado = 0;
        for (int i = 0; i < 6; i++){
            resultado += (x[i]* Math.pow(valor, i)); 
        }
    }
    
    int retornarResultado(){
        return resultado;
    }
}
