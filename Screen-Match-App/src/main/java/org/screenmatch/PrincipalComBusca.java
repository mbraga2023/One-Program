package src.main.java.org.screenmatch;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.screenmatch.calculos.FiltroRecomendacao;
import org.screenmatch.modelos.Episodio;
import org.screenmatch.modelos.Filme;
import org.screenmatch.modelos.Serie;
import org.screenmatch.modelos.Titulo;
import src.main.java.org.screenmatch.exceptions.ErroDeConversaoAnoException.ErroDeConversaoAnoException;
import src.main.java.org.screenmatch.modelos.TituloOMDB;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while(!busca.equalsIgnoreCase("sair")){
            System.out.println("Digite um filme para busca: ");
            busca = leitura.nextLine();

            if(busca.equalsIgnoreCase("sair")){
                break;
            }
            try{
                String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ","+") + "&apikey=cdf3ffe";

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);


                TituloOMDB meuTituloOMDB = gson.fromJson(json, TituloOMDB.class);
                System.out.println(meuTituloOMDB);

                //try {
                Titulo meuTitulo = new Titulo(meuTituloOMDB);
                System.out.println("Titulo convertido: " + meuTitulo);

               titulos.add(meuTitulo);

            }catch (NumberFormatException e){
                System.out.println("Um erro aconteceu: " + e.getMessage());
            } catch (IllegalArgumentException e){
                System.out.println("Erro de argumento: " +e.getMessage());
            }catch(ErroDeConversaoAnoException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.txt");
        escrita.write(gson.toJson(titulos));
        escrita.close();


    }
}