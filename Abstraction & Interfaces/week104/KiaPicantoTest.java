package week104;



import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit test class for the KiaPicanto class.
 *
 * @author Roger Evans
 * @version 10/10/2019
 */
public class KiaPicantoTest
{
    @Test
    public void testConstructor1()
    {
        System.out.println("-- KiaPicantoTest testConstructor1 --");
        KiaPicanto c = new KiaPicanto("ABC123","red");
        c.info();
    }
    
    @Test
    public void testConstructor2()
    {
        System.out.println("-- KiaPicantoTest testConstructor2 --");
        KiaPicanto c = new KiaPicanto("ABC123");
        c.info();
    }
    
    @Test
    public void testStaticVar()
    {
        System.out.println("-- KiaPicantoTest testStaticVar --");
        System.out.println("Default colour (class): " + KiaPicanto.defaultColour);
        KiaPicanto c = new KiaPicanto("ABC123","red");
        System.out.println("Colour: " + c.colour);
        System.out.println("Default colour (object): " + c.defaultColour);
    }
}
