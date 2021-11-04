package Iterable_Hashmap_and_Scanner;


/**
 * Lab2: Scanner as an Iterable class (Challenge lab - fewer instructions!)
 * 
 * This one is not really related to TrustyCars, but you can do it in 
 * the same project.
 * 
 * 1. Scanner implements the Iterator<String> interface
 *    It would be nice (or at least fun) to use the same technique as we
 *    did with HashMap, to make it possible to use Scanner in a for loop. 
 * 2. Like HashMap, we would like to start by creating a subclass of Scanner, 
 *    called IterableScanner, which implements the Iterable<String> interface,
 *    by providing an iterator method which just returns the object itself. 
 *    BUT: Scanner won't let you create subclasses! (We will find
 *    why/how you do that in Java in a few weeks). 
 * 3. What can you do if you want to subclass a class that won't let you? 
 *    There's an answer at the end of this file, but you could try and
 *    work it out (or research it) yourself ...
 * 4. However you do it, you need to end up with a class IterableScanner that 
 *    behaves like Scanner (with the main Scanner methods - not necessarily 
 *    all of them), and implements Iterable(String) (implements iterator, 
 *    returning something that implements Iterator(String)
 * 5. Use this class to create IterableScanner objects which can be used 
 *    directly in for loops, reading input each time round the loop
 * 6. Test your code with a simple program that says hello to each name you 
 *    type, by using an IterableScanner object in a for loop
 * 
 * NB: In BlueJ you can't really tell Scanner you have finished giving input, 
 *     so you need to test for 'end' and then break to stop the loop. 
 *
 * @author Roger Evans
 * @version 04/11/2020
 */
public class Lab2
{
   // no code for this lab
}

// HINTS:
// You can't subclass Scanner, but you can create a WRAPPER class around a Scanner
// object. A wrapper class is a class which has an existing object (in this case 
// a Scanner object) inside it (which you pass to its constructor function)
// and provides methods to access and extend its functionality. The wrapper class 
// provides methods with the same signature as the wrapped object, which simply 
// call the same method on the wrapped object (we sometimes call this DELEGATING 
// a method to the wrapped object). Ideally you provide all of the methods, but 
// there are often a lot, so you may only provide a few key ones. This class 
// behaves like the wrapped object but you can also add methods, 
// or add things to the delegated methods