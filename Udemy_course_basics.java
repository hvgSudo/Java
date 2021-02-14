public class Udemy_course_basics {
    public static void main (String[] args) {
        
        double var_1 = 20.00;
        double var2 = 80.00;
        double result = (var_1 + var2) * 100.00;
        double remainder = result % 40.00;
        boolean var4 = (remainder == 0) ? true : false;
        System.out.println(var4);
        System.out.println("Result: "+ result);
        System.out.println("remainder: "+ remainder);
        if (var4 != true) {
            System.out.println("Got some remainder");
        }
    }
}