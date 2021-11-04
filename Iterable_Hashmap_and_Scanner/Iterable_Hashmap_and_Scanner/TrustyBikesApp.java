package Iterable_Hashmap_and_Scanner;


// class to provide information about our bike garage
public class TrustyBikesApp
{
    // the usual 'main' method so we can run this as a program
    public static void main(String[] args)
    {
        // make an instance of the app, and then call its run method
        TrustyBikesApp app = new TrustyBikesApp();
        app.run();
    }
    
    
    public void run()
    {
        TrustyBikes garage = new TrustyBikes();         // Make a 'garage' object
        garage.add( new Bike(), new Bike() );             // add bikes to its stockList
        garage.add( new Yamaha500(2017, 5000), new Suzuki750(2018, 6500)  );
        garage.add( );
        
        System.out.println( garage.longListing() );     // print a list of the bikes
    }      
}
