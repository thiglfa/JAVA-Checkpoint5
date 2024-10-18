package model;

public class Sinistro {
    private int id;
    private String tipoEvento;
    private double valorDanos;

    public Sinistro(String tipoEvento, double valorDanos) {
        this.tipoEvento = tipoEvento;
        this.valorDanos = valorDanos;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTipoEvento() { return tipoEvento; }
    public void setTipoEvento(String tipoEvento) { this.tipoEvento = tipoEvento; }
    public double getValorDanos() { return valorDanos; }
    public void setValorDanos(double valorDanos) { this.valorDanos = valorDanos; }
}

