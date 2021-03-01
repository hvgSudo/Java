import java.util.Scanner;

public class trying {

        public static void main(String[] args) {
                double n_1, sum = 0.0, count = 0.0;
                String data;
                Scanner s = new Scanner(System.in);
                Calc Obj1 = new Calc();
                data = s.nextLine();
                while (true) {
                        data = s.nextLine();
                        Obj1.avg(data);
                        if (data.equals("end"))
                                break;
                        else {
                                n_1 = Double.parseDouble(data);
                                sum = sum + n_1;
                                count = count + 1;
                        }
                }
                s.close();
                Obj1.test(1);
                Obj1.test(2);
                Obj1.test(3);
                Obj1.test(4);
        }
        
}
class Calc {
        int b = 0;
        double sum = 0, count = 0;
        public void avg (String data) {
                double num = Double.parseDouble(data);
                sum = sum + num;
                count = count + 1;
                if (data.equals("end")) {
                        System.out.println("Result: "+ (sum / count));
                }
        }
        public void test (int a) {
                b = b + 1;
                System.out.println("b = "+ b);
        }
}