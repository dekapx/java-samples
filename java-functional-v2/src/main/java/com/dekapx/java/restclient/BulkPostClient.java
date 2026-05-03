package com.dekapx.java.restclient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.IntStream;

public class BulkPostClient {
    private static final String ENDPOINT = "http://localhost:8081/weather-app/api/v1/sensor";
    private static final HttpClient client = HttpClient.newHttpClient();

    static void main(String[] args) throws Exception {
        List<String> payloads = List.of(
                "{\"sensorId\": \"Sensor-101\",\"temperature\": 25.5,\"humidity\": 60.0,\"windSpeed\": 15.0, \"timestamp\": \"2025-10-05T22:11:41.400Z\"}",
                "{\"sensorId\": \"Sensor-102\",\"temperature\": 28.0,\"humidity\": 55.0,\"windSpeed\": 10.0, \"timestamp\": \"2025-10-05T22:12:41.400Z\"}",
                "{\"sensorId\": \"Sensor-103\",\"temperature\": 22.0,\"humidity\": 65.0,\"windSpeed\": 20.0, \"timestamp\": \"2025-10-05T22:13:41.400Z\"}",
                "{\"sensorId\": \"Sensor-104\",\"temperature\": 30.0,\"humidity\": 50.0,\"windSpeed\": 5.0, \"timestamp\": \"2025-10-05T22:14:41.400Z\"}",
                "{\"sensorId\": \"Sensor-105\",\"temperature\": 27.0,\"humidity\": 58.0,\"windSpeed\": 12.0, \"timestamp\": \"2025-10-05T22:15:41.400Z\"}"
        );

        IntStream.rangeClosed(0, 100).forEach(i -> {
            List<CompletableFuture<String>> futures = payloads.stream()
                    .map(p -> postAsync(ENDPOINT, p))
                    .toList();

            CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();
        });

    }

    public static CompletableFuture<String> postAsync(String url, String jsonBody) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();

        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(response -> response.statusCode() + ": " + response.body())
                .exceptionally(e -> "Error: " + e.getMessage());
    }
}
