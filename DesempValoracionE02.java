// The "DesempValoracionE02" class.
import java.awt.*;
import hsa.Console;

public class DesempValoracionE02
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        int n, par, suma;
        c = new Console ();
        par = suma = 0;

        c.print ("Ingrese un numero entero: ");
        n = c.readInt ();

        if (n > 0)
        {
            for (int i = n ; i >= 0 ; --i)
            {

                if (i % 2 == 0)
                {
                    par = i;
                    c.println (par);
                    suma = suma + par;
                }
            }
            c.println ("La suma de los pares es: " + suma);
        }
        else
        {
            c.println ("Ingresaste un valor erroneo, volve a intentarlo.");
        }
        // Place your program here.  'c' is the output console
    } // main method
} // DesempValoracionE02 class


/* 2) Realiza un programa que solicite el ingreso de un valor entero y muestre los números pares
desde dicho valor hasta el 0 utilizando un ciclo repetitivo. Calcular y mostrar la suma de los
valores generados. Por ejemplo, si se ingresa el número 10, la salida por pantalla debería ser:
10-8-6-4-2-0
La suma es 30
*/
