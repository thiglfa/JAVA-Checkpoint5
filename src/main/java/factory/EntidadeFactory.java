package factory;

import model.Cliente;
import model.Funcionario;
import model.Seguro;
import model.Veiculo;

public class EntidadeFactory {
    public static Cliente criarCliente(String nome, String cpf) {
        return new Cliente(nome, cpf);
    }

    public static Seguro criarSeguro(Cliente cliente, Veiculo veiculo) {
        return new Seguro(cliente, veiculo);
    }

    public static Funcionario criarFuncionario(String nome, String cargo, double salario) {
        return new Funcionario(nome, cargo, salario);
    }
}

