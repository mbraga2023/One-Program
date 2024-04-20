package org.example;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class JogoNumeroSecreto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroSecreto = new Random().nextInt(100
        );
        int numeroChute = 0;
        int numeroTentativas = 0;

        System.out.println("""
                ============= JOGO DO NÚMERO SECRETO =============
                
                Advinhe o número secreto em até 10 tentativas
                
                ==================================================
                
                """);


        while (numeroTentativas < 10 && numeroChute != numeroSecreto){
            System.out.print("Digite um número de 0 a 100: ");
            numeroChute = scanner.nextInt();

            if(numeroChute<numeroSecreto){
                System.out.println("Número chute menor que o número secreto.");
            }
            if(numeroChute>numeroSecreto){
                System.out.println("Número do chute maior que o número secreto.");

            }
            numeroTentativas++;
        }
        if (numeroTentativas < 10) {
            System.out.println("Você acertou!");
            System.out.println("Tentativas: " + numeroTentativas);
        } else {
            System.out.println("Você perdeu! Não conseguiu advinhar o número. O número secreto é " + numeroSecreto);
            System.out.println("Tentativas: " + numeroTentativas);

        }

        }


}