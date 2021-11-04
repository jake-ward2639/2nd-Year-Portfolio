package Iterable_Hashmap_and_Scanner;

import java.util.Scanner;
import java.util.regex.Pattern;


// Static wrapper for Scanner( System.in ).
// Only basic types supported so far.
// Don't expose access to KBD.

public class Keyboard
{
    private static final Scanner KBD = new Scanner( System.in );

    // Note: close() is specifically not supported as it would
    // close System.in which we NEVER want to do.

    public static Pattern delimiter() { return KBD.delimiter(); }

    public static boolean hasNext() { return KBD.hasNext(); }
    public static boolean hasNextBoolean() { return KBD.hasNextBoolean(); }
    public static boolean hasNextDouble() { return KBD.hasNextDouble(); }
    public static boolean hasNextInt() { return KBD.hasNextInt(); }
    public static boolean hasNextLine() { return KBD.hasNextLine(); }
    public static boolean hasNextLong() { return KBD.hasNextLong(); }

    public static String next() { return KBD.next(); }
    public static boolean nextBoolean() { return KBD.nextBoolean(); }
    public static double nextDouble() { return KBD.nextDouble(); }
    public static int nextInt() { return KBD.nextInt(); }
    public static String nextLine() { return KBD.nextLine(); }
    public static long nextLong() { return KBD.nextLong(); }

    // These do not return a Scanner as this would expose the
    // KBD private member.
    public static void useDelimiter( Pattern pattern ) { KBD.useDelimiter( pattern ); }
    public static void useDelimiter( String pattern ) { KBD.useDelimiter( pattern ); }
}