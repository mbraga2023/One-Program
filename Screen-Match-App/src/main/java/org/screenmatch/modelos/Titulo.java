package org.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;
import src.main.java.org.screenmatch.exceptions.ErroDeConversaoAnoException.ErroDeConversaoAnoException;
import src.main.java.org.screenmatch.modelos.TituloOMDB;

import java.util.Scanner;

public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean inclusoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes = 0;

    public Titulo(TituloOMDB meuTituloOMDB) {
        this.nome = meuTituloOMDB.title();
        if(meuTituloOMDB.year().length()>4){
            throw new ErroDeConversaoAnoException("Não consegui converter o ano");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOMDB.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOMDB.runtime().substring(0,3));
    }

    public void exibirFichaTecnica(){
        System.out.println("Título: " + nome);
        System.out.println("Ano lançamento: " + anoDeLancamento);

        int horas = duracaoEmMinutos / 60; // Obtém o número de horas
        int minutos = duracaoEmMinutos % 60; // Obtém o número de minutos restantes
        String tempoFormatado = String.format("%02d:%02d", horas, minutos);
        System.out.println("Duração: " + tempoFormatado + "hrs");

        System.out.println("Está no plano: " + (inclusoNoPlano ? "Sim" : "Não"));
        pegaMedia();

    }
    public void avalia(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma nota para o filme: ");
        somaDasAvaliacoes += scanner.nextDouble();
        totalDeAvaliacoes ++;
    }
    public double pegaMedia(){
        double mediaAvaliações = somaDasAvaliacoes / totalDeAvaliacoes;
        System.out.println("Média das avaliações: " + mediaAvaliações);
        return mediaAvaliações;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public boolean isInclusoNoPlano() {
        return inclusoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setInclusoNoPlano(boolean inclusoNoPlano) {
        this.inclusoNoPlano = inclusoNoPlano;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    @Override
    public String toString() {
        return "Titulo " + nome + '\'' +
                ", Ano de Lançamento: " + anoDeLancamento +
                ", Duração em minutos: " + duracaoEmMinutos;
    }
}
