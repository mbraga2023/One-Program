package org.example;

public class Primo {
    public static void main(String[] args) {
        mostrarPrimosNoIntervalo(10, 50);
    }

    public static void mostrarPrimosNoIntervalo(int inicio, int fim) {
        if (inicio > fim) {
            System.out.println("Intervalo errado: o primeiro número deve ser menor que o segundo.");
            return;
        }

        System.out.println("Números primos entre " + inicio + " e " + fim + ":");
        for (int i = inicio; i <= fim; i++) {
            if (isPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
