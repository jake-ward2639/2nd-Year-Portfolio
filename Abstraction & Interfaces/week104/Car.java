package week104;


/**
 * Car is the superclass for all types of car. It is a subclass of Vehicle.
 * All cars have a colour, and a registration number (because they are Vehicles)
 *
 * @author Roger Evans
 * @version 10/10/2019
 */
public abstract class Car extends Vehicle

{
    // class variables
    static String defaultColour = "black";
    
    // instance variables
    public String colour  = "";

    /**
     * Constructors for objects of class Car
     */
    public Car(String myReg, String myColour)
    {
        super(myReg);
        System.out.println("Setting colour to: " + myColour);
        colour = myColour;
    }
    
    public Car(String myReg)
    {
        this(myReg, defaultColour);
    }
    
    /**
     * Methods
     */
    public abstract String getMake();

    @Override
    public void info() 
    {
        super.info();
        System.out.println("Colour: " + colour);
        System.out.println("Model: " + getMake());
    }
}
