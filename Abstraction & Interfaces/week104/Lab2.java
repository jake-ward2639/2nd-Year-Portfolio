package week104;


/**
 * Lab2 - Inheritance
 * 
 * Task 1:
 *   - Add the interface classes from the lecture slides, for SportsCar, FamilyCar 
 *     and MPV. (You could add more, such as SUV - look at the Renault website for 
 *     ideas about cars and types)
 *   - Now change some of the models to use them - for example change Megane so it 
 *     says 'public class Megane extends Car implements FamilyCar'
 *   - When you do this to Megane, the compiler will complain because you haven't
 *     provided the methods that FamilyCar expects. So add them, and perhaps uncomment
 *     the old info method and change it to print out saftyFeatures and loadCapacity 
 *     too.
 *   - Do the same with Espace and the MPV interface, and maybe KiaPicanto and 
 *     FamilyCar and PorcheCayenne and SportsCar
 * Task 2:
 *   - Create three more interfaces, called Petrol, Diesel and Electric. Don't put 
 *     any method signatures in them. Even without specifying any methods, 
 *     interfaces are a way of attaching a new type to a class. We call such 
 *     interfaces MARKER interfaces
 *   - Add Petrol to Megane and Espace, and Electric to Zoe. So Megane's first line
 *     now says 'public class Megane extends Car implements FamilyCar, Petrol'
 *   - Because these interfaces have no methods, the classes will compile with
 *     no other changes
 *   - Add a new @Test routine to MeganeTest (and other Test classes?) to check 
 *     what types it has, using instanceof, like this:
 *        @Test
 *        public void testTypes()
 *        {
 *            System.out.println("-- MeganeTest testTypes --");
 *            Megane c = new Megane("ABC123");
 *            System.out.print("Types: ");
 *            if (c instanceof FamilyCar) { System.out.print("FamilyCar"); }
 *            if (c instanceof Petrol) { System.out.print("Petrol"); }
 *            if (c instanceof Electric) { System.out.print("Electric"); }
 *            System.out.println("");
 *        }
 * 
 * @author Roger Evans
 * @version 16/10/2019
 */
public class Lab2
{
    
}
