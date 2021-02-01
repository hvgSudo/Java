
public class breakst {
    public static void main(String[] args) {
        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 0 ; j < 5 ; j++) {
                System.out.println("Inside for loop with i as "+ i +" and j as "+ j);
                if (j == 1) break;
            }
        }
        test: for (int f = 0 ; f < 5 ; f++) {
            for (int u = 0 ; u < 5 ; u++) {
                System.out.println("Inside for loop with f as "+ f +" and u as "+ u);
                if (u == 1) break test;
            }
        }
    }

}