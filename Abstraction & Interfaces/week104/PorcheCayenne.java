package week104;


/**
 * PorcheCayenne is the class for Porche Cayenne cars. It is a subclass of Car.
 * All PorcheCayennes have a model, and (because they are Cars) a colour and 
 * registration number 
 *
 * @author Roger Evans
 * @version 10/10/2019
 */
public class PorcheCayenne extends Car implements SportsCar, Electric
{
    // class variables
    static String model = "PorcheCayenne";
    static String defaultColour = "silver";
    
    /**
     * Constructors for objects of class PorcheCayenne
     */
    public PorcheCayenne(String myReg, String myColour)
    {
        super(myReg, myColour);
    }
    
    public PorcheCayenne(String myReg)
    {
        super(myReg, defaultColour);
    }

    /**
     * Methods
     */
    @Override
    public String getMake() {
        return model;
    }

    @Override
    public void info() 
    {
        super.info();
    }

    @Override
    public int getAcceleration() {
        return 0;
    }

    @Override
    public String getChromeOptions() {
        return null;
    }
}
