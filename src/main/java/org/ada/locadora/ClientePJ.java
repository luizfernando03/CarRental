package org.ada.locadora;

public class ClientePJ implements Cliente{
    private String cnpj;
    private String nomeEmpresa;
    private String tipo;

    public ClientePJ(String cnpj, String nome, String tipo) {
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
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

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }


}
