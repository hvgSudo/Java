import java.util.Random;
import java.util.Scanner;
import java.time.*;

public class TokenBucket {
    private int tokens;
    private int time_unit;
    private int forward_callback;
    private int drop_callback;
    private int bucket;
    private LocalTime time;
    TokenBucket(int tokens, int time_unit, int forward_callback, int drop_callback) {
        this.tokens = tokens;
        this.time_unit = time_unit;
        this.forward_callback = forward_callback;
        this.drop_callback = drop_callback;
        this.bucket = tokens;
    }
    static void solution(int bucketSize, int packetSize, int output) {
        int token = bucketSize / output;    
        while (packetSize > output) {
            packetSize = packetSize - output;
            token = token - 1;
        }
    }


    public static void main(String[] args) {
        int output, packetSize, bucketSize, n;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter the bucket size(eg. 512): ");
        bucketSize = sc.nextInt();
        System.out.print("Enter the output rate: ");
        output = sc.nextInt();
        System.out.print("Enter the number of packets: ");
        n = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; ++i) {
            packetSize = rand.nextInt(1000);
            System.out.println("Packet number: "+ i +"\tPacket size = "+ packetSize);
            solution(bucketSize, packetSize, output); 
        }
    }
}
