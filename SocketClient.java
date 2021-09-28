import java.net.*;
import java.io.*;
import java.util.Scanner;

public class SocketClient {
    // initialize socket and input output streams
    private Socket socket = null;
    private DataInputStream input = null;
    private Scanner sc = new Scanner(System.in);
    private DataOutputStream out = null;

    // constructor to put IP address and port
    public SocketClient(String address, int port) {
        // establish a connection
        try {
            socket = new Socket(address, port);
            System.out.println("Connected");

            // input from terminal
            input = new DataInputStream(System.in);
            
            // sending output to hte socket
            out = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException u) {
            System.out.println(u);
        } catch (IOException i) {
            System.out.println(i);
        }

        // String to read message from input tab
        String line = "";

        // keep reading until "Over" comes
        while (!line.equals("Over")) {
            try {
                // line = input.readLine();
                line = sc.nextLine();
                out.writeUTF(line);
            } catch (IOException i) {
                System.out.println(i);
            }
        }

        // Close the connection
        try { 
            input.close();
            out.close();
            socket.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    // Main method
    public static void main(String[] args) {
        SocketClient client = new SocketClient("127.0.0.1", 5000);
    }
}
