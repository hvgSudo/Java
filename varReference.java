
public class varReference {
    public static void changevarvalue(int a) {
        a = a + 10 ;
        System.out.println("Inside changevarvalue method and value of a is "+ a);
    }
    public static void changevarvalue(testrefvar a) {
        a.val = 19 ;
        System.out.println("Inside changevarvalue method and value of refvar is "+ a.val);
    }
    public static void main(String args[]) {
        int a = 4 ;
        System.out.println("Value of a before calling is "+ a) ;
        changevarvalue(a) ;
        System.out.println("Value of a after calling is "+ a) ;
        testrefvar refvar = new testrefvar() ;
        refvar.val = 4 ;
        System.out.println("Value of refvar before calling is "+ refvar.val) ;
        changevarvalue(refvar) ;
        System.out.println("Value of refvar after calling is "+ refvar.val) ;
    }
}
class testrefvar {
    int val ;
}