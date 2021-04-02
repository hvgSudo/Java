import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCSQL {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Loaded drivers
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "toor");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}