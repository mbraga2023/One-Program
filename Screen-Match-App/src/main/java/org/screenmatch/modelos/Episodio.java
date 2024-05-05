package org.screenmatch.modelos;

import org.screenmatch.calculos.Classificavel;
import org.screenmatch.modelos.Serie;

public class Episodio implements Classificavel {

    private int numero;
    private String nome;
    private Serie serie;

    private int totalVisualizacores;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizacores() {
        return totalVisualizacores;
    }

    public void setTotalVisualizacores(int totalVisualizacores) {
        this.totalVisualizacores = totalVisualizacores;
    }

    @Override
    public int getClassificacao() {
        if (totalVisualizacores > 100){
            return 4;
        } else{
            return 2;
        }


    }
}
