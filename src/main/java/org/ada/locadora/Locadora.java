package org.ada.locadora;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Locadora {

    private List<Cliente> clientes;
    private List<Veiculo> veiculos;
    private List<Aluguel> alugueis;


    public Locadora() {
        this.clientes = new ArrayList<>();
        this.veiculos = new ArrayList<>();
        this.alugueis = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        }
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        if (!veiculos.contains(veiculo)) {
            veiculos.add(veiculo);
        }
    }

    public void alugarVeiculo(Veiculo veiculo, Cliente cliente, LocalDateTime dataAluguel, LocalDateTime dataDevolucao) {
        if (!veiculo.isDisponivel()) {
            System.out.println("O veiculo esta disponivel para aluguel");
            return;
        }
        if (dataDevolucao.isBefore(dataAluguel)) {
            System.out.println("Data da devolução é anterior a data do Aluguel! ");
            return;
        }
        veiculo.setDisponivel(false);
        Aluguel aluguel = new Aluguel (veiculo, cliente, dataAluguel, dataDevolucao);
        alugueis.add(aluguel);

    }
    public void devolvverVeiculo(Veiculo veiculo) {
        for (Aluguel aluguel : alugueis) {
            
        }
    }

}
