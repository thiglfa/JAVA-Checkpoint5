package model;

public class Funcionario {
    private static int contadorId = 1; // Variável para gerar IDs automaticamente
    private int id;
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.id = contadorId++; // Atribui e incrementa o ID automaticamente
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    // Exemplo de regra de negócio
    public void aumentarSalario(double percentual) {
        this.salario += this.salario * percentual / 100;
    }

    public double calcularBonus() {
        return this.salario * 0.10; // Exemplo de cálculo de bônus de 10%
    }
    @Override
    public String toString() {
        return "Funcionario [ID: " + id +
                ", Nome: " + nome +
                ", Cargo: " + cargo +
                ", Salário: " + salario + "]";
    }
}