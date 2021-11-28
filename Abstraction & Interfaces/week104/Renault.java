package week104;


/**
 * Renault is the class for all Renault cars. It is a subclass of Car.
 * All Renaults have a make, and (because they are Cars) a colour and 
 * registration number 
 *
 * @author Roger Evans
 * @version 16/10/2019
 */
public abstract class Renault extends Car
{
    // instance variables
    private final String make = "Renault";

    /**
     * Constructors for objects of class Zoe
     */
    public Renault(String myReg, String myColour)
    {
        super(myReg, myColour);
    }
    
    public Renault(String myReg)
    {
        super(myReg);
    }
    
    /**
     * Methods
     */
    public String getMake() 
    {
        return make;
    }

    public abstract String getModel();
        
    @Override
    public void info() 
    {
        super.info();
        System.out.println("Make: " + getMake());
        System.out.println("Model: " + getModel());
    }  
}
