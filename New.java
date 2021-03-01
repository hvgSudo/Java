import java.util.Scanner;
public class New {

    String name;

    public void inpt() {
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        sc.close();
    }

    public void prin() {
        System.out.println("Object: "+ this.name);
    }
    public static void main(String[] args) {
        New n = new New();
        New e = new New();
        New w = new New();
        New obj = new New();
        n.name = "Harsh";
        n.prin();
        e.name = "Taisha";
        e.prin();
        w.inpt();
        w.prin();
        obj.inpt();
        obj.prin();
    }
}