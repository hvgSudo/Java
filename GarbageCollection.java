class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() { return name; }
}

public class GarbageCollection {

    public void finalize() {
        System.out.println("Garbage collected");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Jacky");
        Dog d2 = new Dog("Brutus");
        Dog d3 = new Dog("Maya");
        Dog d4 = new Dog("Max");

        System.out.println("D1 -> "+ d1);
        System.out.println("D2 -> "+ d2);
        System.out.println("D3 -> "+ d3);
        System.out.println("D4 -> "+ d4);

        // dereferencing d1
        d1 = null;
        // copying value of d2 into d3
        d3 = d2; // replaces value present in d3 which goes into garbage
        // dereferencing value of d4 and d2
        d4 = null;
        d2 = null;
        System.gc();
        // calling garbage collectr method 

        // assigning null to an object takes its 
        // original value to garbage collector
        // copying value into another object does the same for the object
        // which will be storing the copied value

        System.out.println("\nAfter automatic garbage collection\n");

        System.out.println("D1 -> "+ d1);
        System.out.println("D2 -> "+ d2);
        System.out.println("D3 -> "+ d3);
        System.out.println("D4 -> "+ d4);
    }
 }