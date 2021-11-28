package week104;


/**
 * Lab 1 - Abstraction
 * 
 * This lab project contains the car classes from last week, plus a new set of
 * Renault classes. These include a class for the Make as well as the model, which
 * you may have added for Kia and Porche last week. (Don't worry if you haven't, 
 * but worth having a go sometime.)
 * 
 * Task 1: 
 *   - Compile everything and run MeganeTest (or EspaceTest or ZoeTest) to check 
 *     it works.
 *   - Turn Renault into an abstract class (easy - just add the word abstract 
 *     before class)
 *   - compile everything again, and run MeganeTest again
 *   - add an abstract method to Renault with signature String getModel()
 *   - compile everything again - Zoe will break - see if you can see why, and fix 
 *     it (if you need a hint, compare it with the other two models)
 *   - Notice that the info method in all three model classes is the same - this
 *     is not ideal.
 *   - Take the second line of Megane::info and add it to Renault::info (Renault 
 *     will still compile, even though it doesn't have a getModel implementation,
 *     because it has declared getModel as abstract)
 *   - Now comment out the definitions of info from all three Renault model classes
 *   - Compile everything and run the tests - all should be ok
 *   - What you have done is made the code less repetitive by using an abstract 
 *     class and method to make sure the getModel functionality is provided by 
 *     subclasses so it can refer to it in its info method.
 * Task 2:
 *   - Do the same with Car and Car::getMake - make them both abstract and push 
 *     the info definition up from Renault to Car. 
 *   - You will need to push the Renault::getModel up to Car as well.
 *   - KiaPicanto and PorcheCayenne will break - you need to remodel them the
 *     way the Renault classes are organised
 *   - Also CarTest will break - in general it's hard to have JUnit tests for
 *     abstract classes, because you can't make instances of them. Easiest just
 *     to remove it!
 * Task 3:
 *   - If you really want to, do the same thing with Vehicle, so there's just one
 *     info method right at the top - but to be honest, lab 2 is more fun!!
 *
 * @author Roger Evans
 * @version 26/10/2021
 */
public class Lab1
{
   // nothing here today
}
