package ngoapplication;
//import location.Location;
import java.util.*;
public class Donor implements NGODetails
{
    Scanner input=new Scanner(System.in);
    public String first_Name,last_Name,city;
    public double amount;
    String item;
    String donor_ID;
    int quantity;
    String office;
    public void getPersonalDetails()
    {
        System.out.println("Enter your First Name : ");
        first_Name=input.nextLine();
        System.out.println("Enter your Last Name : ");
        last_Name=input.nextLine();
        System.out.println("Enter your Age : ");
        int age=input.nextInt();
        System.out.println("Enter your Gender : ");
        String gender=input.next();
        System.out.println("Enter your Occupation : ");
        String occupation=input.nextLine();
        input.nextLine();
        System.out.println("Enter Contact Number : ");
        long mobile_number=input.nextLong();
        input.nextLine();
        if(mobile_number!=10)
        {
            System.out.println("Invalid Mobile Number....Please enter a valid mobile number");
            System.exit(0);
        }
        System.out.println("Enter current City : ");
        city=input.nextLine();
        System.out.println("Purpose of Donating : ");
        String purpose=input.nextLine();
    }
    public String idGeneration()
    {
        Random r=new Random();
        int rn=r.nextInt(1000000);
        donor_ID=Integer.toString(rn);
        return donor_ID;
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
                char ch;
                do
                {
                    System.out.println("Enter the Item : ");
                    item = input.nextLine();
                    System.out.println("Enter the Quantity : ");
                    quantity = input.nextInt();
                    System.out.println("Do you want to add any other item (Y/N) :");
                    ch = input.next().charAt(0);
                    input.nextLine();
                }
                while (ch == 'y');

                //office = Location.findNearestHub(city);

                //calculate location

                System.out.println("Approximate Date of sending Goods (DD/MM/YYYY) : ");
                date = input.next();
                break;

            case 2:
                System.out.println("Enter the amount : ");
                amount = input.nextDouble();
                modeOfTransaction();
                break;
            case 3:
                do {
                    System.out.println("Enter the Item : ");
                    item = input.nextLine();
                    System.out.println("Enter the Quantity : ");
                    quantity = input.nextInt();
                    System.out.println("Do you want to add any other item (Y/N) :");
                    ch = input.next().charAt(0);
                }
                while (ch == 'y');

                //calculate location
                //office = Location.findNearestHub(city);
                System.out.println("We request you to donate the cash to the nearest hub "+office);

                System.out.println("Approximate Date of sending Goods (DD/MM/YYYY) : ");
                date = input.next();

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
                    System.out.println("Bank Name: NGO\nAccount Number: 1786000000489685");
                    System.out.println("Account Holder Name: Helper\nIFSC Code: NGOB0001786");
                    System.out.println("Branch: Sriram\nCity:Chennai");
                    break;
                case 2:
                    System.out.println("****** UPI ID *******");
                    System.out.println("ngohelper@okaxis");
                    break;
                case 3:
                    //office = Location.findNearestHub(city);
                    System.out.println("We request you to donate the cash to the nearest hub "+office);
                    break;
            }
        }
        public void display()
        {
            System.out.println("----------YOU HAVE REGISTERED SUCCESSFULLY-----------");
            System.out.println("\t Name\t : "+first_Name+" "+last_Name);
            System.out.println("\t Register Number : NGO-D"+donor_ID);
            System.out.println("-----------------------------------------------------");
        }
}
