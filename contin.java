
public class contin {
    public static void main(String[] args) {
        test: for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3 ; j++) {
                if (j == 2) {
                    continue test;
                }
                System.out.println(j +" = j");
            }
            System.out.println(i +" = i");
        }
    }

}