// The "Desemp48" class.
import java.awt.*;
import hsa.Console;

public class Desemp47
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        int i, serie, total;
        i = 1;
        serie = 20;
        total= 0;
        c = new Console ();

        while (i <= 30)
        {
            serie = serie + 5;
            total = total + serie;
            c.println (i + "-" + serie);
            i++;
        }

     c.println ("La suma total de la serie es : " + total);

    } // main method
} // Desemp48 class


//Dada la siguiente serie: 20 + 25 + 30 + 35 + …
//imprimí los 30 primeros términos de la misma
//y además, mostrá el resultado de la suma.
//(Tené en cuenta que la serie comienza con el
//valor 20)
