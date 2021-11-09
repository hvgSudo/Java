import java.io.*;
import java.net.*;
import java.util.*;

public class GoBackNServer {
    public static void main(String[] args) throws IOException {
        System.out.println("\t\t Server");
        System.out.println("\tWaiting for connection");
        InetAddress addr = InetAddress.getByName("Localhost");
        ServerSocket ss = new ServerSocket(500);
        Socket client = new Socket();
        client = ss.accept();
        DataInputStream in = new DataInputStream(client.getInputStream());
        DataOutputStream out = new DataOutputStream(client.getOutputStream());
        System.out.println("Received request for sending frames");
        int p = in.read();
        boolean f[] = new boolean[p];
        int pc = in.read();
        System.out.println("Sending");
        if (pc == 0) {
            for (int i = 0; i < p; ++i) {
                System.out.println("Sending frame number "+ (i+1));
                out.write(i);
                out.flush();
                System.out.println("Waiting for acknowledgement");
                try {
                    Thread.sleep(3000);
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                }
                int a = in.read();
                System.out.println("Received ackowledgement for frame = "+ i +" as "+ a);
            }
            out.flush();
        } else {
            for (int i = 0; i < p; ++i) {
                if (i == 2) {
                    System.out.println("Reading frame number: "+ i);
                } else {
                    System.out.println("Sending frame number: "+ i);
                    out.write(i);
                    out.flush();
                    System.out.println("Waiting for acknowledgement.");
                    try {
                        Thread.sleep(3000);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    int a = in.read();
                    if (a != 255) {
                        System.out.println("Received acknowledgement for frame number: "+ i +" as "+ a);
                        f[i] = true;
                    }
                }
            }
            for (int a = 0; a < p; ++a) {
                if (f[a] == false) {
                    System.out.println("Resending frame: "+ a);
                    out.write(a);
                    out.flush();
                    System.out.println("Waiting for acknowledgement");
                    try {
                        Thread.sleep(3000);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    int b = in.read();
                    System.out.println("Received Acknowledgement for frame number: "+ a +" as "+ b);
                    f[a] = true;
                }
            }
            out.flush();
        }
        in.close();
        out.close();
        System.out.println("Quiting");
    }
}