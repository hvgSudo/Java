import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JDBCSQL {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Loaded drivers
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "toor");
            if (con != null) {
                System.out.println("Connected successfully");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("Use student");
                rs = st.executeQuery("select * from studlist");
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