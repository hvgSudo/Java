import java.util.Scanner;
public class Codechef_contest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        int i = 0, k = 1;
        while(k == 1) {
            int input = sc.nextInt();
            if (input == 42)
                break;
            else {
                arr[i] = input;
                i = i + 1;
            }
        }
        sc.close();
        for (int j = 0; j < i; j++)
            System.out.println(arr[j]);
    }
}
