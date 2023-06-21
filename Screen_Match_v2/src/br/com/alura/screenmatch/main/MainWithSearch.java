package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.catalog.TitleOMBd;
import br.com.alura.screenmatch.catalog.Titles;
import br.com.alura.screenmatch.myexceptions.YearConversionErrorException;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        String search = "";

        List<Titles> titles = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!search.equalsIgnoreCase("leave")) {
            System.out.print("\nSearch a movie: ");
            search = scanner.nextLine();
            search = search.replaceAll(" ", "+");
            if (search.equalsIgnoreCase("leave")) {
                break;
            }

            try {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("http://www.omdbapi.com/?t=" + search + "&apikey=eeac376e"))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());


                TitleOMBd myTitleOMBd = gson.fromJson(response.body(), TitleOMBd.class);
                System.out.println("\n" + myTitleOMBd);

                Titles myTitle = new Titles(myTitleOMBd);
                System.out.println("\n" + myTitle);

                titles.add(myTitle);

            } catch (NumberFormatException e) {
                System.out.print("ERROR! ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid URL! Try again");
                System.out.println(e.getMessage());
            } catch (YearConversionErrorException e) {
                System.out.println(e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("Movie not found!");
            }
        }
        System.out.println(titles);

        FileWriter write = new FileWriter("D:\\Alura\\Formação - Java\\Screen_Match_v2\\json\\movies.json");
        write.write(gson.toJson(titles));
        write.close();

        System.out.println("\nFinalizing");
    }
}
