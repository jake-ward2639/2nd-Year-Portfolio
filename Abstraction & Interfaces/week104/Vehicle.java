package week104;


/**
 * Vehicle is the superclass for all types of vehicle
 * All vehicles have a registration number
 *
 * @author Roger Evans
 * @version 10/10/2019
 */
public class Vehicle
{
    // instance variables
    public String registrationNumber = "";

    /**
     * Constructors for objects of class Vehicle
     */
    public Vehicle(String myReg)
    {
        System.out.println("Setting registration number to: "+ myReg);
        registrationNumber = myReg;
    }
    
    public Vehicle()
    {
        System.out.println("Warning: creating vehicle without registration number");
    }
    
    /**
     * Methods
     */
    public void info() 
    {
        System.out.println("Registration number: " + registrationNumber);
    }
}
