package mock;

import dao.VeiculoDAO;
import model.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoDAOMock implements VeiculoDAO {
    private List<Veiculo> veiculos = new ArrayList<>();

    @Override
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
        System.out.println("Veículo adicionado: " + veiculo.getModelo());
    }

    @Override
    public List<Veiculo> listarVeiculos() {
        return veiculos;
    }

    @Override
    public Veiculo buscarVeiculoPorId(int id) {
        return veiculos.stream().filter(v -> v.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void atualizarVeiculo(Veiculo veiculo) {
        // Lógica para atualizar veículo
    }

    @Override
    public void removerVeiculo(int id) {
        // Lógica para remover veículo
    }
}
