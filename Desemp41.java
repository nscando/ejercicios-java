// The "Desemp41" class.
import java.awt.*;
import hsa.Console;

public class Desemp41
{
    static Console c;           // The output console
    public static void main (String[] args)
    {
        int i, a;
        c = new Console ();
        i = 6;
        a = 0;
        
        while (i <= 50)
        {

            a = a + (i * 5); 
                c.println (i + "-->"  + a   );

            i++;
        }
        // Place your program here.  'c' is the output console
    } // main method
} // Desemp41 class


//Imprimí la suma final de 50 términos de la
//serie:
//5 * 6 + 5 * 7 + 5 * 8 + 5 * 9 + …

