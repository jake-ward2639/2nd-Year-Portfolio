package week104;


import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit test class for the Zoe class.
 *
 * @author Roger Evans
 * @version 16/10/2019
 */
public class ZoeTest
{
     @Test
    public void testConstructor1()
    {
        System.out.println("-- ZoeTest testConstructor1 --");
        Zoe c = new Zoe("ABC123","red");
        c.info();
    }
    
    @Test
    public void testConstructor2()
    {
        System.out.println("-- ZoeTest testConstructor2 --");
        Zoe c = new Zoe("ABC123");
        c.info();
    }
}
