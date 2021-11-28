package week104;



import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit test class for the PorcheCayenne class.
 *
 * @author Roger Evans
 * @version 10/10/2019
 */
public class PorcheCayenneTest
{
    @Test
    public void testConstructor1()
    {
        System.out.println("-- PorcheCayenneTest testConstructor1 --");
        PorcheCayenne c = new PorcheCayenne("ABC123","red");
        c.info();
    }
    
    @Test
    public void testConstructor2()
    {
        System.out.println("-- PorcheCayenneTest testConstructor2 --");
        PorcheCayenne c = new PorcheCayenne("ABC123");
        c.info();
    }
    
    @Test
    public void testStaticVar()
    {
        System.out.println("-- PorcheCayenneTest testStaticVar --");
        System.out.println("Default colour (class): " + PorcheCayenne.defaultColour);
        PorcheCayenne c = new PorcheCayenne("ABC123","red");
        System.out.println("Colour: " + c.colour);
        System.out.println("Default colour (object): " + c.defaultColour);
    }
}
