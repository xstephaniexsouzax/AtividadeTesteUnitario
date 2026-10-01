package projeto.calculadora;

public final class App {
    private  App(){

    }
    public static void main (String[] args){
        Calculadora calculadora = new Calculadora();
        System.out.println("Calculadora");

        System.out.println("Soma: " + calculadora.soma(10,5));
        System.out.println("Subtração " + calculadora.sub(10,5));
        System.out.println("Multiplicação " + calculadora.mult(10,5));
        System.out.println("Divisão " + calculadora.divisao(10,5));



    }
}
