package week104;



import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit test class for the Vehicle class.
 *
 * @author Roger Evans
 * @version 10/10/2019
 */
public class VehicleTest
{
    @Test
    public void testConstructor1()
    {
        System.out.println("-- VehicleTest testConstructor1 --");
        Vehicle v = new Vehicle("ABC123");
        v.info();
    }
    
    @Test
    public void testConstructor2()
    {
        System.out.println("-- VehicleTest testConstructor2 --");
        Vehicle v = new Vehicle();
        v.info();
    }
}
