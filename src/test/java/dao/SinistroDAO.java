package dao;

import model.Sinistro;

import java.util.List;

public interface SinistroDAO {
    void adicionarSinistro(Sinistro sinistro);
    Sinistro buscarSinistroPorId(int id);
    List<Sinistro> listarSinistros();
    void atualizarSinistro(Sinistro sinistro);
    void removerSinistro(int id);
}

