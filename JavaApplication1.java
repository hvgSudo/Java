/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;

/**
 *
 * @author harsh
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.println("I am Harsh");
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print(i +" ");
        }
    }

}
