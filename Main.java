import java.util.Scanner;
import java.util.ArrayList;

class Student {
    private int prn;
    private String name;
    Student(String name, int prn) {
        this.prn = prn;
        this.name = name;
    }
    public void input (String name, int prn) {
        this.prn = prn;
        this.name = name;
    }
    public void display() {
        System.out.println("PRN: "+ prn
            +" Name: "+ name);
    }
}
public class Main {

    public static void main(String[] args) {
        int prn, strength;
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students are there in the"
            +" class: ");
        strength = sc.nextInt();
        ArrayList<Student> list = new ArrayList<Student>(
            strength);
        for (int i = 0; i < strength; i++) {
            System.out.print("Enter the prn of student "+ 
                (i + 1) +": ");
            prn = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the name of student "+
                (i + 1) +": ");
            name = sc.nextLine();
            list.add(new Student(name, prn));
        }
        for (int i = 0; i < strength; i++)
            list.get(i).display();
        sc.close();
    }
}