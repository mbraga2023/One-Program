package org.screenmatch;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        /*Filme filme1 = new Filme();
        filme1.nome = "Forest Gump";
        filme1.anoDeLancamento = 1994;
        filme1.duracaoEmMinutos = 144;
        filme1.inclusoNoPlano = true;*/

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

        if (resposta.equalsIgnoreCase("sim")) {
            filme2.setInclusoNoPlano(true);
        } else {
            filme2.setInclusoNoPlano(false);
        }
        filme2.avalia();
        System.out.print("Insira outra nota: ");
        filme2.avalia();
        System.out.println("Exibindo a ficha técnica... ");
        filme2.exibirFichaTecnica();

    }
}