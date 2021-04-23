// The "Desemp43" class.
import java.awt.*;
import hsa.Console;

public class Desemp43
{
    static Console c;           // The output console

    public static void main (String[] args)
    {

        int i, a, b, h, n;
        c = new Console ();

        i = 1;
        a = 0;
        b = 0;
        h = 0;

        while (i <= 12)
        {
            c.print("Ingrese un valor de producto: ");
            n = c.readInt ();

            if (n < 50)
            {
                a++;
            }
            else
            {
                if (n > 50 && n < 100)
                {
                    b++;
                }
            }
            if (n > 100)
            {
                h++;
            }
            i = i + 1;
        }
        c.println ();
        c.println ("La cantidad de valores menores a 50 es: " + a);
        c.println ("La cantidad de valores entre a 50 y 100 es: " + b);
        c.println ("La cantidad de valores mayores a 100 es: " + h);

        // Place your program here.  'c' is the output console
    } // main method
} // Desemp43 class


//Ingresá 12 precios de productos y determiná:
//| Cuantos fueron menores a $50.
//| Cuantos fueron entre $50 y $100, ambos
//inclusive.
//| Cuantos fueron mayores de $100
