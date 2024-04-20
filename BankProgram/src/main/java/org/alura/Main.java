package org.alura;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name = "Michel";
        int balance = 5000;
        boolean menu = true;
        int option;
        Scanner scanner = new Scanner(System.in);

        System.out.println("*******************");
        System.out.println("Correntista: "+ name);
        System.out.println("Saldo: " + balance);
        System.out.println("*******************");


        while (menu) {
            //Menu
            System.out.print("""
                    =============================
                                Menu
                    =============================
                    Escolha a opção:
                    1 - Depósito
                    2 - Saque
                    3 - Saldo
                    4 - Fechar
                    =============================
                    Opção: """);
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    int depositAmount = scanner.nextInt();
                    balance += depositAmount;
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: ");
                    int withdrawalAmount = scanner.nextInt();
                    if (withdrawalAmount <= balance) {
                        balance -= withdrawalAmount;
                    } else {
                        System.out.println("Saldo insuficiente para realizar o saque.");
                    }
                    break;
                case 3:
                    // Display current balance
                    System.out.println("Saldo: " + balance);
                    break;
                case 4:
                    menu = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        }
        scanner.close();
    }
}
