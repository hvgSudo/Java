
import java.util.*;
import java.io.*;

public class array_reverse {

    private static final Scanner scanner = new Scanner(System.in);

    /*private static void fileInputOutput() {
         // BufferedReader Class for Fast buffer Input
        BufferedReader br = new BufferedReader(
                               new FileReader("D:\\Codes\\Java\\inputJava.txt"));
  
        // PrintWriter class prints formatted representations
        // of objects to a text-output stream.
        PrintWriter pw=new PrintWriter(new
                BufferedWriter(new FileWriter("D:\\Codes\\Java\\outputJava.txt")));
  
        // Your code goes Here
  
        pw.flush();
    }*/

    public static void main(String[] args) throws Exception {
        // fileInputOutput();
        BufferedReader br = new BufferedReader(
                               new FileReader("D:\\Codes\\Java\\inputJava.txt"));
  
        // PrintWriter class prints formatted representations
        // of objects to a text-output stream.
        PrintWriter pw=new PrintWriter(new
                BufferedWriter(new FileWriter("D:\\Codes\\Java\\outputJava.txt")));


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
        pw.flush();
    }
}

