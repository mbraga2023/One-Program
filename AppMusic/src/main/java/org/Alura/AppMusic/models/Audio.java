package org.Alura.AppMusic.models;

public class Audio {
    private String titulo;
    private int duracaoEmMinutos;
    private int totalDeReproducoes;
    private int totalCurtidas;
    private double classificacao;

    public void curtir(){
        this.totalCurtidas++;

    }

    public void reproduzir(){
        this.totalDeReproducoes++;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getCurtidas() {
        return totalCurtidas;
    }

    public void setCurtidas(int curtidas) {
        this.totalCurtidas = curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = Double.parseDouble(classificacao);
    }
}
