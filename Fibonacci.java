public class Fibonacci {
    static void fibonacci_series(int n) {
        int one = 0, two = 1;
        int a;
        for (int i = 0; i < n; i++) {
            System.out.print(one + " ");
            a = one + two;
            one = two;
            two = a;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.print("The series is ");
        fibonacci_series(n);
    }
}