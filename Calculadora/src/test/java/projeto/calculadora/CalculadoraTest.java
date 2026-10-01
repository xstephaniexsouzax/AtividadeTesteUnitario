package projeto.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    private Calculadora calculadora;

    // Deve ser executado antes do teste para preparar o sistema
    // Cria o objeto calculadora que foi usada posteriormente.
    @BeforeEach
    void setUp(){
        calculadora = new Calculadora();
    }

    //  teste para soma: usa o objeto instanciado antes e valida o resultado esperando com
    // o que o sistema gerou
    @Test
    void somar(){
        int resultado = calculadora.soma(1,2);
        Assertions.assertEquals(3,resultado);
    }
    @Test
    void somarNegativo(){
        int resultado = calculadora.soma(5,-1);
        Assertions.assertEquals(4, resultado);
    }

    @Test
    void subtrair(){
        int resultado = calculadora.sub(2,1);
        Assertions.assertEquals(1, resultado);
    }

    @Test
    void multiplicar(){
        int resultado = calculadora.mult(2,2);
        Assertions.assertEquals(4, resultado);
    }


    @Test
    void multiPorZero(){
        ArithmeticException erro = Assertions.assertThrows(
                ArithmeticException.class,
                () -> calculadora.mult(8,0)
        );
        Assertions.assertEquals(
                "Multiplicação por um número zero, gera zero",
                erro.getMessage()
        );
    }
    @Test
    void divisao(){
        double resultado = calculadora.divisao(12.0,3.0);
        // Assertions.assertEquals(esperado, obtido, margem);
        Assertions.assertEquals(4, resultado, 0.0001);

    }
    //Tento dividir 12 por 0. Espero que dê erro.
    //E confiro se a mensagem do erro é exatamente 'Divisão por zero não permitida'.
    @Test
    void divisaoPorZero(){
        // Assertions.assertThrows: Eu espero que aconteça um erro
        //ArithmeticException.class → "O erro que eu espero é desse tipo" (erro de conta matemática).
        // () -> calculadora.divisao(12.0, 0.0) → "É essa ação aqui que vai causar o erro" (dividir 12 por 0)
        ArithmeticException erro = Assertions.assertThrows(
                ArithmeticException.class,
                () -> calculadora.divisao(12.0, 0.0)
        );

        Assertions.assertEquals(
                "Divisão por zero não permitida",
                erro.getMessage()
        );
    }
}
