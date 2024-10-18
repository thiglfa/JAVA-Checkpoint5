package service;

import dao.ClienteDAO;
import model.Cliente;

public class ClienteService {
    private static ClienteService instancia;
    private ClienteDAO clienteDAO;

    public ClienteService(ClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    public static ClienteService getInstancia(ClienteDAO clienteDAO) {
        if (instancia == null) {
            instancia = new ClienteService(clienteDAO);
        }
        return instancia;
    }

    public void registrarCliente(Cliente cliente) {
        clienteDAO.adicionarCliente(cliente);
    }
}


