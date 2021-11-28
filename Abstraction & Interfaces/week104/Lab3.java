package week104;


/**
 * Lab3 - Discussion - not really stuff to do unless you are very keen
 * 
 * You now have three different ways of classifying cars - by make/model, by 
 * car-type and by fuel. Make/model was the first one, so it uses the class
 * structure - it's the one we are really implementing. Car-type adds some methods, 
 * and so some additional implementation requirements. Fuel just adds marker 
 * interfaces - new types.
 * 
 * But of course we didn't have to do it this way. We could have made car-type the
 * main class hierarchy, with make/model done with interfaces. (Sketch out what 
 * this might be like?) We could have provided methods for the fuel types, rather
 * than just markers.
 * 
 * You might notice that when we added the car-types, we started duplicating 
 * methods again (as we had originally with the info method). Because the car-types
 * are interfaces not classes, they can't easily share methods the way classes do.
 * 
 * There's no one right way to design these things, and the classes at the bottom 
 * of the tree will probably end up with the same methods however you do it - it's 
 * more a question of how much implementation (ie code, and instance variables) can
 * be shared, and how easy the code is to extend.
 *  
 * It's easy to spend a lot of time fiddling around with this, and changing your 
 * mind about the type structures (this is called 're-factoring'). Trying to get
 * the design right before you code can be very helpful. And that is why soon
 * we will start looking at UML - a language for exactly that!
 *  
 * @author Roger Evans
 * @version 25/10/2020
 */
public class Lab3
{
    
}
