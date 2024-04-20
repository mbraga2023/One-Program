package src.main.java.org.alura;

import java.util.Scanner;

public class Bank_v2 {
    public static String menu() {

        return("""
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


    }

    public static void main(String[] args) {
        String name = "Michel";
        String tipoConta = "Conta Corrente";
        int balance = 5000;

        int option;
        Scanner scanner = new Scanner(System.in);

        System.out.println("*******************");
        System.out.println("Correntista: "+ name);
        System.out.println("Tipo Conta: "+ tipoConta);
        System.out.println("Saldo: " + balance);
        System.out.println("*******************");


        while (true) {
            //Menu
            System.out.println(menu());
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
                    System.out.println("Fechando o programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }

        }
    }
}
