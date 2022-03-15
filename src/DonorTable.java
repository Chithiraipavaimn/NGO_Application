import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DonorTable
{
    public static void main(String[] args)
    {
        String DB_URL = "jdbc:mysql://localhost/";
        final String USER = "root";
        final String PASS = "root";
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            String sql = "CREATE DATABASE DONORDETAILS";
            statement.executeUpdate(sql);
            System.out.println("DataBase Successfully created..");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            DB_URL +="DONORDETAILS";
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS DonorTable(Donor_Id INTEGER ," + "First_Name VARCHAR(255), " + " Last_Nmame VARCHAR(255), " + " age INTEGER," + "Gender VARCHAR(255)," + "Phone_Number INTEGER," + "City VARCHAR(255)," + "Item VARCHAR(255)," + "Amount INTEGER," +"Send_Location VARCHAR(255))";
            statement.executeUpdate(sql);
            System.out.println("Created table in given database...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
