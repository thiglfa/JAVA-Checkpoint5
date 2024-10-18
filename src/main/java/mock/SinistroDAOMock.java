package mock;

import dao.SinistroDAO;
import model.Sinistro;

import java.util.ArrayList;
import java.util.List;

public class SinistroDAOMock implements SinistroDAO {
    private List<Sinistro> sinistros = new ArrayList<>();

    @Override
    public void adicionarSinistro(Sinistro sinistro) {
        sinistros.add(sinistro);
        System.out.println("Sinistro adicionado: " + sinistro.getTipoEvento());
    }

    @Override
    public List<Sinistro> listarSinistros() {
        return sinistros;
    }

    @Override
    public Sinistro buscarSinistroPorId(int id) {
        return sinistros.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void atualizarSinistro(Sinistro sinistro) {
        // Lógica para atualizar sinistro
    }

    @Override
    public void removerSinistro(int id) {
        // Lógica para remover sinistro
    }
}
