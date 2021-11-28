package week104;


/**
 * Espace is the class for Renault Espace cars. It is a subclass of Renault.
 * All Renault Espaces have a model, and (because they are Renaults) a make, 
 * a colour and registration number 
 *
 * @author Roger Evans
 * @version 16/10/2019
 */
public class Espace extends Renault implements MPV, Petrol
{
    // instance variables
    private final String model = "Espace";

    /**
     * Constructors for objects of class Espace
     */
    public Espace(String myReg, String myColour)
    {
        super(myReg, myColour);
    }
    
    public Espace(String myReg)
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
    public void info() 
    {
        super.info();
    }

    @Override
    public String getSafetyFeatures() {
        return null;
    }

    @Override
    public int getLoadCapacity() {
        return 0;
    }

    @Override
    public Boolean hasRemovableSeats() {
        return null;
    }
}
