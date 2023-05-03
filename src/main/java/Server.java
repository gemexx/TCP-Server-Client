import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        Auto auto = new Auto(100, 3000, 50, 30, 120, 3, 10000, 99999, 1, "E-3213213;O-23113321", "Top", "gut", 499, 1701, 300, 5);

        // Server erstellen auf TCP Port 3000
        ServerSocket serverSocket = new ServerSocket(3000);
        System.out.println("Server erstellt auf port 3000");

        // Auf Client Anfrage warten und sofort annehmen
        // Wartet solange bis ein Client sich mit dem PORT 3000 verbindet, danach gibt er einen Handshake
        // (Der server schreibt das der Client sich mit ihm verbunden hat)
        Socket socket = serverSocket.accept();
        System.out.println("User Anfrage angenommen");

        // Input von Client (Das was vom Client zum Server gesendet wird)
        InputStream stream = socket.getInputStream();
        BufferedReader inputBuffer = new BufferedReader(new InputStreamReader(stream));
        //Der PrinterWriter hier ist der Sender an den Client
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

        // Die neuste Zeile vom Client lesen
        // Das readLine wartet solange bis der Server vom Client eine nachricht empfängt
        if (!inputBuffer.readLine().equals("request_auto_daten")) {
            socket.close();
            return;
        }

        writer.println(auto.toJson());
    }
}
