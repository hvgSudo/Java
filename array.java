import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int size = 10;
        arrayEvenOdd(array, size);
        System.out.println();
        arrayToArrayList(array, size);
        System.out.println();
        System.out.print("Second smallest element "+
            "in the array: "+ 
            secondSmallestElement(array, size));
    }

    public static void arrayEvenOdd(int[] array, int size) {
        int[] even = new int[10];
        int[] odd = new int[10];
        int count1 = 0, count2 = 0;
        System.out.print("The original array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] +" ");
            if (array[i] % 2 == 0) {
                even[count1] = array[i];
                count1++;
            } else {
                odd[count2] = array[i];
                count2++;
            }
        }
        System.out.println();
        System.out.print("The even array is: ");
        for (int i = 0; i < count1; i++)
            System.out.print(even[i] +" ");
        System.out.println();
        System.out.print("The odd array is: ");
        for (int i = 0; i < count2; i++)
            System.out.print(odd[i] +" ");
    }

    public static int secondSmallestElement(int[] array, 
        int size) {
        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array[1];
    }

    public static void arrayToArrayList(int[] array, int size) {
        ArrayList<Integer> arr = new ArrayList<Integer>(size);
        for (int i = 0; i < size; i++) 
            arr.add(array[i]);
        System.out.println("Array list is: " +arr);
    }

    public static void arrayListToArray() {
        
    }
}