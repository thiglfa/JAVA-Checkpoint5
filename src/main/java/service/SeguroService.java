package service;

import dao.SeguroDAO;
import model.Seguro;

public class SeguroService {
    private static SeguroService instancia;
    private SeguroDAO seguroDAO;

    public SeguroService(SeguroDAO seguroDAO) {
        this.seguroDAO = seguroDAO;
    }

    public static SeguroService getInstancia(SeguroDAO seguroDAO) {
        if (instancia == null) {
            instancia = new SeguroService(seguroDAO);
        }
        return instancia;
    }

    public void registrarSeguro(Seguro seguro) {
        seguroDAO.adicionarSeguro(seguro);
    }
}



