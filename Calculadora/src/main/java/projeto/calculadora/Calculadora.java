package projeto.calculadora;

public class Calculadora {

    public  int soma(int a, int b){
        return  a + b;
    }

    public  int sub(int a, int b){
        return a - b;
    }

    public int mult(int a, int b){
        if (a == 0 || b==0){
            throw new ArithmeticException("Multiplicação por um número zero, gera zero");
        }
        return a*b;
    }

    public double divisao(double a, double b){
        if (b == 0){
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        return a /b;
    }
}
