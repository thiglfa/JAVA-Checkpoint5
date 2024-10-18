package model;

public class Funcionario {
    private int id;
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    // Exemplo de regra de negócio
    public void aumentarSalario(double percentual) {
        this.salario += this.salario * percentual / 100;
    }

    public double calcularBonus() {
        return this.salario * 0.10; // Exemplo de cálculo de bônus de 10%
    }
}
