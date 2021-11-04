package Iterable_Hashmap_and_Scanner;

import java.util.Iterator;
import java.lang.Iterable;

public class IterableScanner extends Keyboard implements Iterable<String>{ //scanner is a final class and so cannot be inherited from
    @Override //thus keyboard is a wrapper class that allows us to use scanner getters and setters
    public Iterator<String> iterator() {
        return this.iterator();
    }
}
