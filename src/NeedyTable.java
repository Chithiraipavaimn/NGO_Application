import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NeedyTable
{
    public static void main(String[] args)
    {
        String DB_URL = "jdbc:mysql://localhost/";
        final String USER = "root";
        final String PASS = "root";
       try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            String sql = "CREATE DATABASE NEEDYDETAILS";
            statement.executeUpdate(sql);
            System.out.println("DataBase Successfully created..");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            DB_URL +="NEEDYDETAILS";
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS NeedyPeoples(Needy_Id VARCHAR(255)," + "First_Name VARCHAR(255), " + " Last_Name VARCHAR(255), " + " Age INTEGER," + "Gender VARCHAR(255)," + "Phone_Number VARCHAR(255)," + "City VARCHAR(255)," + "Item VARCHAR(255)," + "Amount VARCHAR(255)," + "Account_Holder_Name VARCHAR(255)," + "Account_Number VARCHAR(255)," + "IFSC_Code VARCHAR(255)," + "Branch_Name VARCHAR(255)," + "UPI_ID VARCHAR(255),"  +"Recieve_Location VARCHAR(255))";
            statement.executeUpdate(sql);
            System.out.println("Created table in given database...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
