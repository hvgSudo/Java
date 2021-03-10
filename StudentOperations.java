import java.util.Scanner;
import java.util.ArrayList;

public class Studentperations {
        public void inputDetails() {
            Scanner sc = new Scanner(System.in);
            ArrayList<Student> list = new ArrayList<Student>(
                strength);
            for (int i = 0; i < strength; i++) {
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