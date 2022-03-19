package ngoapplication;
import com.location.Location;

import java.sql.*;
import java.util.Scanner;

public class Volunteer implements NGODetails
{
    static final String DB_URL = "jdbc:mysql://localhost/VOLUNTERDETAILS";
    static final String USER = "root";
    static final String PASS = "root";
    String first_name,last_name,city,ph_number,availability,office,gender;
    String volunteer_Id="";
    int age;
    public void getPersonalDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First Name : ");
        first_name = input.nextLine();
        System.out.println("Enter your Last Name : ");
        last_name = input.nextLine();
        System.out.println("Enter your Age : ");
        age = input.nextInt();
        try {
            if (age < 18) {
                throw new InvalidAgeException("Invalid Age Exception");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Error" + e.getMessage());
        }
        input.nextLine();
        System.out.println("Enter your Gender : ");
        gender = input.nextLine();
        System.out.println("Enter your Phone Number : ");
        ph_number = input.nextLine();
        if (ph_number.length() != 10) {
            System.out.println("Invalid phone number. Enter Valid Phone number.");
            System.exit(0);
        }
        System.out.println("Enter your City : ");
        city = input.nextLine();
        office = Location.findNearestHub(city);
        System.out.println("1-->Weekdays \n2-->Weekend. \nEnter your Availability :");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                availability = "Weekdays";
                System.out.println("Thanks for letting us to know.  In future, if we need any help we will inform you.");
                break;
            case 2:
                availability = "Weekend";
                System.out.println("Thanks for letting us to know.  In future, if we need any help we will inform you. ");
                break;
            default:
                System.exit(0);
        }
        System.out.println("Your Work Location is : "+office);
    }
     public void idGeneration()
    {
        String l=last_name.toLowerCase(),f=first_name.toLowerCase();
        if(first_name.length()<last_name.length())
        {
            volunteer_Id=volunteer_Id+l.charAt(0)+f;
        }
        else if(first_name.length()>last_name.length())
        {
            volunteer_Id=volunteer_Id+f.charAt(0)+l;
        }
        else
        {
            if(f.charAt(0)<l.charAt(0))
            {
                volunteer_Id=volunteer_Id+f.charAt(0)+l;
            }
            else
            {
                volunteer_Id=volunteer_Id+l.charAt(0)+f;
            }
        }
        volunteer_Id=volunteer_Id+ph_number.charAt(10-1);
        volunteer_Id = "NGO-V"+volunteer_Id;
        System.out.println("----------YOU HAVE REGISTERED SUCCESSFULLY------------");
        System.out.println("\t Name\t : "+first_name+" "+last_name);
        System.out.println("\t Register Number : "+volunteer_Id);
        System.out.println("--------------------------------------------------------");
    }
    public void display()
    {
        try
        {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            String sql = "Insert into voluntertable values(\""+volunteer_Id+"\",\""+first_name +"\",\""+last_name +"\","+age+",\""+gender+"\",\""+ph_number+"\",\""+city+"\",\""+availability+"\",\""+office+"\")";
            statement.executeUpdate(sql);
            System.out.println("Thank You...!");
        } catch (SQLException e) {
            e.printStackTrace();
    }
}
}

