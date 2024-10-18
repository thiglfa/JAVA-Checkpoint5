package mock;

import dao.SeguroDAO;
import model.Seguro;

import java.util.ArrayList;
import java.util.List;

public class SeguroDAOMock implements SeguroDAO {
    private List<Seguro> seguros = new ArrayList<>();

    @Override
    public void adicionarSeguro(Seguro seguro) {
        seguros.add(seguro);
        System.out.println("Seguro adicionado: " + seguro);
    }

    @Override
    public List<Seguro> listarSeguros() {
        return seguros;
    }

    @Override
    public Seguro buscarSeguroPorId(int id) {
        return seguros.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void atualizarSeguro(Seguro seguro) {
        // Lógica para atualizar seguro
    }

    @Override
    public void removerSeguro(int id) {
        // Lógica para remover seguro
    }
}
