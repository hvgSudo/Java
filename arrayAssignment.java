import java.util.ArrayList;
import java.util.Arrays;

import javax.lang.model.util.ElementScanner14;

import java.lang.Math;

public class arrayAssignment {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 0, 2, 4, 9, 8, 6};
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 0, 2, 4, 9, 8));
        int size = 10;
        /* arrayEvenOdd(array, size);
        System.out.println();
        arrayToArrayList(array, size);
        System.out.println(); 
        System.out.print("Second smallest element "+
            "in the array: "+ 
            secondSmallestElement(array, size)); 
        arrayListToArray(arr); */
        for (int a : array)
            System.out.print(a +" ");
        System.out.println();
        System.out.println(smallestDistance(array, size));
        System.out.println("Peak element: "+ peakElement(array, size));
    }

    /* public static void arrayEvenOdd(int[] array, int size) {
        int[] even = new int[10];
        int[] odd = new int[10];
        int count1 = 0, count2 = 0;
        System.out.print("The original array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] +" ");
            if (array[i] % 2 == 0) 
                even[count1++] = array[i]; 
            else 
                odd[count2++] = array[i];
        }
        System.out.println();
        System.out.print("The even array is: ");
        System.out.println(Arrays.toString(even));
        System.out.print("The odd array is: ");
        System.out.println(Arrays.toString(odd));
        System.out.println(smallestDistance(array, size));
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

    public static void arrayListToArray(ArrayList<Integer> arr) {
        int[] array = new int[arr.size()];
        for (int i : arr)
            array[i] = i;
        System.out.println("Array List: ");
        for (int a : arr)
            System.out.print(a);
        System.out.println();
        System.out.println("Converted to Array: ");
        System.out.println(Arrays.toString(array));
    } */

    public static int smallestDistance(int[] array, int size) {
        int smallest = Math.abs(array[0] - array[1]);
        int smallest1 = 0, x = 0, y = 0;
        for (int i = 1; i < size - 1; i++) {
            smallest1 = Math.abs(array[i] - array[i + 1]);
            if (smallest1 < smallest) {
                x = array[i];
                y = array[i + 1];
                smallest = smallest1;
            }
            else
                continue;
        }
        System.out.print(x +" and "+ y +" have the smallest"
            +" distance ");
        return smallest;
    }

    public static int peakElement(int[] array, int size) {
        int peak = -1, peak1 = -1, peak2 = -1;
        if (array[0] > array[1])
            peak1 = array[0];
        if (array[size - 1] > array[size - 2])
                peak2 = array[size - 1];
        for (int i = 1; i < size - 1; i++) {
            if (array[i] > array[i - 1] && 
                    array[i] > array[i + 1])
                peak = array[i];
        }
        if (peak > peak1 && peak> peak2)
            return peak;
        else if (peak1 > peak && peak1 > peak2)
            return peak1;
        else
            return peak2;
    }
}