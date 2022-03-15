package ngoapplication;

public interface NGODetails
{
    void getPersonalDetails();
    void idGeneration();
    void display();
    default void requirement()
    {
        System.out.println("The Requirements of Donor and Needy People.");
    }
    static void end()
    {
        System.out.println("-------------------------------------------");
        System.out.println("Contact Number : 9876543210");
        System.out.println("If you have any queries feel free to contact");
        System.out.println("Thanks for visiting us ........ Welcome Back.");
    }
}
