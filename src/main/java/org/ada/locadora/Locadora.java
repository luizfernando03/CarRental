package org.ada.locadora;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Locadora {

    private List<ClienteImpl> clientes;
    private List<VeiculoImpl> veiculos;
    private List<Aluguel> alugueis;


    public Locadora() {
        this.clientes = new ArrayList<>();
        this.veiculos = new ArrayList<>();
        this.alugueis = new ArrayList<>();
    }

    public void cadastrarCliente(ClienteImpl cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        }
    }

    public void cadastrarVeiculo(VeiculoImpl veiculo) {
        if (!veiculos.contains(veiculo)) {
            veiculos.add(veiculo);
        }
    }

    public void alugarVeiculo(VeiculoImpl veiculo, ClienteImpl cliente, LocalDateTime dataAluguel, LocalDateTime dataDevolucao) {
        if (!veiculo.isDisponivel()) {
            System.out.println("O veiculo esta disponivel para aluguel");
            return;
        }
        if (dataDevolucao.isBefore(dataAluguel)) {
            System.out.println("Data da devolução é anterior a data do Aluguel! ");
            return;
        }
        veiculo.isDisponivel(false);
        Aluguel aluguel = new Aluguel (veiculo, cliente, dataAluguel, dataDevolucao);
        alugueis.add(aluguel);

    }
    public void devolvverVeiculo(VeiculoImpl veiculo) {
        for (Aluguel aluguel : alugueis) {

        }
    }

}
