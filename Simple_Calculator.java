import java.util.Scanner;
import java.math.*;

public class Simple_Calculator {
    static Scanner sc = new Scanner(System.in);
    static float add(int n) {
        System.out.println("Enter the numbers: ");
        float number, sum = 0;
        for (int i = 0; i < n; i++) {
            number = sc.nextFloat();
            sum = sum + number;
        }
        return (sum);
    }

    static float sub() {
        System.out.println("Enter two numbers: ");
        float num_1, num_2, diff;
        num_1 = sc.nextFloat();
        num_2 = sc.nextFloat();
        diff = num_1 - num_2; 
        return (diff);
    }

    static float mult(int n) {
        System.out.println("Enter the numbers: ");
        float num, product = 1;
        for (int i = 0; i < n; i++) {
            num = sc.nextFloat();
            product = product * num;
        }
        return (product);
    }

    static float div() {
        System.out.println("Enter two numbers: ");
        float num_1, num_2, quotient;
        num_1 = sc.nextFloat();
        num_2 = sc.nextFloat();
        quotient = num_1 / num_2; 
        return (quotient);
    }

    static float mean(int n) {
        float sum = 0, number;
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            number = sc.nextFloat();
            sum = sum + number;
        }
        return (sum / n);
    }

    public static void main(String[] args) {
        int n;
        float num, num_1;
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
                System.out.println("How many numbers do you want to enter: ");
                n = sc.nextInt();
                System.out.println("The sum is " + add(n));
                break;
            case 2:
                System.out.println("The difference is " + sub());
                break;
            case 3:
                System.out.println("How many numbers do you want to enter: ");
                n = sc.nextInt();
                System.out.println("The product is " + mult(n));
                break;
            case 4:
                System.out.println("The quotient is " + div());
                break;
            case 5:
                System.out.println("Enter the number: ");
                num = sc.nextFloat();
                System.out.println("The square root of " + num + "is " + Math.sqrt(num));
                break;
            case 6:
                System.out.println("Enter the number: ");
                num = sc.nextFloat();
                System.out.println("Enter the power: ");
                num_1 = sc.nextFloat();
                System.out.println(num + " raised to " + num_1 + " = " + Math.pow(num, num_1));
                break;
            case 7:
                System.out.println("Enter the total numbers in the data: ");
                n = sc.nextInt();
                System.out.println("The meam of the given data: " + mean(n));
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
    // sc.close();
}