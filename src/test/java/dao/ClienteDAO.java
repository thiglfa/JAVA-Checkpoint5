package dao;
import model.Cliente;

import java.util.List;

public interface ClienteDAO {
    void adicionarCliente(Cliente cliente);
    Cliente buscarClientePorId(int id);
    List<Cliente> listarClientes();
    void atualizarCliente(Cliente cliente);
    void removerCliente(int id);
}
