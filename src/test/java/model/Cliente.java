package model;

public class Cliente {
    private int id;
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    // Exemplo de regra de negócio
    public double calcularRisco() {
        // Simples exemplo de cálculo de risco
        return cpf.length() > 10 ? 0.5 : 0.1;
    }
}

