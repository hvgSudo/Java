import java.util.Scanner;
class Hello{

    public static void main(String args[]){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = sc.nextInt();
        System.out.println("Enter the first number: ");
        b = sc.nextInt();
        sum(a, b);
        System. out. println("Hello Java, this is HVG");
        sc.close();
    }

    private static void sum(int one, int two) {
        System.out.println("The sum is " + (one + two));
    }
}