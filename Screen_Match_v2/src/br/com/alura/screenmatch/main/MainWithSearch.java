package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.catalog.Titles;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.*;
import java.util.Scanner;

public class MainWithSearch {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Search a movie: ");

        var search = scanner.nextLine();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://www.omdbapi.com/?t=" + search + "&apikey=eeac376e"))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        Gson gson = new Gson();
        Titles myTitle = gson.fromJson(response.body(), Titles.class);
        System.out.println("\nTitle: " + myTitle.getName());
        System.out.println("Year Released: " + myTitle.getYearReleased());
        System.out.println("\n" + myTitle);
    }
}