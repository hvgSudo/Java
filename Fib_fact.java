import java.util.Scanner;

public class Fib_fact {

    public static int factorial(int n) {
        if (n > 1) 
            return (n * factorial(n - 1));
        else
            return n;
    }

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return (fibonacci(n - 1) + fibonacci(n - 2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, number, j = 0;
        System.out.println("1. Factorial");
        System.out.println("2. Fibonacci series");
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter the number to find the factorial: ");
            number = sc.nextInt();
            System.out.println("The factorial of " + number + " is " + factorial(number));
        } else if (choice == 2) {
            System.out.print("Enter how many digits do you want to see from the Fibonacci series: ");
            number = sc.nextInt();
            System.out.println("The first " + number + " fibonacci series are");
            for (int i = 0; i < number; i++) {
                System.out.print(fibonacci(j) + " ");
                j = j + 1;
            }
        }
        sc.close();
    }
}