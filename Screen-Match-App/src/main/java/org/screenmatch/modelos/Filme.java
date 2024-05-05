package org.screenmatch.modelos;

import org.screenmatch.calculos.Classificavel;
import org.screenmatch.modelos.Titulo;
import src.main.java.org.screenmatch.modelos.TituloOMDB;


public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public Filme(TituloOMDB meuTituloOMDB) {
        super(meuTituloOMDB);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;
    }
}
