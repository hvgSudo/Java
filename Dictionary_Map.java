import java.util.*;
public class Dictionary_Map {
    public static void main(String []args) {
        Map<String, Integer> phonebook = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            phonebook.put(name, phone);
        }
        while (in.hasNext()) {
            String queries = in.next();
            Integer reply = phonebook.get(queries);
            System.out.println((reply != null) ? queries +"="+ reply : "Not found");
        }
        in.close();
    }
}