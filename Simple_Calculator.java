import java.util.Scanner;
// import java.math.*;

public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square root");
        System.out.println("6. Power");
        System.out.println("7. Mean");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                break;
            case 2:
                break;
            default:
                System.out.println("Wrong choice");
        }
        sc.close();
    }
}