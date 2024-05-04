package org.alura.models;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return descricao + ": $" + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        // Compare based on the price (valor) of the purchases
        return Double.compare(this.valor, outraCompra.valor);
    }
}
