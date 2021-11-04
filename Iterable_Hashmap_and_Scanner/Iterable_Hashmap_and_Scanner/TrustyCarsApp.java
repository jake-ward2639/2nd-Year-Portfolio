package Iterable_Hashmap_and_Scanner;


// class to provide information about our car garage
public class TrustyCarsApp
{
    // the usual 'main' method so we can run this as a program
    public static void main(String[] args)
    {
        // make an instance of the app, and then call its run method
        TrustyCarsApp app = new TrustyCarsApp();
        app.run();
    }
    
    
    public void run()
    {

        IterableScanner myObj = new IterableScanner();
        String userName;

        // Enter username and press Enter
        System.out.println("Enter username");
        userName = myObj.nextLine();

        System.out.println("Username is: " + userName);

        TrustyCars garage = new TrustyCars();           // Make a 'garage' object
        garage.add( new Car() );              // add cars to its stockList
        garage.add( new Car() );
        garage.add( new Car() );
        
        System.out.println( garage.shortListing() );    // print a list of the cars
    }      
}
