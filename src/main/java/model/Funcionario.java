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

    // Métodos getters e setters

    public void aumentarSalario(double percentual) {
        this.salario += this.salario * percentual / 100;
    }

    public double calcularBonus() {
        return this.salario * 0.10;
    }
}

