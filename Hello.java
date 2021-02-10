import java.util.Scanner;
class Hello{

    public static void main(String args[]){
        int a, b;
        float c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        sum(a, b);
        System. out. println("Hello Java, this is HVG");
        System.out.print("Enter a number: ");
        c = sc.nextFloat();
        System.out.println("The square of "+ c + " is " + sqr(c));
        sc.close();
    }

    private static void sum(int one, int two) {
        System.out.println("The sum is " + (one + two));
    }

    private static float sqr(float a) {
        return (a * a);
    }
}