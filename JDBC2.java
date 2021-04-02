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
                System.out.println("Enter the first name to search: ");
                String name = in.nextLine();

                Statement st = con.createStatement();
                st.executeQuery("use student");
                st.executeUpdate("insert into studlist calues(1,'Saurabh','ganguly', 'CS')")

                PreparedStatement pst = con.prepareStatement("select * from studlist where rollno = ? and firstname = ?");
                pst.setInt(1, rno);
                pst.setString(2, name);

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
