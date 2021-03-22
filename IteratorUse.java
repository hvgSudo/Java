import java.util.LinkedList;
import java.util.ListIterator;
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

    private static boolean addInOrder(LinkedList<String> 
        linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                System.out.println("City already present");
                return false;
            } else if (comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // continue to next which has already been done
                // by .next()
            }
        }
        stringListIterator.add(newCity);
    }
}
