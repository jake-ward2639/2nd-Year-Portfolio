package Iterable_Hashmap_and_Scanner;

/**
 * An abstract garage class for the Trusty empire
 *
 * @author Roger Evans
 * @version 19/10/2020
 */
public class TrustyGarage<X>
{
    // The garage uses an ArrayList to hold all its stock of bikes
    protected IterableHashMap<Integer, X> stockList = new IterableHashMap<>();
    private int stockNumber = 0;
    
    public void add(X... bList )
    {
        for (X b: bList) {
            stockList.put(++stockNumber, b);
        }
    }
}
