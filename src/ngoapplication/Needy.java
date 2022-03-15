package ngoapplication;
import java.util.*;

public class Needy implements NGODetails
{
        Scanner input=new Scanner(System.in);
        public String first_name,last_name,city,needy_ID;
        public double amount;
        String item,office;
        int quantity;
        public void getPersonalDetails()
        {
            System.out.println("Enter your First Name : ");
            first_name=input.nextLine();
            System.out.println("Enter your Last Name : ");
            last_name=input.nextLine();
            System.out.println("Enter your Age : ");
            int age=input.nextInt();
            System.out.println("Enter your Gender : ");
            String gender=input.next();
            System.out.println("Enter your Occupation : ");
            String occupation=input.nextLine();
            input.nextLine();
            System.out.println("Enter Phone Number : ");
            String mobile_number=input.next();
            if(mobile_number.length()!=10)
            {
                System.out.println("Invalid phone number. Enter valid phone number.");
                System.exit(0);
            }
            System.out.println("Enter current City : ");
            city=input.nextLine();
            System.out.println("Marital Status : ");
            String status=input.nextLine();
        }
        public String idGeneration()
        {
            Random r=new Random();
            int rn=r.nextInt(1000000);
            needy_ID=Integer.toString(rn);
            return needy_ID;
        }
        public void display()
        {
            System.out.println("********You have successfully Registered*********");
            System.out.println("Name: "+first_name+" "+last_name);
            System.out.println("Registration No: NGO-N"+needy_ID);
        }
        public void requirement()
        {
            int option;
            System.out.println("1) Goods \n2) Money \n3) Goods and Money \nEnter your option : ");
            option = input.nextInt();
            input.nextLine();
            String date;
            switch (option)
            {
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
                    System.out.println("We request you to collect the goods from our nearest hub "+office);
                    break;

                case 2:
                    amountNeeded();
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
                    System.out.println("We request you to collect the goods from our nearest hub "+office);

                    amountNeeded();
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
            System.out.println("1)Bank \n2)UPI \n3)Cash \nEnter your Option :");
            int option1=input.nextInt();
            switch (option1) {
                case 1 :
                    System.out.println("****************Bank Details************");
                    System.out.println("Bank Name : ");
                    String bank_Name = input.nextLine();
                    input.nextLine();
                    System.out.println("Account Number : ");
                    long acc_no = input.nextLong();
                    System.out.println("Account Holder Name : ");
                    String acc_name = input.nextLine();
                    input.nextLine();
                    System.out.println("IFSC Code : ");
                    String ifsc = input.nextLine();
                    System.out.println("Branch: ");
                    String branch = input.nextLine();
                    System.out.println("City : ");
                    String bank_city = input.nextLine();
                    break;
                case 2 :
                    System.out.println("Enter your upi_id no : ");
                    String upi_id = input.nextLine();
                    break;
                case 3 :
                    System.out.println("We request you to collect the cash from our nearest hub " + office);
                    break;
                default:
                    System.out.println("Enter Valid Option");
                    System.exit(0);
            }
        }
        public void amountNeeded()
        {
            System.out.println("* Education\n* Medical\n* Women Empowerment\n* Unemployed)");
            System.out.println("Enter the Reason : ");
            String reason=input.nextLine();
            String convert_reason=reason.toLowerCase();
            switch (convert_reason)
            {
                case "education":
                    amount = 25000;
                    break;
                case "medical" :
                    amount = 30000;
                    break;
                case "women empowerment" :
                    amount = 20000;
                    break;
                case "unemployed":
                    amount = 10000;
                    break;
                default :
                    System.out.println("Sorry.  We Need a Valid Reason to help you. Retry with a Valid Reason.");
                    break;
            }
        }
}
