import java.util.Scanner;
import java.lang.Math;
public class K_Chess {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while ( T > 0 ) {
            int k = 0;
            int n = sc.nextInt();
            int[] x = new int[n];
            int[] y = new int[n];
            int a, b, c = 0;

            for (int i = 0; i < n; i ++) {
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
            }

            a = sc.nextInt();
            b = sc.nextInt();

            int kingx[] = {a, a - 1, a - 1, a - 1, a, a + 1, a + 1, a + 1, a};
            int kingy[] = {b, b - 1, b, b + 1, b + 1, b + 1, b, b - 1, b - 1};

            while ( k < 9 ) {
                for (int i = 0; i < n; i ++) {
                    if ((Math.abs(kingx[k] - x[i]) == 1 && Math.abs(kingy[k] - y[i]) == 2) ||
                    (Math.abs(kingx[k] - x[i]) == 2 && Math.abs(kingy[k] - y[i]) == 1)) {
                        c ++;
                        break;
                    }
                }
                k ++;
            }
            if (c == 9) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T --;
        }
        sc.close();
    }
}