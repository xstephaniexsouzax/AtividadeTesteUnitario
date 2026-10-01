package projeto.calculadora;

import Usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuarios {
    public static void main(String[] args) {
        // Criação e preenchimento da lista
        List <Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("Stephanie", "teste@123"));

        // Listagem utilizando foreach
        System.out.println(usuarios + "--- Lista de Usuários ---");

    }
}
