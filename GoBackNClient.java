import java.io.*;
import java.net.*;
import java.util.*;
import java.math.*;

public class GoBackNClient {
    public static void main(String[] args) throws IOException {
        InetAddress addr = InetAddress.getByName("Localhost");
        System.out.println(addr);
        Socket connection = new Socket(addr, 500);
        DataInputStream in = new DataInputStream(connection.getInputStream());
        DataOutputStream out = new DataOutputStream(connection.getOutputStream());
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t Client");
        System.out.println("Connect");
        System.out.println("Enter the number of frames to be requested to the server: ");
        int c = sc.nextInt();
        out.write(c);
        out.flush();
        System.out.println("Enter the type of transmission\nError = 1\nNo-Error = 0");
        int choice = sc.nextInt();
        out.write(choice);
        int check = 0, i = 0, j = 0;
        if (choice == 0) {
            for (j = 0; j < c; ++j) {
                i = in.read();
                System.out.println("Received frame number: "+ i);
                System.out.println("Sending ackowledgement for frame number: "+ i);
                out.write(i);
                out.flush();
            }
            out.flush();
        } else {
            for (j = 0; j < c; ++j) { 
                i = in.read();
                if (i == check) {
                    System.out.println("i = "+ i +" check = "+ check);
                    System.out.println("Received frame number = "+ i);
                    System.out.println("Sending ackowledgement for fram number = "+ i);
                    out.write(i);
                    ++check;
                } else {
                    --j;
                    System.out.println("Discarded frame number: "+ i);
                }
            }
        }
    }
}