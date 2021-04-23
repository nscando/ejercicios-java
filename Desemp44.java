// The "Desemp44" class.
import java.awt.*;
import hsa.Console;

public class Desemp44
{
    static Console c;           // The output console
    public static void main (String[] args)
    {
        int i;
        c = new Console ();
        i = 1;
        while (i <= 100)
        {

            if (i % 7 == 0)
            {
                c.println (i + " es multiplo de 7");
            }
            i++;
        }
        // Place your program here.  'c' is the output console
    } // main method
} // Desemp44 class


//Imprimí todos los múltiplos de 7 menores a
//100. (0 - 7 - 14 - 21 - 28…)
