package Usuario;

public final class App {
    private  App(){

    }
    public static void main (String[] args){
        Usuario usuario = new Usuario();
        usuario.setSenha("Stephanie");
        usuario.setLogin("Stephanie");

        ValidarSenha validarSenha = new ValidarSenha();
        System.out.println(validarSenha.Validar(usuario.getSenha()));








    }
}
