package org.example;
public class CalculoProdutividade {
    public static void main(String[] args) {
        int[] devs = {2, 3, 4, 1};
        String[] senioridades = {"Junior", "Pleno", "Senior", "LT"};
        int pontosEsforco = 112;

        double pontosPorDia = calcularPontosPorDia(devs, senioridades);
        int prazoEntrega = calcularPrazo(pontosPorDia, pontosEsforco);

        System.out.println("Prazo de entrega: " + prazoEntrega + " dias");
    }

    public static double calcularPontosPorDia(int[] desenvolvedores, String[] senioridades) {
        double pontosPorDia = 0;
        for (int i = 0; i < desenvolvedores.length; i++) {
            int dev = desenvolvedores[i];
            String senioridade = senioridades[i];
            pontosPorDia += dev * getProdutividadePorDia(senioridade);
        }
        return pontosPorDia;
    }

    public static double getProdutividadePorDia(String senioridade) {
        if (senioridade.equals("Junior")) {
            return 1.0 / 14;
        } else if (senioridade.equals("Pleno")) {
            return 2.0 / 7;
        } else if (senioridade.equals("Senior")) {
            return 1.0;
        } else if (senioridade.equals("LT")) {
            return 3.0;
        } else {
            throw new IllegalArgumentException("Senioridade inválida: " + senioridade);
        }
    }

    public static int calcularPrazo(double pontosPorDia, int pontosEsforco) {
        return (int) Math.ceil(pontosEsforco / pontosPorDia);
    }
}
