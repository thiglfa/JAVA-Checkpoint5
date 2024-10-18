package mock;

import dao.FuncionarioDAO;
import model.Funcionario;
import model.Sinistro;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAOMock implements FuncionarioDAO {
    private List<Funcionario> funcionarios = new ArrayList<>();
    private List<Sinistro> sinistrosProcessados = new ArrayList<>();

    @Override
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado: " + funcionario.getNome());
    }

    @Override
    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }

    @Override
    public Funcionario buscarFuncionarioPorId(int id) {
        return funcionarios.stream().filter(f -> f.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void atualizarFuncionario(Funcionario funcionario) {
        // Lógica para atualizar funcionário
    }

    @Override
    public void removerFuncionario(int id) {
        funcionarios.removeIf(f -> f.getId() == id); // Remove o funcionário com o ID correspondente
    }

    // Método para adicionar um sinistro processado por um funcionário
    public void adicionarSinistroProcessado(Sinistro sinistro) {
        sinistrosProcessados.add(sinistro);
    }

    // Método para calcular o bônus de um funcionário
    public double calcularBonus(Funcionario funcionario) {
        double bonus = 0.1 * funcionario.getSalario(); // 10% do salário
        // Adicionar um valor adicional por sinistro processado
        bonus += sinistrosProcessados.size() * 50; // R$50 por sinistro processado
        return bonus;
    }
}