import java.util.Scanner;
public class testing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no1;
        int no2;
        int res;
        char ch;
        try {
            do {
                System.out.println("Enter first number: ");
                no1 = Integer.parseInt(in.nextLine());
                System.out.println("Enter second number: ");
                no2 = Integer.parseInt(in.nextLine());
                res = no1 + no2;
                System.out.println("Result of " + no1 + " + " + no2 + " = " + res);
                System.out.println("Do you want to continue(y/n): ");
                ch = in.next().charAt(0);
            }while(ch == 'y' || ch == 'Y');
        } catch (Exception e) {

        }
    }
}
