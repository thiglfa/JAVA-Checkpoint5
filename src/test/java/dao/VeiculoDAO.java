package dao;

import model.Veiculo;

import java.util.List;

public interface VeiculoDAO {
    void adicionarVeiculo(Veiculo veiculo);
    Veiculo buscarVeiculoPorId(int id);
    List<Veiculo> listarVeiculos();
    void atualizarVeiculo(Veiculo veiculo);
    void removerVeiculo(int id);
}

