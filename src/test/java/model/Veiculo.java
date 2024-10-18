package model;

public class Veiculo {
    private int id;
    private String modelo;
    private int anoFabricacao;
    private double valorInicial;

    public Veiculo(String modelo, int anoFabricacao, double valorInicial) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.valorInicial = valorInicial;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public int getAnoFabricacao() { return anoFabricacao; }
    public void setAnoFabricacao(int anoFabricacao) { this.anoFabricacao = anoFabricacao; }
    public double getValorInicial() { return valorInicial; }
    public void setValorInicial(double valorInicial) { this.valorInicial = valorInicial; }
}