package org.ada.locadora;

public interface Veiculo {
    String getIdentificador();
    String getNome();
    String getTipo();
    String getValorDiaria();
    void setDisponivel(boolean disponivel);
}
