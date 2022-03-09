package ngoapplication;

public interface NGO_Details
{
     void getPersonalDetails();
    String idGeneration();
    default void requirement()
    {
        System.out.println("The Requirements of Donor and Needy People.");
    }
    static void end()
    {
        System.out.println("Thanks for visiting us. Welcome,back.");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
    }
}
