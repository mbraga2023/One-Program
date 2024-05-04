package org.alura;

import org.alura.models.Compra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Compra> carrinho = new ArrayList<>();
    private static double saldo = 0;
    private static int contador = 1; // Item counter

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean sair = false;

        while (!sair) {
            System.out.println("MENU");
            System.out.println("1. Cadastrar cartão");
            System.out.println("2. Comprar produto");
            System.out.println("3. Ver extrato");
            System.out.println("4. Sair do programa");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (opcao) {
                case 1:
                    System.out.print("Digite o limite do cartão: ");
                    saldo = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline left-over
                    System.out.println("Cartão cadastrado com sucesso!");
                    break;
                case 2:
                    if (saldo <= 0) {
                        System.out.println("Saldo insuficiente para adicionar produtos ao carrinho.");
                    } else {
                        System.out.print("Digite a descrição do produto: ");
                        String descricaoProduto = scanner.nextLine();
                        System.out.print("Digite o valor do produto: ");
                        double valorProduto = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline left-over

                        if (valorProduto <= saldo) {
                            carrinho.add(new Compra(descricaoProduto, valorProduto));
                            saldo -= valorProduto; // Assuming negative value as purchase
                            System.out.println("Produto adicionado ao carrinho!");
                        } else {
                            System.out.println("Saldo insuficiente para adicionar este produto ao carrinho.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("____________________");
                    System.out.println("Carrinho de compras:");
                    System.out.println("____________________");
                    Collections.sort(carrinho); // Sort the list of purchases based on their prices
                    int counter = 1;
                    for (Compra compra : carrinho) {
                        System.out.println(counter++ + ". " + compra);
                    }
                    System.out.println("Saldo: $" + saldo);
                    break;

                case 4:
                    System.out.println("Saindo do programa...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }

        scanner.close();
    }
}
