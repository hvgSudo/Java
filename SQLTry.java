import java.sql.*;

public class SQLTry {
	private static final String url = "jdbc:mysql://localhost:3306/";
    private static final String username = "root";
    private static final String password = "AbcD123#";
    private static final String className = "com.mysql.cj.jdbc.Driver";
    private static String table = "users";
    private static String query;

    public static void main(String[] args) {
    	boolean result;
    	view();
    	System.out.println("Insert: "+insert("Harsh", "123"));
    	System.out.println("Insert: "+insert("Ali", "124"));
    	System.out.println("Insert: "+insert("Luqmani", "125"));
    	System.out.println("Remove: "+remove("Harsh", "123"));
    	view();
    }

    private static boolean insert(String name, String id) {
        try {
            Class.forName(className);
            Connection con = DriverManager.getConnection(url+table, username, password);
            Statement st = con.createStatement();
            query = "insert into "+ table +" values("+ "'"+ name +"', '"+ id +"');";
            ResultSet rs = st.executeQuery(query);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    private static boolean remove(String name, String id) {
        try {
            Class.forName(className);
            Connection con = DriverManager.getConnection(url+table, username, password);
            Statement st = con.createStatement();
            query = "delete from "+ table +" where ('name' = "+ name + " AND 'id' = "
                        + id +");";
            ResultSet rs = st.executeQuery(query);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    private static void view() {
    	try {
    		Class.forName(className);
            Connection con = DriverManager.getConnection(url+table, username, password);
            Statement st = con.createStatement();
            query = "select * from "+ table +";";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
            	System.out.println(rs.getString(1) +" "+ rs.getString(2));
            }
            con.close();
    	} catch (Exception e) {
    		System.out.println(e.getMessage());
    	}
    }
}