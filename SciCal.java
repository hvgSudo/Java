import java.util.*;
//import java.math.*;
public class SciCal {
    public static void main(String[] args) {
        int o = 1, i, f, t = 1;
        char a;
        float fn, sn;
        double PI = 3.14259;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\t ------------ Briefing ------------");
        System.out.println("\t Enter one of the operations given below");
        System.out.println("\t Enter the first number and then the second number"); 
        System.out.println("\t +      for addition");
        System.out.println("\t -      for subtraction");
        System.out.println("\t *      for multiplication");
        System.out.println("\t /      for division");
        System.out.println("\t #      for remainder");
        System.out.println("\t !      for factorial");
        System.out.println("\t r      for square root");
        System.out.println("\t ^      for power of any number");
        System.out.println("\t l      for log to the base 10");
        System.out.println("\t n      for natural log (ln)");
        System.out.println("\t e      for for e raised to the power of any number");
        System.out.println("\t s      for sin (x)");
        System.out.println("\t c      for cos (x)");
        System.out.println("\t t      for tan (x)");
        System.out.println("\t i      for sin inverse of x");
        System.out.println("\t o      for cos inverse of x");
        System.out.println("\t a      for tan inverse of x");
        System.out.println("\t 0 to exit the calculator");
        System.out.println("Start entering below");
        while (o == 1)
        {
            System.out.println("\n Operator: ");
            a = sc.next().charAt(0);
            switch(a)
            {
                case '+':fn = sc.nextFloat();
                         sn = sc.nextFloat();
                         System.out.println(fn +" + "+ sn +" = "+ fn + sn);
                         break;
                case '-':fn = sc.nextFloat();
                         sn = sc.nextFloat();
                         System.out.println(fn +" - "+ sn +" = "+ (fn - sn));
                         break;
                case '*':fn = sc.nextFloat();
                         sn = sc.nextFloat();
                         System.out.println(fn +" x "+ sn +" = "+ fn * sn);
                         break;
                case '/':fn = sc.nextFloat();
                         sn = sc.nextFloat();
                         System.out.println(fn +" / "+ sn +" = "+ fn / sn);
                         break;
                case '#':fn = sc.nextFloat();
                         sn = sc.nextFloat();
                         System.out.println("Remainder of "+ fn +" / "+ sn +" = "+ fn % sn);
                         break;
                case '!':f = sc.nextInt();
                         for (i = 1; i <= f; i++)
                         {
                             t = t * i;
                         }
                         System.out.println("Factorial of "+ f +" = "+ t);
                         break;
                case 'r':fn = sc.nextFloat();
                         System.out.println("Square root = "+ Math.sqrt(fn));
                         break;
                case '^':fn = sc.nextFloat();
                         sn = sc.nextFloat();
                         System.out.println("= "+ Math.pow(fn, sn));
                         break;
                case 'l':fn = sc.nextFloat();
                         System.out.println("log ("+ fn +") = "+ Math.log10(fn));
                         break;
                case 'n':fn = sc.nextFloat();
                         System.out.println("ln ("+ fn +") = "+ Math.log(fn));
                         break;
                case 'e':fn = sc.nextFloat();
                         System.out.println("e ^ "+ fn +" = "+ Math.exp(fn));
                         break;
                case 's':fn = sc.nextFloat();
                         System.out.println("sin ("+ fn +") = "+ Math.sin(fn * (PI / 180)));
                         break;
                case 'c':fn = sc.nextFloat();
                         System.out.println("cos ("+ fn +") = "+ Math.cos(fn * (PI / 180)));
                         break;
                case 't':fn = sc.nextFloat();
                         System.out.println("tan ("+ fn +") = "+ Math.tan(fn * (PI / 180)));
                         break;
                case 'i':fn = sc.nextFloat();
                         System.out.println("sin inverse of ("+ fn +") = "+ Math.asin(fn) * (180 / PI));
                         break;
                case 'o':fn = sc.nextFloat();
                         System.out.println("cos inverse of ("+ fn +") = "+ Math.acos(fn) * (180 / PI));
                         break;
                case 'a':fn = sc.nextFloat();
                         System.out.println("tan inverse of ("+ fn +") = "+ Math.atan(fn) * (180 / PI));
                         break;
                case '0':o = 5;
                         break;
                default:System.out.println("Wrong input");
            }
        }
        sc.close();
        System.out.println("\n\t ------------ Thank You ------------");
    }
}