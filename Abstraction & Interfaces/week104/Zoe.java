package week104;


/**
 * Zoe is the class for Renault Zoe cars. It is a subclass of Renault.
 * All Renault Zoes have a model, and (because they are Renaults) a make, 
 * a colour and registration number 
 *
 * @author Roger Evans
 * @version 16/10/2019
 */
public class Zoe extends Renault
{
    // instance variables
    private final String model = "Zoe";

    /**
     * Constructors for objects of class Zoe
     */
    public Zoe(String myReg, String myColour)
    {
        super(myReg, myColour);
    }
    
    public Zoe(String myReg)
    {
        super(myReg);
    }

    /**
     * Methods
     */
    @Override
    public String getModel() { return model; }

    @Override
    public void info() 
    {
        super.info();
    }
}
