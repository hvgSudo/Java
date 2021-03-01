import java.util.ArrayList;
import java.lang.Math;
import java.util.Scanner;

public class arrayAssignment {
    private ArrayList<Integer> arr = new ArrayList<>();
    private int[] array = new int[10];
    private int arraySize = 0;
    private int listSize = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arrayAssignment a = new arrayAssignment();
        int choice, count = 0, count1 = 0;
        char ch, c = 'y';
        do {
            if (count == 0) {
                count++;
                initializeArray(a);
                // initializeList(a);
            } else {
                System.out.println("Do you want to create a"+
                    " new array and list(y/n): ");
                // c = sc.next().charAt(0);
                if (c == 'y') {
                    initializeArray(a);
                    // initializeList(a);
                }
            }
            System.out.println("1. Separate even and odd"+
                " arrays from the current array");
            System.out.println("2. Smallest distance between"+
                " two elements in the array");
            System.out.println("3. Second smallest number in"+
            " the array");
            System.out.println("4. Convert array to array list");
            System.out.println("5. Convert array list to array");
            System.out.println("6. Find the peak element in"+ 
                " the array");
            System.out.println("7. Sort the array using"+
                " bubble and quick sort tecniques");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    arrayEvenOdd(a);
                    System.out.println();
                    break;
                case 2:
                    System.out.println(smallestDistance(a));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Second smallest element "+
                        "in the array: "+ secondSmallestElement(a)); 
                    System.out.println();
                    break;
                case 4:
                    arrayToArrayList(a);
                    break;
                case 5:
                    /*if (count1 == 0) {
                        count1++;
                        initializeList(a);
                    } else {
                        System.out.println("Do you want to create a"+
                            " new array list and list(y/n): ");
                        c = sc.next().charAt(0);
                        if (c == 'y')
                            initializeList(a);
                    }*/
                    arrayListToArray(); 
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Peak element: "+ 
                        peakElement(a));
                    System.out.println();
                    break;
                case 7:
                    bubbleSelectionSort(a);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.print("Do you want to perform more"+ 
                " operations(y/n): ");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
        sc.close();
    }

    public static void initializeArray(arrayAssignment a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        a.arraySize = sc.nextInt();
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < a.arraySize; i++)
            a.array[i] = sc.nextInt();
        System.out.print("Enter the size of the array list: ");
        a.listSize = sc.nextInt();
        System.out.println("Enter the elements of the array list");
        for (int i = 0; i < a.listSize; i++)
            a.arr.add(sc.nextInt());
        sc.close();
    }

    /*public static void initializeList(arrayAssignment a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array list: ");
        a.listSize = sc.nextInt();
        System.out.println("Enter the elements of the array list");
        for (int i = 0; i < a.listSize; i++)
            a.arr.add(sc.nextInt());
        sc.close();
    }*/

    public static void arrayEvenOdd(arrayAssignment a) {
        int[] even = new int[10];
        int[] odd = new int[10];
        int count1 = 0, count2 = 0;
        System.out.print("The original array is: ");
        for (int i = 0; i < a.arraySize; i++) {
            System.out.print(a.array[i] +" ");
            if (a.array[i] % 2 == 0) 
                even[count1++] = a.array[i]; 
            else 
                odd[count2++] = a.array[i];
        }
        System.out.println();
        System.out.print("The even array is ");
        for (int i = 0; i < count1; i++)
            System.out.print(even[i] +" ");
        System.out.println();
        System.out.print("The odd array is ");
        for (int i = 0; i < count2; i++)
            System.out.print(odd[i] +" ");
    }

    public static int smallestDistance(arrayAssignment a) {
        System.out.print("The array is ");
        for (int i : a.array)
            System.out.print(i +" ");
        System.out.println();
        int smallest = Math.abs(a.array[0] - a.array[1]);
        int smallest1 = 0, x = 0, y = 0;
        for (int i = 1; i < a.arraySize - 1; i++) {
            smallest1 = Math.abs(a.array[i] - a.array[i + 1]);
            if (smallest1 < smallest) {
                x = a.array[i];
                y = a.array[i + 1];
                smallest = smallest1;
            }
            else
                continue;
        }
        System.out.print(x +" and "+ y +" have the smallest"
            +" distance ");
        return smallest;
    }

    public static int secondSmallestElement(arrayAssignment a) {
        int temp = 0;
        for (int i = 0; i < a.arraySize - 1; i++) {
            for (int j = 0; j < a.arraySize - i - 1; j++) {
                if (a.array[j] > a.array[j + 1]) {
                    temp = a.array[j];
                    a.array[j] = a.array[j + 1];
                    a.array[j + 1] = temp;
                }
            }
        }
        for (int i = 1; i < a.arraySize; i++) {
            if (a.array[i] > a.array[0])
                return a.array[i];
        }
        return -1;
    }

    public static void arrayToArrayList(arrayAssignment a) {
        System.out.print("The array is ");
        for (int i : a.array)
            System.out.print(i +" ");
        System.out.println();
        ArrayList<Integer> list = new ArrayList<Integer>(a.arraySize);
        for (int i = 0; i < a.arraySize; i++) 
            list.add(a.array[i]);
        System.out.println("Array list is "+ list);
    }

    public static void arrayListToArray() {
        arrayAssignment a = new arrayAssignment();
        int count = 0;
        int[] array = new int[a.arr.size()];
        for (int i : a.arr)
            array[count++] = i;
        System.out.println();
        System.out.println("Array List is "+ a.arr);
        System.out.print("Array is ");
        for (int i : array)
            System.out.print(i +" ");
        System.out.println();
    } 

    public static int peakElement(arrayAssignment a) {
        System.out.println("The array is ");
        for (int i : a.array) 
            System.out.print(i +" ");
        System.out.println();
        int peak = -1, peak1 = -1, peak2 = -1;
        if (a.array[0] > a.array[1])
            peak1 = a.array[0];
        if (a.array[a.arraySize - 1] > a.array[a.arraySize - 2])
                peak2 = a.array[a.arraySize - 1];
        for (int i = 1; i < a.arraySize - 1; i++) {
            if (a.array[i] > a.array[i - 1] && 
                a.array[i] > a.array[i + 1])
                peak = a.array[i];
        }
        if (peak > peak1 && peak > peak2)
            return peak;
        else if (peak1 > peak && peak1 > peak2)
            return peak1;
        else
            return peak2;
    }

    public static void bubbleSelectionSort(arrayAssignment aa) {
        int temp = 0, arraySize = aa.arr.size();
        ArrayList<Integer> dummy, dummy1 = new 
            ArrayList<Integer>(arraySize);
        dummy = dummy1 = aa.arr;
        System.out.println("Using bubble sort");
        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = 0; j < arraySize - i - 1; j++) {
                if (dummy.get(j) > dummy.get(j + 1)) {
                    temp = dummy.get(j);
                    dummy.set(j, dummy.get(j + 1));
                    dummy.set(j + 1, temp);
                }
            }
        }
        System.out.println("The sorted list is "+ dummy);
        System.out.println("For the list "+ aa.arr);
        System.out.println();
        System.out.println("Using Quick Sort");
        quickSort(aa, arraySize, 0, arraySize - 1);
        System.out.println("The sorted list is "+ aa.arr);
        System.out.println("For the list "+ dummy1);
    }   
    
    public static void quickSort(arrayAssignment a, int arraySize, int start, int last) {
        int mid = 0;
        if (start < last) {
            mid = sortPartition(a, start, last, arraySize);
            quickSort(a, arraySize, start, mid - 1);
            quickSort(a, arraySize, mid + 1, last);
        } 
    }

    public static int sortPartition(arrayAssignment a,
        int start, int last, int arraySize) {
        int count = start - 1, temp = 0;
        int pivot = a.arr.get(last);
        for (int i = start; i < last; i++) {
            if (a.arr.get(i) <= pivot) {
                count ++;
                temp = a.arr.get(count);
                a.arr.set(count, a.arr.get(i));
                a.arr.set(i, temp);
            }
        }
        temp = a.arr.get(count + 1);
        a.arr.set(count + 1, a.arr.get(last));
        a.arr.set(last, temp);
        return (count + 1);
    }
}