
public class Conditionals
{
    public static void main(String[] args)
    {
        int i = 10;
        if (i < 5)
        {
            System.out.println("Inside if");
        }
        else if (i < 7)
        {
            System.out.println("Inside else if 1");
        }
        else if (i < 8) 
        {
            System.out.println("Inside else if 2");
        }
        else
        {
            System.out.println("Inside else");
        }
    }
}