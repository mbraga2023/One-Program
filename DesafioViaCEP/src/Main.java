import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            formatarCep();
        } catch (CepInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void formatarCep() throws CepInvalidoException {
        System.out.print("Digite o CEP (8 dígitos sem espaço): ");

        Scanner scanner = new Scanner(System.in);
        String codigoPostal = scanner.nextLine();

        if (codigoPostal.length() < 8) {
            throw new CepInvalidoException("CEP inválido: O CEP deve conter 8 dígitos.");
        }

        // Consulta o CEP, gera e salva o arquivo, etc.
        ConsultaCep consultaCep = new ConsultaCep();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(codigoPostal);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (IOException e) {
            System.out.println("Erro de I/O ao buscar ou salvar o endereço: " + e.getMessage());
        }
    }
}
