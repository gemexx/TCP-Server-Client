import com.google.gson.Gson;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("127.0.0.1", 3000)) {
            // Writer zum Server
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            // Anfrage zum Server senden(z.B. Die Fahrzeug Daten)
            writer.println("request_auto_daten");

            // Output reader vom Server (Das was man vom Server gesendet bekommt)
            InputStream inputStream = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            //Das hier ist der Json String die lange Zeichenkette von Auto
            String jsonResponse = reader.readLine();
            //Hier transformiert er aus der Zeichenkette wieder eine Auto instanz
            Auto serverAuto = (new Gson()).fromJson(jsonResponse, Auto.class);
            // Beispiel auslesen Drehzahl
            System.out.println(serverAuto.getDrehzahl());

        }
    }
}
