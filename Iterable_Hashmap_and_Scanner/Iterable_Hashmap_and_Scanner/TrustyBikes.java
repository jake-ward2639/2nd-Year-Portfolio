package Iterable_Hashmap_and_Scanner;




// A class for a TrustyBikes garage
public class TrustyBikes extends TrustyGarage<Bike>
{
   
    
    // Method to make a list of all the stock using the shortDescription 
    // of each  bike
    public String shortListing()
    {   
        String theListing = "";         // Start off with an empty string
        
        for (int i: stockList)
        {
            Bike b = stockList.get(i);
            // for each bike, get its short description,add it to the string
            // and end the line
            theListing = theListing + i + ": " + b.shortDescription() + "\n";
        }
        
        // Now we have a big string with all the bikes described
        return theListing;
    }
    
    // Method to print long (muti-line) list of all the bikes
    // Just like shortListing, but using longDescription
    public String longListing()
    {   
        String theListing = "";
        
        for (int i: stockList)
        {
            Bike b = stockList.get(i);
            theListing = theListing + i + ": " + b.longDescription() + "\n";
        }
        
        return theListing;
    }
}
