import java.io.*;
import java.net.*;

public class SelectiveRepeatServer {
    private static SocketServer server;
    private static DataInputStream dis;
    private static DataOutputStream dos;

    public static void main(String[] args) throws SocketException {
        try {
            int a[] = {30, 40, 50, 60, 70, 80, 90, 100};
            // calling the constructor of Socket to activate the server
            // written in SocketServer program
            server = new SocketServer(8011); 
            System.out.println("Waiting for connection");
            Socket client = SocketServer.accept();
            dis = new DataInputStream(client.getInputSteam());
        }
    }
}
