package org.example;
import mock.*;
import model.*;
import service.*;
import factory.*;

public class Main {
    public static void main(String[] args) {
        // Criar instâncias das classes Mock
        ClienteDAOMock clienteDAOMock = new ClienteDAOMock();
        SeguroDAOMock seguroDAOMock = new SeguroDAOMock();
        FuncionarioDAOMock funcionarioDAOMock = new FuncionarioDAOMock();
        VeiculoDAOMock veiculoDAOMock = new VeiculoDAOMock();
        SinistroDAOMock sinistroDAOMock = new SinistroDAOMock();

        // Criar instâncias dos serviços, passando as classes Mock
        ClienteService clienteService = new ClienteService(clienteDAOMock);
        SeguroService seguroService = new SeguroService(seguroDAOMock);
        FuncionarioService funcionarioService = new FuncionarioService(funcionarioDAOMock);
        VeiculoService veiculoService = new VeiculoService(veiculoDAOMock);
        SinistroService sinistroService = new SinistroService(sinistroDAOMock);

        // Criar objetos para testar
        Cliente cliente = EntidadeFactory.criarCliente("João Silva", "123.456.789-00");
        Veiculo veiculo = EntidadeFactory.criarVeiculo("Fusca", 1970, 10000);
        Funcionario funcionario = EntidadeFactory.criarFuncionario("Maria Souza", "Corretora", 3000);
        Sinistro sinistro = EntidadeFactory.criarSinistro("Acidente na estrada", 5000);

        // Testar o registro de clientes
        clienteService.registrarCliente(cliente);
        System.out.println("Clientes registrados: " + clienteDAOMock.listarClientes().size());

        // Testar o registro de veículos
        veiculoService.registrarVeiculo(veiculo);
        System.out.println("Veículos registrados: " + veiculoDAOMock.listarVeiculos().size());

        // Testar o registro de seguros
        Seguro seguro = EntidadeFactory.criarSeguro(cliente, veiculo);
        seguroService.registrarSeguro(seguro);
        System.out.println("Seguros registrados: " + seguroDAOMock.listarSeguros().size());

        // Testar o registro de funcionários
        FuncionarioService.registrarFuncionario(funcionario);
        System.out.println("Funcionários registrados: " + funcionarioDAOMock.listarFuncionarios().size());


        // Testar o registro de sinistros
        sinistroService.registrarSinistro(sinistro);
        System.out.println("Sinistros registrados: " + sinistroDAOMock.listarSinistros().size());

        // Testar o cálculo de bônus do funcionário
        double bonus = funcionarioService.calcularBonus(funcionario);
        System.out.println("Bônus calculado para " + funcionario.getNome() + ": " + bonus);

        // Testar o cálculo de indenização do sinistro
        double indenizacao = sinistroService.calcularIndenizacao(sinistro);
        System.out.println("Indenização calculada para sinistro: " + indenizacao);
    }
}
