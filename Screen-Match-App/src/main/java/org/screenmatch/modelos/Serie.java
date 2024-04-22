package org.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean isActive;
    private int episodios;
    private int minutosPorEpisodios;
    private int episodiosPorTemporada;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getMinutos() {
        return minutosPorEpisodios;
    }

    public void setMinutos(int minutos) {
        this.minutosPorEpisodios = minutos;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodiosPorTemporada * minutosPorEpisodios;
    }
}
