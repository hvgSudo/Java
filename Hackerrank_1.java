import java.util.Scanner;

public class Hackerrank_1{

    static int fibonacci(int n) {
        int a = 0;
        int one = 0, two = 1;
        for (int i = 2; i < n; i++) {
            a = one + two;
            one = two;
            two = a;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int ret = fibonacci(n);
        System.out.print("The " + n);
        System.out.println(" number in Fibonacci series is " + ret);
    }
}