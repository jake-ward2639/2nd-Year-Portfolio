package week104;


/**
 * KiaPicanto is the class for Kia Picanto cars. It is a subclass of Car.
 * All KiaPicantos have a model, and (because they are Cars) a colour and 
 * registration number 
 *
 * @author Roger Evans
 * @version 10/10/2019
 */
public class KiaPicanto extends Car

{
    // class variables
    static String model = "KiaPicanto";

    /**
     * Constructors for objects of class KiaPicanto
     */
    public KiaPicanto(String myReg, String myColour)
    {
        super(myReg, myColour);
    }
    
    public KiaPicanto(String myReg)
    {
        super(myReg);
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
        System.out.println("Model: " + model);
    }  
}
