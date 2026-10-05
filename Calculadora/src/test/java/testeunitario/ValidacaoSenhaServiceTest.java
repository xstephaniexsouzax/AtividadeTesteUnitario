package testeunitario;

import atividade.testeunitario.Autenticacao;
import atividade.testeunitario.ValidarSenha;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidacaoSenhaServiceTest {

    private ValidarSenha validarSenha;
    private Autenticacao autenticacao;

    @BeforeEach
    void setUp(){
        validarSenha = new ValidarSenha();
        autenticacao = new Autenticacao();
    }

    @Test
    void senhaValida(){
        boolean resultado = validarSenha.validarSenha("Java@12345");
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

    @Test
    void menorQueNoveCaracteres(){
        boolean resultado = validarSenha.validarSenha("Java@123" );
        Assertions.assertEquals(false, resultado);

    }

    @Test
    void trezeCaracteres(){
        boolean resultado = validarSenha.validarSenha("Java@12345678" );
        Assertions.assertEquals(false, resultado);

    }
    @Test
    void dezCaracteres(){
        boolean resultado = validarSenha.validarSenha("Java@12345");
        Assertions.assertEquals(true, resultado);

    }
    @Test
    void dozeCaracteres(){
        boolean resultado = validarSenha.validarSenha("Java@1234567" );
        Assertions.assertEquals(true, resultado);

    }

    @Test

    void auten(){
       autenticacao.cadastrarCliente();
       boolean resultado = autenticacao.autenticar("step123", "Teste@123456");
       Assertions.assertEquals(true, resultado);
    }



}
