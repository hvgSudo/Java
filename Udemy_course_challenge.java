public class Udemy_course_challenge {
    private String name, email;
    private int creditLimit;
    public Udemy_course_challenge() {
        this("Default", "Default@Default");
        System.out.println("default constrcutor");
    }
    public Udemy_course_challenge(String name, String email) {
        this(name, email, 123456);
    }
    public Udemy_course_challenge(String name, String email, int limit) {
        this.name = name;
        this.email = email;
        this.creditLimit = limit;
        System.out.println("Parameterized constructor");
    }

    public String getName() { return this.name; }
    public String getEmail() { return this.email; }
    public int getCreditLimit() { return this.creditLimit; }
}
