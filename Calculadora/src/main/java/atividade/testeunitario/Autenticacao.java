package atividade.testeunitario;

import java.util.ArrayList;

public class Autenticacao {
    ArrayList<Usuario> listaUsuario = new ArrayList<>();

    Usuario u1 = new Usuario("step123", "Teste@123456",Nivel.ADMIN, false, 0);

    public void cadastrarCliente(){
        listaUsuario.add(u1);
    }
     public boolean autenticar(String nome, String senha){
         if (nome == null || nome.isBlank() || senha == null || senha.isBlank()) {
             return false;
         }
        for (Usuario l: listaUsuario){
            if (l.isBloqueado()){
                return false;
            }
            if(l.getQuantidadeTentativas() >= 3){
                return false;
            }
            if (l.getLogin().equals(nome)) {
              if(l.getSenha().equals(senha)){
                  System.out.println("Autenticação válida");
                  return true;
              } else {
                 l.setQuantidadeTentativas(l.getQuantidadeTentativas()+1);
                 if (l.getQuantidadeTentativas() >=3 ){
                    l.setBloqueado(true);
                 }
              }

            }

        }
        return false;
     }



}
