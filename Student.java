public class Student {
    private String prn;
    private String name;
    
    public Student(String name, String prn) {
        this.prn = prn;
        this.name = name;
    }

    public String getName() { return name; }
    public String getPrn() { return prn; }

    public void display() {
        System.out.println("PRN: "+ prn
            +" Name: "+ name);
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 5ad223c3aef30e35323e2776352a33186419d59f
