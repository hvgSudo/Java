
public class firstJavaClass {
    String name ;
    String getName()
    {
        return name ;
    }

    public static void main(String args[]) {
        firstJavaClass testObj = new firstJavaClass() ;
        System.out.println(testObj.getName()) ;
        //firstJavaClass Obj = new firstJavaClass() ;
    }
}