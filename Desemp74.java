// The "Desemp74" class.
import java.awt.*;
import hsa.Console;

public class Desemp74
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        int i, n, par, impar, cantidad;
        float promImpares, promPares;
        c = new Console ();
        n = par = impar = cantidad = 0;
        promImpares = promPares = 0.00f;

        do
        {
            c.print ("Ingrese numero (99 para terminar): ");
            n = c.readInt ();
            if (n != 99)
            {
                cantidad++;

                if (n % 2 == 0)
                {
                    par++;
                }
                else
                {
                    impar++;
                }
            }

            }
        while (n != 99);

        c.println ();
        if (cantidad != 0)
        {
            promPares = (float) par / cantidad;
            promImpares = (float) impar / cantidad;

            c.println ("La cantidad de numeros ingresados es: " + cantidad);
            c.println ("La cantidad de numeros pares es: " + par);
            c.println ("La cantidad de numeros impares es: " + impar);
            c.println ();
            c.println ("La media de impares es: " + promImpares);
            c.println ("La media de pares es: " + promPares);
        }
        else
        {
            c.println ("Error no se ingresaron numeros.");
        }




    } // main method
} // Desemp74 class


/*Leé por teclado N números enteros y calculá
e imprimí la media de los números pares y la
media de los impares.*/
