// The "DesempValoracionE01" class.

import hsa.Console;

public class DesempValoracionE01
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        c = new Console ();
        int n, counter;
        n = counter = 0;

        c.print ("Ingrese un numero: ");
        n = c.readInt ();

        if (n > 0)
        {
            while (n != 0)
            {
                c.println ("-" + n);
                n = n / 10;

                counter++;
            }
            c.println ("Tu numero tiene " + counter + " cifras");
        }
        else
        {
            c.println ("Ingresaste un valor erroneo, volve a intentarlo.");
        }
        // Place your program here.  'c' is the output console
    } // main method
} // DesempValoracionE01

/*1) Realiza un programa que solicite el ingreso de un valor entero y luego muestre sus cifras.
Para lograrlo, deberás utilizar una operación matemática y un ciclo repetitivo. Luego indica
cuantos dígitos tiene el número que ingresaste. Por ejemplo, si se ingresa el número 321, la
salida por pantalla debería ser:
321
32
3
El número que ingresaste tiene 3 dígitos.*/
