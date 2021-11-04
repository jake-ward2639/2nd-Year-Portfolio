package Iterable_Hashmap_and_Scanner;

import java.util.HashMap;
import java.lang.Iterable;
import java.util.Iterator;

public class IterableHashMap<K, E> extends HashMap<K, E> implements Iterable<K> {
    public Iterator<K> iterator() {
        return keySet().iterator();
    }
}
