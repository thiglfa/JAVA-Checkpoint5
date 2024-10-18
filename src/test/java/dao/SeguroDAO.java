package dao;

import model.Seguro;

import java.util.List;

public interface SeguroDAO {
    void adicionarSeguro(Seguro seguro);
    Seguro buscarSeguroPorId(int id);
    List<Seguro> listarSeguros();
    void atualizarSeguro(Seguro seguro);
    void removerSeguro(int id);
}

