package model;

public class Seguro {
    private int id;
    private Cliente cliente;
    private Veiculo veiculo;
    private double valorSeguro;

    public Seguro(Cliente cliente, Veiculo veiculo) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.valorSeguro = calcularValorSeguro();
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public Veiculo getVeiculo() { return veiculo; }
    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }

    // Exemplo de regra de negócio
    private double calcularValorSeguro() {
        return veiculo.getValorInicial() * cliente.calcularRisco();
    }

    public boolean cobreEvento(String tipoEvento) {
        // Exemplo simples de cobertura
        return tipoEvento.equalsIgnoreCase("acidente");
    }
}

