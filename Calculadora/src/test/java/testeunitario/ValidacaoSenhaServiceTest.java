package testeunitario;

import atividade.testeunitario.ValidarSenha;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidacaoSenhaServiceTest {

    private ValidarSenha validarSenha;

    @BeforeEach
    void setUp(){
        validarSenha = new ValidarSenha();
    }

    @Test
    void senhaValida(){
        boolean resultado = validarSenha.validarSenha("Java@1234");
        Assertions.assertEquals(true, resultado);
    }
    @Test
    void senhaNull(){
        boolean resultado = validarSenha.validarSenha(null);
        Assertions.assertEquals(false, resultado);
    }
    @Test
    void senhaVazia(){
        boolean resultado = validarSenha.validarSenha("");
        Assertions.assertEquals(false, resultado);
    }
    @Test
    void tamanhoDaSenha(){
        boolean resultado = validarSenha.validarSenha("Senh@7469900");
        Assertions.assertEquals(true, resultado);
    }
    @Test
    void senhaSemNumero(){
        boolean resultado = validarSenha.validarSenha("Java@Test");
        Assertions.assertEquals(false, resultado);

    }
    @Test
    void senhaSemLetra(){
        boolean resultado = validarSenha.validarSenha("123456@789" );
        Assertions.assertEquals(false, resultado);

    }
    @Test
    void senhaSemCaracterEspecial(){
        boolean resultado = validarSenha.validarSenha("Java123456" );
        Assertions.assertEquals(false, resultado);

    }


}
