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
            String sql = "CREATE TABLE IF NOT EXISTS NeedyTable(Needy_Id INTEGER ," + "First_Name VARCHAR(255), " + " Last_Name VARCHAR(255), " + " Age INTEGER," + "Gender VARCHAR(255)," + "Phone_Number INTEGER," + "City VARCHAR(255)," + "Item VARCHAR(255)," + "Amount INTEGER," + "Account_Holder_Name VARCHAR(255)," + "Account_Number INTEGER," + "IFSC_Code VARCHAR(255)," + "Branch_Name VARCHAR(255)," + "UPI_ID VARCHAR(255),"  +"Recieve_Location VARCHAR(255))";
            statement.executeUpdate(sql);
            System.out.println("Created table in given database...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
