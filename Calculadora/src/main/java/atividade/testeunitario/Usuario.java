package atividade.testeunitario;

public class Usuario {
    private String login;
    private String senha;
    private Nivel nivel;
    private boolean bloqueado;
    private int quantidadeTentativas;

    public Usuario(String login, String senha, Nivel nivel, boolean bloqueado, int quantidadeTentativas) {
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
        this.bloqueado = bloqueado;
        this.quantidadeTentativas = quantidadeTentativas;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public int getQuantidadeTentativas() {
        return quantidadeTentativas;
    }

    public void setQuantidadeTentativas(int quantidadeTentativas) {
        this.quantidadeTentativas = quantidadeTentativas;
    }
}
