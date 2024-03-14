package org.ada.locadora;

import java.time.LocalDateTime;

public class Aluguel {

    private Veiculo veiculo;
    private Cliente cliente;
    private LocalDateTime dataAluguel;
    private LocalDateTime dataDevolucao;

    public Aluguel(Veiculo veiculo, Cliente cliente, LocalDateTime dataAluguel, LocalDateTime dataDevolucao) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao;
    }
}
