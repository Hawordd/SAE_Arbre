package com.requete.arbre;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class testRequete {

    public static void main(String[] args) {
        try {
            // Construire l'URL de la requête
            String apiKey = "YOUR-API-KEY"; // Remplacez par votre clé d'API
            String requestUrl = "https://api.rawg.io/api/games?key=" + apiKey;

            // Envoyer la requête HTTP GET
            URL url = new URL(requestUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Lire la réponse
            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                JsonNode resultsNode = getJsonNode(con);
                if (resultsNode != null) {
                    for (JsonNode gameNode : resultsNode) {
                        String gameName = gameNode.get("name").asText();
                        double rating = gameNode.get("rating").asDouble();
                        System.out.println("Nom du jeu : " + gameName + ", Note : " + rating);
                    }
                }
            } else {
                System.out.println("Erreur de requête : " + responseCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static JsonNode getJsonNode(HttpURLConnection con) throws IOException {
        Scanner scanner = new Scanner(con.getInputStream());
        StringBuilder responseBody = new StringBuilder();
        while (scanner.hasNextLine()) {
            responseBody.append(scanner.nextLine());
        }
        scanner.close();

        // Analyser la réponse JSON avec Jackson
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(responseBody.toString());

        // Extraire les données souhaitées
        JsonNode resultsNode = rootNode.get("results");
        return resultsNode;
    }
}