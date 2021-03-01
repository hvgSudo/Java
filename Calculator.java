import java.util.Scanner;

class functions {
    private float sum = 0;
    public float add(int n, float a[]) {
        for (int i = 0; i < n; i++) 
            sum = sum + a[i];
        return (sum);
    }

    public float sub(float num_1, float num_2) {
        float diff = 0;
        diff = num_1 - num_2; 
        return (diff);
    }

    public float mult(int n, float a[]) {
        float product = 1;
        for (int i = 0; i < n; i++) {
            product = product * a[i];
        }
        return (product);
    }

    public float div(float num_1, float num_2) {
        float quotient = 0;
        quotient = num_1 / num_2; 
        return (quotient);
    }

    public float mean(int n, int sum) {
        return (sum / n);
    }

    public int gcd(int one, int two) {
        if (two == 0)
            return (one);
        return (gcd(two, (one % two)));
    }

    public double sqrt(int number) {
        int start = 0, end = number;
        int mid;
        double ans = 0.0, inc = 0.1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid * mid == number) {
                ans = mid;
                break;
            } if (mid * mid < number) {
                start = mid + 1;
                ans = mid;
            }
            else
                end = mid - 1;
        }
        for (int i = 0; i < 5; i++) { 
            while (ans * ans <= number) 
                ans = ans + inc;
            ans = ans - inc;
            inc = inc / 10;
        }
        return (ans);
    }

    public int power(int a, int b) {
        int power = 1;
        for (int i = 0; i < b; i++) {
            power = power * a;    
        }
        return (power);
    }
}

public class Calculator {

    public static void main(String[] args) {
        functions fun = new functions();
        Scanner sc = new Scanner(System.in);
        int n, j = 0;
        int n_1, n_2, sum = 0;
        float num, num_1;
        float result = 0;
        char ch;
        String data = "";
        float[] arr = new float[20];
        do {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square root");
            System.out.println("6. Power");
            System.out.println("7. Mean");
            System.out.println("8. GCD");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("How many numbers do you want to enter: ");
                    n = sc.nextInt();
                    System.out.print("Enter the numbers: ");
                    for (int i = 0; i < n; i++)
                        arr[i] = sc.nextFloat();
                    for (int i = 0; i < n; i++) {
                        if (i != n - 1)
                            System.out.print(arr[i] + " + ");
                        else
                            System.out.print(arr[i]);
                    }
                    System.out.println(" = " + fun.add(n, arr));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num = sc.nextFloat();
                    System.out.print("Enter second number: ");
                    num_1 = sc.nextFloat();
                    result = fun.sub(num, num_1);
                    System.out.println(num + " - " + num_1 + " = " + result);
                    break;
                case 3:
                    System.out.print("How many numbers do you want to enter: ");
                    n = sc.nextInt();
                    System.out.print("Enter the numbers: ");
                    for (int i = 0; i < n; i++)
                        arr[i] = sc.nextFloat();
                    result = fun.mult(n, arr);
                    System.out.println("The product is " + result);
                    break;
                case 4:
                    System.out.print("Enter the first number: ");
                    num = sc.nextFloat();
                    System.out.print("Enter the second number: ");
                    num_1 = sc.nextFloat();
                    System.out.println("The quotient is " + fun.div(num, num_1));
                    break;
                case 5:
                    System.out.print("Enter the number: ");
                    n_1 = sc.nextInt();
                    System.out.println("The square root of "
                     + n_1 + " is " + fun.sqrt(n_1));
                    break;
                case 6:
                    System.out.print("Enter the number: ");
                    n_1 = sc.nextInt();
                    System.out.print("Enter the power: ");
                    n_2 = sc.nextInt();
                    System.out.println(n_1 + " raised to "
                     + n_2 + " = " + fun.power(n_1, n_2));
                    break;
                case 7:
                    System.out.println("Enter the data entries one"+
                    " by one and enter 'end' to stop input");
                    data = sc.nextLine();
                    while (true) {
                        data = sc.nextLine();
                        if (data.equals("end")) 
                            break;
                        else {
                            n_1 = Integer.parseInt(data);
                            sum = sum + n_1;
                            j = j + 1;
                        }
                    } 
                    result = fun.mean(j, sum);
                    System.out.println("The mean of the given data: " + result);
                    break;
                case 8:
                    System.out.print("Enter first number: ");
                    n_1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    n_2 = sc.nextInt();
                    if (n_1 > n_2)
                        System.out.println("GCD(" + n_1 + "," 
                        + n_2 + ") = " + fun.gcd(n_1, n_2));
                    else 
                        System.out.println("GCD(" + n_2 + ","
                         + n_1 + ") = " + fun.gcd(n_2, n_1));
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.print("Do you want to continue(y/n): ");
            ch = sc.next().charAt(0);
        }while(ch == 'y' || ch == 'Y');
    sc.close();
    }
}