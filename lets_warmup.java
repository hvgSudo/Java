import java.util.*;
public class lets_warmup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = (2 * n) - 1;
        int y = (4 * n) - 1;
        int w = 96, m = n;
        in.close();
        System.out.println("-----c-----");
        System.out.println("---c-b-c---");
        System.out.println("-c-b-a-b-c-");
        System.out.println("---c-b-c---");
        System.out.println("-----c-----");
        System.out.println();
        System.out.println();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (j < y / 2) {
                    System.out.print("-");
                }
                else if (j > y / 2) {
                    System.out.print("-");
                }
                else {
                    System.out.print((char)(w+n));
                }
            }
            System.out.println();
            for (int k = i + 1; k < y; k++) {
                if (m > 96) {
                    if (k < y / 2 - i) {
                        System.out.print("-");
                    }
                    else if (k > y / 2 + i) {
                        System.out.print("-");
                    }
                    else if (k == y / 2) {
                        System.out.println();
                    }
                    else {
                        System.out.print((char)(w + m));
                        m = m - 1;
                    }
                }
            }
        }
    }
}