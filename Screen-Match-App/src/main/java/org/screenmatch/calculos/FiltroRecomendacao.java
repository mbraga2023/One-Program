package org.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(org.screenmatch.calculos.Classificavel classificavel){
        if(classificavel.getClassificacao() >=4){
            System.out.println("Está entre os preferidos");
        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
