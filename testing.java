import java.util.Scanner;


class Main {
public static void main(String[] args)
{
double sqroot;
long power;
int a,b,c,k, ans, sum=0, count=0;
 int p,q;
double ans_avg;
String data;
int choice =1;
Scanner s = new Scanner(System.in);
calculator Obj1 = new calculator(); // java object creation
while(true)
{
System.out.println("*MENU 1) Addition 2) Subtraction 3) Multiplication 4) Division 5) Square root 6)Power 7)Mean 8)GCD 9)EXIT ");
choice=s.nextInt();
switch(choice)
    {
case 1:
    System.out.println("enter two nos");
    a=s.nextInt();
    b=s.nextInt();
    ans=Obj1.sum(a,b);
    System.out.println("Sum is= " + ans);
    break;
case 2:
    System.out.println("enter two nos");
    a=s.nextInt();
    b=s.nextInt();
    ans=Obj1.sub(a,b);
    System.out.println("Subtraction is= " + ans);
    break;
case 3:
    System.out.println("enter two nos");
    a=s.nextInt();
    b=s.nextInt();
    ans=Obj1.mult(a,b);
    System.out.println("Multiplication is=" +ans);
    break;
case 4:
    System.out.println("enter two nos");
    a=s.nextInt();
    b=s.nextInt();  
    ans=Obj1.div(a,b);
    System.out.println("Division is=" +ans);
    break;
case 5:
    System.out.println("Enter number:");
    k=s.nextInt();
    sqroot=Obj1.sqrt(k);
    System.out.println("Square root is=" +sqroot);
    break;
case 6:
    System.out.println("Enter two numbers:");
    p=s.nextInt();
    q=s.nextInt();
    power=Obj1.pwr(p,q);
    System.out.println("Power of the given number is=" +power);
    break;
//case 7:
  //  ans=Obj1.mean();
    //System.out.println("Mean of the array is=" +);
    //break;
case 7:
    System.out.println("enter two nos");
    a=s.nextInt();
    b=s.nextInt();
    c=Obj1.gcd(a,b);
    System.out.println("The Greatest common divisor of the given numbers is=" +c);
    break;
case 8: System.exit(0);
    }
}// while ends

} // main ends
} // main class ends
class calculator
{
int sum(int a, int b ) // SUM function body
{ 
    return ( a+b); 
}

int sub(int a, int b ) // SUB function body
{ 
    return ( a-b); 
}
int mult(int a, int b)
  {
    return(a*b);
  }
  
int div(int a, int b)
  {
    return(a/b);
  }
double sqrt(int k)
{
    double n;
    double sqrt=k/2;
    do
    {
        n=sqrt;
        sqrt=(n+(k/n))/2;
    }
    while((n-sqrt)!=0);
    return(sqrt);
    
}
long pwr(int p, int q)
{
    long result=1;
    while(q!=0)
        {
            result*=p;
            --q;
        }
    return(result);
}
 //double mean(int n, int sum)
//{ 
  //  return (sum / n);
//}

int gcd(int a,int b)
{
 if(b==0)
    {
        return a;
    }
 else     
    return gcd(b,a%b);
}
} // calculator closes