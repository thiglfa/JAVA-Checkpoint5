package service;

import dao.SinistroDAO;
import model.Sinistro;

public class SinistroService {
    private static SinistroService instancia;
    private SinistroDAO sinistroDAO;

    public SinistroService(SinistroDAO sinistroDAO) {
        this.sinistroDAO = sinistroDAO;
    }

    public static SinistroService getInstancia(SinistroDAO sinistroDAO) {
        if (instancia == null) {
            instancia = new SinistroService(sinistroDAO);
        }
        return instancia;
    }

    public void registrarSinistro(Sinistro sinistro) {
        sinistroDAO.adicionarSinistro(sinistro);
    }

    public double calcularIndenizacao(Sinistro sinistro) {
        return sinistro.getValorDanos() * 0.90; // Exemplo de cálculo de 90% de indenização
    }
}

