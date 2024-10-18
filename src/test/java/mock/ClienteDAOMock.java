package mock;

import dao.ClienteDAO;
import model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAOMock implements ClienteDAO {
    private List<Cliente> clientes = new ArrayList<>();
    private int idCounter = 1;

    @Override
    public void adicionarCliente(Cliente cliente) {
        cliente.setId(idCounter++);
        clientes.add(cliente);
        System.out.println("Cliente adicionado: " + cliente.getNome());
    }

    @Override
    public Cliente buscarClientePorId(int id) {
        return clientes.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Cliente> listarClientes() {
        return clientes;
    }

    @Override
    public void atualizarCliente(Cliente cliente) {
        // Implementar lógica de atualização
    }

    @Override
    public void removerCliente(int id) {
        // Implementar lógica de remoção
    }
}

// Faça o mesmo para as classes SeguroDAOMock, FuncionarioDAOMock, VeiculoDAOMock, SinistroDAOMock

