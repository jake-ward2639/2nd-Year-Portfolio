package week104;


import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit test class for the Megane class.
 *
 * @author Roger Evans
 * @version 16/10/2019
 */
public class MeganeTest
{
    @Test
    public void testConstructor1()
    {
        System.out.println("-- MeganeTest testConstructor1 --");
        Megane c = new Megane("ABC123","red");
        c.info();
    }
    
    @Test
    public void testConstructor2()
    {
        System.out.println("-- MeganeTest testConstructor2 --");
        Megane c = new Megane("ABC123");
        c.info();
    }

    @Test
    public void testTypes()
    {
        System.out.println("-- MeganeTest testTypes --");
        Megane c = new Megane("ABC123");
        System.out.print("Types: ");
        if (c instanceof FamilyCar) { System.out.print("FamilyCar"); }
        if (c instanceof Petrol) { System.out.print("Petrol"); }
        if (c instanceof Electric) { System.out.print("Electric"); }
        System.out.println("");
    }
}
