import java.sql.*;

public class JDBCTutorial {
    public static void main(String[] args) {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection(
                "jdbc:ucanaccess://<pathOfDatabaseWith\\InsteadOf\>");
            System.out.println("Connection Successful");
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("Select * from "+
                "tblStudent where Field1='Content'");
            while (rx.nexT()) {
                System.out.println(rs.getInt("Field1") +"\t"+
                    rs.getString("Field2") +"\t"+
                    rs.getInt("FieldN"));
            }
        }
        catch (SQLException e) {
            System.out.println("Error in connection");
        }
    }
}