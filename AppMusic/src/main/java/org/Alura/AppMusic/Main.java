package org.Alura.AppMusic;

import org.Alura.AppMusic.models.Musica;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Musica> listaDeMusicas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("MusicFy");

        boolean exit = false;

        while (!exit) {
            displayMenu();
            int menu = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (menu) {
                case 1:
                    cadastrarMusica();
                    break;
                case 2:
                    // Code for option 2 (Cadastrar Podcast)
                    break;
                case 3:
                    ouvirMusica();
                    break;
                case 4:
                    verFichaMusica();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Saindo do MusicFy...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("""
                Selecione uma opção: 
                1 - Cadastrar Música
                2 - Cadastrar Podcast 
                3 - Ouvir Música / Podcast
                4 - Ver ficha música ou podcast
                5 - Sair""");
    }

    private static void cadastrarMusica() {
        Musica newMusic = new Musica();

        System.out.print("Digite o título da música: ");
        String titulo = scanner.nextLine();
        newMusic.setTitulo(titulo);

        System.out.print("Digite o nome do artista: ");
        String autor = scanner.nextLine();
        newMusic.setArtista(autor);

        System.out.print("Digite o gênero: ");
        String genero = scanner.nextLine();
        newMusic.setGenero(genero);

        listaDeMusicas.add(newMusic);
    }

    private static void ouvirMusica() {
        System.out.println("Lista de músicas registradas:");
        for (int i = 0; i < listaDeMusicas.size(); i++) {
            Musica musica = listaDeMusicas.get(i);
            System.out.println(i + 1 + ". " + musica.getTitulo());
        }

        System.out.print("Escolha uma música pelo índice:");
        int chosenIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (chosenIndex >= 1 && chosenIndex <= listaDeMusicas.size()) {
            Musica chosenMusic = listaDeMusicas.get(chosenIndex - 1);
            System.out.println("Tocando música: " + chosenMusic.getTitulo());
            chosenMusic.reproduzir();
            System.out.print("Curtiu? (sim ou não)");
            String likeChoice = scanner.nextLine();
            if (likeChoice.equalsIgnoreCase("sim")) {
                chosenMusic.curtir();
            } else if (!likeChoice.equalsIgnoreCase("não")) {
                System.out.println("Opção inválida.");
            }
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private static void verFichaMusica() {
        System.out.println("Lista de músicas registradas:");
        for (int i = 0; i < listaDeMusicas.size(); i++) {
            Musica musica = listaDeMusicas.get(i);
            System.out.println(i + 1 + ". " + musica.getTitulo());
        }

        System.out.print("Escolha uma música pelo índice:");
        int chosenIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (chosenIndex >= 1 && chosenIndex <= listaDeMusicas.size()) {
            Musica chosenMusic = listaDeMusicas.get(chosenIndex - 1);
            System.out.println("Informações da música escolhida:");
            System.out.println("Título: " + chosenMusic.getTitulo());
            System.out.println("Artista: " + chosenMusic.getArtista());
            System.out.println("Gênero: " + chosenMusic.getGenero());
            System.out.println("Curtidas: " + chosenMusic.getCurtidas());
            System.out.println("Reproduções: " + chosenMusic.getTotalDeReproducoes());
        } else {
            System.out.println("Índice inválido.");
        }
    }
}
