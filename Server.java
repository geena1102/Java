import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8520);
            System.out.println("Server started, waiting for clients...");

            Socket socket = serverSocket.accept();
            System.out.println("Client connected: " + socket);

            BufferedReader inputReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter outputWriter = new PrintWriter(socket.getOutputStream(), true);

            String fileName = inputReader.readLine();
            System.out.println("Client requested file: " + fileName);

            File file = new File(fileName);
            if (file.exists()) {
                BufferedReader fileReader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = fileReader.readLine()) != null) {
                    outputWriter.println(line);
                }
                fileReader.close();
                System.out.println("File sent successfully");
            } else {
                outputWriter.println("File not found");
                System.out.println("File not found");
            }

            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
