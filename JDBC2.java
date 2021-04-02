import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBC2 {

    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Loaded drivers
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "toor");
            if (con != null) {
                System.out.println("Connected successfully");
                System.out.println("Enter the roll number to search for: ");
                int rno = in.nextInt();

                PreparedStatement pst = con.prepareStatement("select * from studlist where rollno = ?");
                pst.setInt(1, rno);

                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    System.out.println(rs.getInt("rollno") +
                        rs.getString("firstname") + rs.getString("lastname") +
                        rs.getString("brachn"));
                }
                }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
