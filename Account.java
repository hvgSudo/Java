
public class Account { 

    public Account() {
        System.out.println("Called first from main") ;
    }

    public Account(String accountnumber, String accounttype, long amount) {
        System.out.println("Called from main: Constructor with arguments") ;
        this.accountnumber = accountnumber ;
        this.accounttype = accounttype ;
        this.amount = amount ;
    }
    private String accountnumber ;
    private String accounttype ; 
    private long amount ;

    public boolean withdrawAmount(long amt) {
        if(amt > amount) return false ;
        else {
            amount = amount - amt ;
            return true ;
        }
    }

    public boolean depositamount(long amt) {
        if(amt < 0) return false ;
        else {
            amount = amount + amt ;
            return true ;
        }
    }

    void setAccountNumber(String actNum) {
        accountnumber = actNum ;
    }

    public String getAccountNumber() {
        return accountnumber ;
    }

    void setAccountType(String actType) {
        accounttype = actType ;
    }

    public String getAccountType() {
        return accounttype ;
    }
    public static void main(String args[]) {
        Account testObj = new Account() ;
        testObj.accountnumber = "SB_101" ;
        testObj.accounttype = "SB" ;
        testObj.amount = 100;
        System.out.println("My testObj initial values: "+ testObj.accountnumber +"::"+ testObj.accounttype +"::"+ testObj.amount) ;
        testObj.depositamount(100) ;
        System.out.println("My testObj after deposit: "+ testObj.accountnumber +"::"+ testObj.accounttype +"::"+ testObj.amount) ;
        testObj.withdrawAmount(50) ;
        System.out.println("My testObj after withdrawal 1: "+ testObj.accountnumber +"::"+ testObj.accounttype +"::"+ testObj.amount) ;
        testObj.withdrawAmount(1000) ;
        System.out.println("My testObj after withdrawal 2: "+ testObj.accountnumber +"::"+ testObj.accounttype +"::"+ testObj.amount) ; 
        Account testObj2 = new Account("SB_102","SB",1000) ;
        System.out.println("My testObj initial values: "+ testObj2.accountnumber +"::"+ testObj2.accounttype +"::"+ testObj2.amount) ;   
    }
}