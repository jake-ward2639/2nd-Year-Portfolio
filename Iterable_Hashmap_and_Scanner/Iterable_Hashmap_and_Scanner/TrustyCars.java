package Iterable_Hashmap_and_Scanner;



// A class for a TrustyCars garage
public class TrustyCars extends TrustyGarage<Car>
{
    
    // Method to make a list of all the stock using the shortDescription 
    // of each car
    public String shortListing()
    {   
        String theListing = "";         // Start off with an empty string
        
        for (int i: stockList.keySet())
        {
            Car c = stockList.get(i);
            // for each car, get its short description,add it to the string
            // and end the line
            theListing = theListing + i + ": " + c.shortDescription() + "\n";
        }
        
        // Now we have a big string with all the cars described
        return theListing;
    }
}
