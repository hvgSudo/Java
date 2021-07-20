import java.util.Random;
import java.util.Scanner;

public class ShufflingArray {
    private int[] a;
    private int[] b;
    
    public ShufflingArray(int[] nums) {
        a = new int[nums.length];
        b = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) 
            a[i] = b[i] = nums[i];
    }

    private int[] resetArray() {
        for (int i = 0; i < a.length; ++i) 
            b[i] = a[i];
        return b;
    }

    private int[] shuffleArray() {
        Random rand = new Random();
        for (int i = 0; i < b.length; ++i) {
            int randomIndex = rand.nextInt(b.length);
            int temp = b[i];
            b[i] = b[randomIndex];
            b[randomIndex] = temp;
        }
        return b;
    }

    public static void main(String[] args)  {
        int[] nums, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the size of the array: ");
        int size = sc.nextInt();
        nums = new int[size];
        //result = new int[size];
        System.out.println("\nEnter the elements one by one");
        for (int i = 0; i < size; ++i) 
            nums[i] = sc.nextInt();
        sc.close();
        ShufflingArray sa = new ShufflingArray(nums);
        System.out.println("\nFirst entry");
        result = sa.resetArray();
        for (int i = 0; i < size; ++i)
            System.out.print(" "+ result[i] +" ");
        System.out.println("\nAfter shuffling");
        result = sa.shuffleArray();
        for (int i = 0; i < size; ++i)
            System.out.print(" "+ result[i] +" ");
        System.out.println("\nAfter resetting");
        result = sa.resetArray();
        for (int i = 0; i < size; ++i)
            System.out.print(" "+ result[i] +" ");
    }
}