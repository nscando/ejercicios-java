// The "Desemp81" class.
import java.awt.*;
import hsa.Console;

public class Desemp81
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        int a[], b[], d[], suma, totalA, totalB, totalD;

        c = new Console ();
        suma = 0;
        a = new int [10];
        b = new int [10];
        d = new int [10];

        for (int i = 0 ; i < 10 ; i++)
        {
            c.print ("Ingrese numero A [" + i + "]: ");
            a [i] = c.readInt ();
            suma = suma + a [i];
        }
        totalA = suma;
        c.println ("Total A -> : " + totalA);
        suma = 0;

        for (int i = 0 ; i < 10 ; i++)
        {
            c.print ("Ingrese numero B [" + i + "]: ");
            b [i] = c.readInt ();
            suma = suma + b [i];
        }
        totalB = suma;
        c.println ("Total B -> : " + totalB);
        suma = 0;


        for (int i = 0 ; i < 10 ; i++)
        {
            c.print ("Ingrese numero D [" + i + "]: ");
            d [i] = c.readInt ();
            suma = suma + d [i];
        }
        totalD = suma;
        c.println ("Total D -> : " + totalD);

        c.println ();

        if (totalA > totalB && totalA > totalD)
        {
            c.println ("A es el mayor acumulado!" + totalA);
        }
        if (totalB > totalA && totalB > totalD)
        {
            c.println ("B es el mayor acumulado! " + totalB);
        }
        if (totalD > totalA && totalD > totalB)
        {
            c.println ("D es el mayor acumulado! " + totalD);
        }

        // Place your program here.  'c' is the output console
    } // main method
} // Desemp81 class

/*Cargá tres vectores numéricos de 10
elementos y determiná cuál es el que tiene un
valor acumulado mayor.*/
