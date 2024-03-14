package org.ada.locadora;

public class ClientePJ implements Cliente{
    private String cnpj;
    private String nome;
    private String tipo;

    public ClientePJ(String cnpj, String nome, String tipo) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String getIdentificador() {
        return cnpj;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
