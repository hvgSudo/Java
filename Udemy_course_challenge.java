import java.util.Scanner;

public class Udemy_course_challenge {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reverse(array);
        System.out.println(array.toString());
    }   
    
    private static void reverse(int[] array) {
        int max = array.length - 1;
        int temp = 0, n = array.length;
        for (int i = 0; i < n/2; i++) {
            temp = array[i];
            array[i] = array[max - i];
            array[max - i] = temp;
        }
    }
}