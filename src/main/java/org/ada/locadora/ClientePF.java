package org.ada.locadora;

public class ClientePF implements Cliente{

    private String cpf;
    private String nome;
    private String tipo;

    public ClientePF(String cpf, String nome, String tipo) {
        this.cpf = cpf;
        this.nome = nome;
        this.tipo = "PF";
    }

    @Override
    public String getIdentificador() {
        return null;
    }

    @Override
    public String getTipo() {
        return null;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
