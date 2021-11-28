package week104;


/**
 * Megane is the class for Renault Megane cars. It is a subclass of Renault.
 * All Renault Meganes have a model, and (because they are Renaults) a make, 
 * a colour and registration number 
 *
 * @author Roger Evans
 * @version 16/10/2019
 */
public class Megane extends Renault implements FamilyCar, Petrol
{
    // instance variables
    private final String model = "Megane";

    /**
     * Constructors for objects of class Megane
     */
    public Megane(String myReg, String myColour)
    {
        super(myReg, myColour);
    }
    
    public Megane(String myReg)
    {
        super(myReg);
    }
    
    /**
     * Methods
     */
    @Override
    public String getModel() 
    {
        return model;
    }

    @Override
    public void info() { super.info();
        System.out.println("safety_features: " + getSafetyFeatures());
        System.out.println("load_capacity: " + getLoadCapacity());
    }

    @Override
    public String getSafetyFeatures() {
        return null;
    }

    @Override
    public int getLoadCapacity() {
        return 0;
    }
}
