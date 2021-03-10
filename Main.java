import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        StudentOperations op = new StudentOperations();
        boolean exit = false;
        int action;
        Scanner sc = new Scanner(System.in);
        while (!exit) {
            printActionMenu();
            System.out.println("Enter your "+
                "choice of action (5 to view "+
                "the menu): ");
            action = sc.nextInt();
            switch(action) {
                case 1:
                    op.displayDetails();
                    break;
                case 2:
                    op.inputDetails();
                    break;
                case 5:
                    printActionMenu();
                    break;
                case 6:
                    exit = true;
                    break;
            }
        }
        sc.close();
    }

    public static void printActionMenu() {
        System.out.println("1. Display the list"+
            "2. Add students to the list"+
            "3. Update the details of the students"+
            "4. Delete record of students"+
            "5. View the menu"+
            "6. Exit");
    }
}