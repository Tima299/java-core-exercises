package chatbot;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Main {
    private static final int MAX_RETRIES = 3;
    private static final int RETRY_DELAY = 3000;

    public static void main(String[] args) {
        System.out.println("Chatbot: Hello! I am your assistant. Type 'bye' to exit.");
        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {
            System.out.print("You: ");
            userInput = scanner.nextLine();

            if ("bye".equalsIgnoreCase(userInput.trim())) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }

            String botResponse = getChatbotResponse(userInput);
            System.out.println("Chatbot: " + botResponse);
        }

        scanner.close();
    }

    private static String getChatbotResponse(String userMessage) {
        int attempts = 0;

        while (attempts < MAX_RETRIES) {
            try {
                HttpURLConnection connection = createConnection();
                sendRequest(connection, userMessage);

                int responseCode = connection.getResponseCode();
                if (responseCode == 200) {
                    return readResponse(connection);
                } else if (responseCode == 429) {
                    System.out.println("Rate limit exceeded. Retrying...");
                    Thread.sleep(RETRY_DELAY);
                } else {
                    return "Error: Received response code " + responseCode + ".";
                }
            } catch (Exception e) {
                System.err.println("An error occurred: " + e.getMessage());
                e.printStackTrace();
            }
            attempts++;
        }

        return "Failed after multiple attempts. Please try again later.";
    }

    private static HttpURLConnection createConnection() throws Exception {
        URL url = new URL(API_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Authorization", "Bearer " + API_KEY);
        connection.setDoOutput(true);
        return connection;
    }

    private static void sendRequest(HttpURLConnection connection, String userMessage) throws Exception {
        String payload = "{ \"inputs\": \"" + userMessage + "\" }";

        try (OutputStream os = connection.getOutputStream()) {
            os.write(payload.getBytes());
            os.flush();
        }
    }

    private static String readResponse(HttpURLConnection connection) throws Exception {
        StringBuilder response = new StringBuilder();

        try (Scanner scanner = new Scanner(connection.getInputStream())) {
            while (scanner.hasNextLine()) {
                response.append(scanner.nextLine());
            }
        }

        return response.toString();
    }
}
