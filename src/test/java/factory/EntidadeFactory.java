package factory;

import model.*;

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

    public static Veiculo criarVeiculo(String modelo, int ano, double valor) {
        return new Veiculo(modelo, ano, valor);
    }

    public static Sinistro criarSinistro(String tipoEvento, double valorDanos) {
        return new Sinistro(tipoEvento, valorDanos);
    }
}


