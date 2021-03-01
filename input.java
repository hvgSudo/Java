import java.util.*;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s = sc.nextLine();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Enter first character: ");
        char c = sc.next().charAt(0);
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.println("Enter first float: ");
        float f = sc.nextFloat();
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        sc.close();
        System.out.println("Integer: "+ a);
        System.out.println("Character: "+ c);
        System.out.println("String: "+ s);
        System.out.println("Float: "+ f);
    }
}