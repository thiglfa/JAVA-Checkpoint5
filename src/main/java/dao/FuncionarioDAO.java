package dao;
import model.Funcionario;

import java.util.List;

public interface FuncionarioDAO {
    void adicionarFuncionario(Funcionario funcionario);
    Funcionario buscarFuncionarioPorId(int id);
    List<Funcionario> listarFuncionarios();
    void atualizarFuncionario(Funcionario funcionario);
    void removerFuncionario(int id);
}