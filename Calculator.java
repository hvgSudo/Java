import java.util.Scanner;

class functions {
    private float sum = 0;
    public float add(int n, float a[]) {
        for (int i = 0; i < n; i++) 
            sum = sum + a[i];
        return (sum);
    }

    public static float sub(float num_1, float num_2) {
        float diff = 0;
        diff = num_1 - num_2; 
        return (diff);
    }

    public static float mult(int n, float a[]) {
        float product = 1;
        for (int i = 0; i < n; i++) {
            product = product * a[i];
        }
        return (product);
    }

    public static float div(float num_1, float num_2) {
        float quotient = 0;
        quotient = num_1 / num_2; 
        return (quotient);
    }

    public static float mean(int n, int[] arr) {
        float sum = 0;
        for (int i = 0; i < n; i++)
            sum = sum + arr[i];
        return (sum / n);
    }
}
public class Calculator {

    public static void main(String[] args) {
        functions fun = new functions();
        Scanner sc = new Scanner(System.in);
        int n, j = 0;
        float num, num_1;
        float result = 0;
        char ch;
        String data = "";
        int[] array = new int[20]; 
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
            switch(choice) {
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
                    num = sc.nextFloat();
                    System.out.println("The square root of " + num + " is " + Math.sqrt(num));
                    break;
                case 6:
                    System.out.print("Enter the number: ");
                    num = sc.nextFloat();
                    System.out.print("Enter the power: ");
                    num_1 = sc.nextFloat();
                    System.out.println(num + " raised to " + num_1 + " = " + Math.pow(num, num_1));
                    break;
                case 7:
                    System.out.print("Enter the data: ");
                    while (data != "end") {
                        data = sc.nextLine();
                        try {
                            array[j] = Integer.parseInt(data);
                        } catch(Exception e) {
                            data = "end";
                            continue;
                        }
                        j = j + 1;
                    }
                    result = fun.mean(j, array);
                    System.out.println("The meam of the given data: " + result);
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