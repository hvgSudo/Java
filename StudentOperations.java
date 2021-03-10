import java.util.Scanner;
import java.util.ArrayList;

public class StudentOperations {
    private ArrayList<Student> list;

    StudentOperations() {
        list = new ArrayList<Student>();
    }
    public void inputDetails() {
        String name, prn;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.size(); i++) {
            System.out.print("Enter the prn of student "+ 
                (i + 1) +": ");
            prn = sc.nextLine();
            System.out.print("Enter the name of student "+
                (i + 1) +": ");
            name = sc.nextLine();
            list.add(new Student(name, prn));
        }
    }
    
    public void displayDetails() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getPrn() +" -> "+
                list.get(i).getName());
        }
    }
}
