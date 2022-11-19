package atividade7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bealomes
 */
public class GenericCollection <T>  {
     //Atributos
    private T num1;
    private T num2;
    
    //Construtores
    public GenericCollection(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public GenericCollection() {
        num1 = null;
        num2 = null;
    }

    //Getters e Setters
    public T getNum1() {
        return num1;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public T getNum2() {
        return num2;
    }

    public void setNum2(T num2) {
        this.num2 = num2;
    }

    //Métodos
    //Método que retorna o maior valor
    public T getMax() {
        if (num1 instanceof Integer) {
            if ((Integer) num1 > (Integer) num2) {
                return num1;
            } else {
                return num2;
            }
        } else if (num1 instanceof Double) {
            if ((Double) num1 > (Double) num2) {
                return num1;
            } else {
                return num2;
            }
        } else if (num1 instanceof Float) {
            if ((Float) num1 > (Float) num2) {
                return num1;
            } else {
                return num2;
            }
        } else if (num1 instanceof Long) {
            if ((Long) num1 > (Long) num2) {
                return num1;
            } else {
                return num2;
            }
        } else if (num1 instanceof Short) {
            if ((Short) num1 > (Short) num2) {
                return num1;
            } else {
                return num2;
            }
        } else if (num1 instanceof Byte) {
            if ((Byte) num1 > (Byte) num2) {
                return num1;
            } else {
                return num2;
            }
        } else {
            return null;
        }
    }

    //Método que retorna o menor valor
    public T getMin() {
        if (num1 instanceof Integer) {
            if ((Integer) num1 < (Integer) num2) {
                return num1;
            } else {
                return num2;
            }
        } else if (num1 instanceof Double) {
            if ((Double) num1 < (Double) num2) {
                return num1;
            } else {
                return num2;
            }
        } else if (num1 instanceof Float) {
            if ((Float) num1 < (Float) num2) {
                return num1;
            } else {
                return num2;
            }
        } else if (num1 instanceof Long) {
            if ((Long) num1 < (Long) num2) {
                return num1;
            } else {
                return num2;
            }
        } else if (num1 instanceof Short) {
            if ((Short) num1 < (Short) num2) {
                return num1;
            } else {
                return num2;
            }
        } else if (num1 instanceof Byte) {
            if ((Byte) num1 < (Byte) num2) {
                return num1;
            } else {
                return num2;
            }
        } else {
            return null;
        }
    }

    //to String concatenado
    @Override
    public String toString() {
        return "GenericCollection{" +  num1 +"" + num2 + '}';
    }

    
    
}
