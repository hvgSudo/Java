
public class loop {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside for loop1 "+ i);
        }
        int j = 2;
        for (; j < 4; j++) {
            System.out.println("Inside for loop2 "+ j);
        }
        int k = 1;
        for (; ; k++) {
            System.out.println("Inside for loop3 "+ k);
            if (k > 4) break;
        }
        int l = 1;
        for (; ; ) {
            System.out.println("Inside for loop4 "+ l);
            l++;
            if (l > 4) break;
        }
    }
}