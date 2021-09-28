import java.net.*;

import jdk.net.Sockets;

import java.io.*;

public class SocketServer {
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;

    // Constructor with port
    public SocketServer(int port) {
        // starts server and waits for a connection
        try {
            server = new ServerSocket(port);
            System.out.println("Server started");

            System.out.println("Waiting for a client.....");
            socket = server.accept();
            System.out.println("Client accepted");

            // taking input from client socket
            in = new DataInputStream(
                new BufferedInputStream(socket.getInputStream()));
            
            String line = "";
            
            // reading message from client until "Over" appears
            while (!line.equals("Over")) {
                try {
                    line = in.readUTF(); 
                    System.out.println(line);
                } catch (IOException i) {
                    System.out.println(i);
                }
            }

            System.out.println("Closing connection");

            // close connection
            socket.close();
            in.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    // Main method
    public static void main(String[] args) {
        SocketServer server = new SocketServer(5000);
    }
}