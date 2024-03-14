package org.ada.locadora;

public class VeiculoImpl implements Veiculo{

    private String placa;
    private String nome;
    private String tipo;
    private double valorDaiaria;
    private boolean disponivel;

    public VeiculoImpl(String placa, String nome, String tipo, double valorDaiaria, boolean disponivel) {
        this.placa = placa;
        this.nome = nome;
        this.tipo = tipo;
        this.valorDaiaria = valorDaiaria;
        this.disponivel = true;
    }

    @Override
    public String getIdentificador() {
        return placa;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public double getValorDiaria() {
        return valorDaiaria;
    }

    @Override
    public boolean isDisponivel(boolean disponivel) {
        return disponivel;

    }

    @Override
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
