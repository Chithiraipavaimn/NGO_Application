package ngoapplication;
import com.location.Location;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class Donor implements NGODetails
{
    Scanner input=new Scanner(System.in);
    String DB_URL = "jdbc:mysql://localhost/DONORDETAILS";
    final String USER = "root";
    final String PASS = "root";
    public String first_name,last_name,city,gender,item,office,donor_ID;
    public double amount;
    int quantity,age;
    String mobile_number;
    public void getPersonalDetails()
    {
        System.out.println("Enter your First Name : ");
        first_name=input.nextLine();
        System.out.println("Enter your Last Name : ");
        last_name=input.nextLine();
        System.out.println("Enter your Age : ");
        age=input.nextInt();
        System.out.println("Enter your Gender : ");
        gender=input.next();
        System.out.println("Enter your Occupation : ");
        String occupation=input.nextLine();
        input.nextLine();
        System.out.println("Enter Phone Number : ");
        mobile_number=input.next();
        input.nextLine();
        if(mobile_number.length()!=10)
        {
            System.out.println("Invalid Mobile Number....Please enter a valid mobile number");
            System.exit(0);
        }
        System.out.println("Enter current City : ");
        city=input.nextLine();
        System.out.println("Purpose of Donating : ");
        String purpose=input.nextLine();
        office = Location.findNearestHub(city);
    }
    public void idGeneration()
    {
        Random r=new Random();
        int rn=r.nextInt(1000000);
        donor_ID=Integer.toString(rn);
        donor_ID="NGO-D"+donor_ID;
        System.out.println("----------YOU HAVE REGISTERED SUCCESSFULLY-----------");
        System.out.println("\t Name\t \t\t : "+first_name+" "+last_name);
        System.out.println("\t Register Number : "+donor_ID);
        System.out.println("------------------------------------------------------");
    }
    public void requirement()
    {
        int option;
        System.out.println("-----------OPTIONS-----------");
        System.out.println("\t (1) GOODS \n\t (2) MONEY \n\t (3) GOODS AND MONEY");
        System.out.println("-----------------------------");
        System.out.println("Enter your choice : ");
        option = input.nextInt();
        input.nextLine();
        String date;
        switch (option) {
            case 1:
                    System.out.println("Enter the Item : ");
                    item = input.nextLine();
                    System.out.println("Enter the Quantity : ");
                    quantity = input.nextInt();
                    input.nextLine();
                    System.out.println("Approximate Date of sending Goods (DD/MM/YYYY) : ");
                    date = input.next();
                    System.out.println("We request you to donate the goods to our nearest hub "+office);
                    break;
            case 2:
                System.out.println("Enter the amount : ");
                amount = input.nextDouble();
                modeOfTransaction();
                break;
            case 3:
                    System.out.println("Enter the Item : ");
                    item = input.nextLine();
                    System.out.println("Enter the Quantity : ");
                    quantity = input.nextInt();
                    System.out.println("Approximate Date of sending Goods (DD/MM/YYYY) : ");
                    date = input.next();
                    System.out.println("We request you to donate the cash to the nearest hub "+office);
                    System.out.println("Enter the amount : ");
                    amount = input.nextDouble();
                    modeOfTransaction();
                    break;
            default:
                System.out.println("Invalid Option >>>>>> Please Enter valid option");
                System.exit(0);
                break;
        }
    }
        public void modeOfTransaction()
        {
            System.out.println("----------------- OPTIONS --------------------");
            System.out.println("\t (1) BANK \n\t (2) UPI \n\t (3) CASH");
            System.out.println("--------------------------------------------");
            System.out.println("Enter your Option : ");
            int option1=input.nextInt();
            switch(option1)
            {
                case 1:
                    System.out.println("******* Our Bank Details *********");
                    System.out.println("\tBank Name: NGO\n\tAccount Number: 1786000000489685");
                    System.out.println("\tAccount Holder Name: Helper\n\tIFSC Code: NGOB0001786");
                    System.out.println("\tBranch: Sriram\n\tCity:Chennai");
                    break;
                case 2:
                    System.out.println("****** UPI ID *******");
                    System.out.println("\tngohelper@okaxis");
                    break;
                case 3:
                    System.out.println("We request you to donate the cash to the nearest hub "+office);
                    break;
                default:
                    System.out.println("Invalid Option >>>>>> Please Enter valid option");
                    System.exit(0);
                    break;

            }
        }
        public void display()
        {
            try
            {
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement statement = conn.createStatement();
                String sql = "INSERT INTO Donor_Info VALUES(\""+ donor_ID+"\",\""+first_name+"\",\""+last_name+"\",\""+age+"\",\""+gender+"\", \""+mobile_number+"\",\""+city+"\", \""+item+"\",\""+amount+"\",\""+office+"\")";
                statement.executeUpdate(sql);
                System.out.println("Thank You!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}
