package service;

import dao.FuncionarioDAO;
import model.Funcionario;

public class FuncionarioService {
    private static FuncionarioService instancia;
    private static FuncionarioDAO funcionarioDAO;

    public FuncionarioService(FuncionarioDAO funcionarioDAO) {
        this.funcionarioDAO = funcionarioDAO;
    }

    public static FuncionarioService getInstancia(FuncionarioDAO funcionarioDAO) {
        if (instancia == null) {
            instancia = new FuncionarioService(funcionarioDAO);
        }
        return instancia;
    }

    public static void registrarFuncionario(Funcionario funcionario) {
        funcionarioDAO.adicionarFuncionario(funcionario);
        System.out.println("Funcionários registrados: " + funcionario.getNome());
    }

    public double calcularBonus(Funcionario funcionario) {
        double bonus = funcionario.calcularBonus();
        System.out.println("Bônus do funcionário " + funcionario.getNome() + ": " + bonus);
        return bonus;
    }
}


