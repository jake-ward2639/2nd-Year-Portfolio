package Iterable_Hashmap_and_Scanner;


/**
 * Lab1: Making an 'iterable' HashMap which can be used in for loop
 * 
 * In the Generic classes lab (week 1.02), when we changed stockList 
 * to use a HashMap instead of an ArrayList, we had to change the for 
 * loop in TrustyBikes::shortDescription (and longDescription) to use 
 * keySet(). In this lab, we do this in a different way by creating a 
 * version of HashMap which implements the Iterable interface, and so 
 * can be used directly in the for loop
 * 
 * 1. Create a new class IterableHashMap<K,E> as a subclass of HashMap<K,E> 
 *    (with nothing added). You will need to import java.util.HashMap, 
 *    and also make sure you include the type parameters, K and E.
 * 2. Change your instance of HashMap in TrustyGarage<X> to use 
 *    IterableHashMap
 * 3. Check TrustyBikesApp still works (it should, because 
 *    IterableHashMap behaves exactly like HashMap)
 *
 * 4. Change IterableHashMap<K,E> to implement Iterable<K>. (You will 
 *    need to import java.lang.Iterable.)
 * 5. This won't compile because you need to define the method iterator 
 *    in IterableHashMap
 * 6. Define iterator, which should return an instance of Iterator<K>. 
 *    (You will need to import java.util.Iterator). For now, make it 
 *    return null.
 * 7. This will now compile (because null is an acceptable value for 
 *    ANY non-primitive return type)
 *
 * 8. Now go to TrustyBikes, and change the for loops, to just loop 
 *    over stockList (not stockList.keySet() )
 * 9. This will compile because stockList implements Iterable<Integer> 
 *    (because the K argument for stockList is Integer) and the loop 
 *    expects an int
 * 10.Try and run TrustyBikesApp - it will fail with a 
 *    java.lang.NullPointerException
 * 11.This is a very common Java error, and happens when Java is expecting
 *    an object, but gets a null.
 * 12.In this case this is because we made iterator return null, which is 
 *    not what the for loop expects.
 *    
 * 13. Go back to IterableHashMap. What should iterator really return?
 * 14. In the old version of the for loop, we used keySet() to get an 
 *     Iterable object for the loop, and the loop then asked the keySet() 
 *     object for its iterator.
 * 15. What we need to do now is return the keyset's iterator object as 
 *     the iterator for IterableHashMap
 * 16. In other words the body of the iterator method should say:
 *         return keySet().iterator() ;
 * 17. Run TrustyBikesApp again - it should work fine
 * 
 * @author Roger Evans
 * @version 3/11/2020
 */
public class Lab1
{
    // no code for this lab
}
