// The "DesempValoracionE03" class.
import java.awt.*;
import hsa.Console;

public class DesempValoracionE03
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        int a, b, i, result, suma;
        i = suma = 0;
        a = 6;
        b = 19;

        c = new Console ();
        do
        {
            i++;
            b = b + 4;
            result = b * a;
            c.println (b + "x" + a + " = " + result);
            suma = suma + result;
        }
        while (i < 15);
        c.println ();
        c.println ("La SUMA de la serie es -> " + suma);

        // Place your program here.  'c' is the output console
    } // main method
} // DesempValoracionE03 class


/*3) Calcular y mostrar la suma de los 15 términos de la serie:
 23 x 6 + 27 x 6 + 31 x 6 + 35 x 6 + … =
 15 Términos*/
