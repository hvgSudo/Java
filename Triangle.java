public class Triangle {
    int base ;
    int height ;
    int s1 ; int s2 ; int s3 ;
    
    public Triangle(int base, int height) {
        this.base = base ;
        this.height = height ;
    }
    public Triangle(int s1, int s2, int s3) {
        this.s1 = s1 ;
        this.s2 = s2 ;
        this.s3 = s3 ;
    }
    public double getArea(int base, int height) {
        System.out.println("2 args") ;
        return (0.5 * base * height) ;
    }
    public double getArea(int s1, int s2, int s3) {
        System.out.println("3 args") ;
        return (0.7 * s1 * s2 * s3) ;
    }
    public static void main(String args[]) {
        Triangle right = new Triangle(4, 3) ;
        right.getArea(4, 3) ;
        Triangle second = new Triangle(4, 3, 5) ;
        second.getArea(4, 3, 5) ;
    }
}