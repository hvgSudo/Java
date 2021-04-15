public class GarbageCollection {

    public GarbageCollection() {
        System.out.println("Object created");
    }
    
    public static void main(String[] args) throws InterruptedException{
        GarbageCollection g1 = new GarbageCollection();
        GarbageCollection g2 = new GarbageCollection();

        g1 = null; // nullifying the object 
        System.gc();
        g2 = null;
        Runtime.getRuntime().gc();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector called");
        System.out.println("Object garbage collected : "+ this);
    }
}