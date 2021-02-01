
import java.util.*;
public class array_reverse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter size of the array: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter elements of the array: ");
        String[] a = scanner.nextLine().split(" ");
        System.out.println("Reverse of the array: ");
        for (int i = n - 1; i >= 0; i--)
        {
            System.out.print(a[i] +" ");
        }
        scanner.close();
    }
}

