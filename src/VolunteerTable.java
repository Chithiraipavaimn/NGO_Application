import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
public class VolunteerTable
{
    public static void main(String[] args)
    {
        String DB_URL = "jdbc:mysql://localhost/";
        final String USER = "root";
        final String PASS = "Heidi@#08zx$";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            String sql = "CREATE DATABASE VOLUNTEERDETAILS";
            statement.executeUpdate(sql);
            System.out.println("DataBase Successfully created..");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            DB_URL +="VOLUNTEERDETAILS";
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS volunteerTable(volunteer_Id INTEGER ," + "first_name VARCHAR(255), " + " last_name VARCHAR(255), " + " age INTEGER," + "Gender VARCHAR(255)," + "Phone_Number INTEGER," + "City VARCHAR(255)," + "Availability VARCHAR(255),"+"Work_Location VARCHAR(255))";
            statement.executeUpdate(sql);
            System.out.println("Created table in given database...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
