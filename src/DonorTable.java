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
            String sql = "CREATE TABLE IF NOT EXISTS Donor_Info(Donor_Id VARCHAR(50) ,First_Name VARCHAR(50),Last_Name VARCHAR(50),age INTEGER,Gender VARCHAR(50),Phone_Number VARCHAR(15),City VARCHAR(50),Item VARCHAR(50),Amount VARCHAR(50),Send_Location VARCHAR(50))";
            statement.executeUpdate(sql);
            System.out.println("Created table in given database...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
