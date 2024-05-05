package org.screenmatch;

import org.screenmatch.calculos.FiltroRecomendacao;
import org.screenmatch.modelos.Episodio;
import org.screenmatch.modelos.Filme;
import org.screenmatch.modelos.Serie;

import java.util.Scanner;

public class Principal {
    /*public static void main(String[] args) {
        /*Filme filme1 = new Filme();
        filme1.nome = "Forest Gump";
        filme1.anoDeLancamento = 1994;
        filme1.duracaoEmMinutos = 144;
        filme1.inclusoNoPlano = true;

        Serie serie = new Serie();

        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(serie);
        primeiro.setTotalVisualizacores(300);

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(primeiro);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do filme: ");
        Filme filme2 = new Filme();
        filme2.setNome(scanner.nextLine());
        System.out.print("Digite o ano do filme: ");
        filme2.setAnoDeLancamento(scanner.nextInt());
        System.out.print("Digite a duração do filme (minutos): ");
        filme2.setDuracaoEmMinutos(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Está incluso no plano? (sim/não): ");
        String resposta = scanner.nextLine();

        filme2.setInclusoNoPlano(resposta.equalsIgnoreCase("sim"));

        filme2.avalia();
        System.out.print("Insira outra nota: ");
        filme2.avalia();
        System.out.println("Exibindo a ficha técnica... ");
        filme2.exibirFichaTecnica();

    }*/
}