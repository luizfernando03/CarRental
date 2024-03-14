package org.ada.locadora;

import java.time.LocalDateTime;

public class Aluguel {

    private VeiculoImpl veiculo;
    private ClienteImpl cliente;
    private LocalDateTime dataAluguel;
    private LocalDateTime dataDevolucao;

    public Aluguel(VeiculoImpl veiculo, ClienteImpl cliente, LocalDateTime dataAluguel, LocalDateTime dataDevolucao) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dataAluguel = dataAluguel;
        this.dataDevolucao = dataDevolucao;
    }
}
