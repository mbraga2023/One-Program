package org.alura.models;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();

    }

    public boolean lancaComra(Compra compra){
        if(this.saldo>compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
        return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }
}
