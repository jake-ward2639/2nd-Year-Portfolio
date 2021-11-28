package week104;


import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit test class for the Espace class.
 *
 * @author Roger Evans
 * @version 16/10/2019
 */
public class EspaceTest
{
    @Test
    public void testConstructor1()
    {
        System.out.println("-- EspaceTest testConstructor1 --");
        Espace c = new Espace("ABC123","red");
        c.info();
    }
    
    @Test
    public void testConstructor2()
    {
        System.out.println("-- EspaceTest testConstructor2 --");
        Espace c = new Espace("ABC123");
        c.info();
    }
}
