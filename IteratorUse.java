import java.util.LinkedList;
import java.util.Iterator;

public class IteratorUse {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<Character>();
        for (int i = 65; i < 91; i++)
            list.add((char)i);
        Iterator<Character> i = list.iterator();
        while (i.hasNext()) 
            System.out.println("Element -> "+ i.next());
    }
}
