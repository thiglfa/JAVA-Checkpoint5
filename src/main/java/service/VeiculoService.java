package service;
import dao.VeiculoDAO;
import model.Veiculo;

public class VeiculoService {
    private static VeiculoService instancia;
    private VeiculoDAO veiculoDAO;

    public VeiculoService(VeiculoDAO veiculoDAO) {
        this.veiculoDAO = veiculoDAO;
    }

    public static VeiculoService getInstancia(VeiculoDAO veiculoDAO) {
        if (instancia == null) {
            instancia = new VeiculoService(veiculoDAO);
        }
        return instancia;
    }

    public void registrarVeiculo(Veiculo veiculo) {
        veiculoDAO.adicionarVeiculo(veiculo);
    }

    public double calcularDepreciacao(Veiculo veiculo) {
        int idade = 2024 - veiculo.getAnoFabricacao();
        return veiculo.getValorInicial() - (idade * 0.05 * veiculo.getValorInicial());
    }
}

