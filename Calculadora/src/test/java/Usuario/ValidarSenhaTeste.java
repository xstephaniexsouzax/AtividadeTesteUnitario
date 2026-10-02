package Usuario;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidarSenhaTeste {
    private ValidarSenha validarSenha;

    @BeforeEach
    void setup(){
        validarSenha = new ValidarSenha();
    }

    @Test
    void validar (){
        boolean resultado = validarSenha.Validar("Stephanie5");
        Assertions.assertEquals(true,resultado);
    }
    // menos de 8 caracteres
    @Test
    void menosDeOitoCaracteres (){
        boolean resultado = validarSenha.Validar("5tephAn");
        Assertions.assertEquals(false,resultado);
    }
    // sem letra maiuscula
    @Test
    void semMaisucula (){
        boolean resultado = validarSenha.Validar("steph5anie");
        Assertions.assertEquals(false,resultado);
    }
    // sem letra menuscula
    @Test
    void semMenuscula(){
        boolean resultado = validarSenha.Validar("STEPHANIE8");
        Assertions.assertEquals(false,resultado);
    }
    @Test
    void semNumero (){
        boolean resultado = validarSenha.Validar("stepHanie");
        Assertions.assertEquals(false,resultado);

    }


}
