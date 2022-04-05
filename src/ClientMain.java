import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientMain {

    public static void main(String[] args) {

        try(Socket clientSocket = new Socket("netology.homework", 8081);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            String question1 = in.readLine();
            System.out.println(question1);
            out.println("Netology");

            String question2 = in.readLine();
            System.out.println(question2);
            out.println("yes");

            String resp = in.readLine();
            System.out.println(resp);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
