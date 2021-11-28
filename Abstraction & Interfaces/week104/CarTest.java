package week104;



import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit test class for the Car class.
 *
 * @author Roger Evans
 * @version 10/10/2019
 */
/**
 * THIS IS NO LONGER BEING USED BECAUSE JUNIT DOESNT REALLY WORK WITH ABSTRACT CLASSES
public class CarTest
{
    @Test
    public void testConstructor1()
    {
        System.out.println("-- CarTest testConstructor1 --");
        Car c = new Car("ABC123","red");
        c.info();
    }
    
    @Test
    public void testConstructor2()
    {
        System.out.println("-- CarTest testConstructor2 --");
        Car c = new Car("ABC123");
        c.info();
    }
    
    @Test
    public void testStaticVar()
    {
        System.out.println("-- CarTest testStaticVar --");
        System.out.println("Default colour (class): " + Car.defaultColour);
        Car c = new Car("ABC123","red");
        System.out.println("Default colour (object): " + c.defaultColour);
    }
}
*/