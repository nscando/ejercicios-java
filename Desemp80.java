// The "Desemp80" class.
import java.awt.*;
import hsa.Console;

public class Desemp80
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        float precio[];
        float total;
        int menor, mayor, entre;

        menor = mayor = entre = 0;
        total = 0;
        c = new Console ();

        precio = new float [30];

        for (int i = 0 ; i < 30 ; i++)
        {
            c.print ("ingrese precio del producto [" + i + "]: $ ");
            precio [i] = c.readFloat ();
            total = total + precio [i];

            if (precio [i] < 100)
            {
                menor++;
            }
            else
            {
                if (precio [i] >= 100 && precio [i] <= 200)
                {
                    entre++;
                }

            }
            if (precio [i] > 200)
            {
                mayor++;
            }

        }
        c.println ();
        c.println ();
        c.println ("El vector de precios ingresados es : [");

        for (int i = 0 ; i < 30 ; i++)
        {
            c.print ("$ " + precio [i] + " - ");

        }
        c.print ("]");
        c.println ();
        c.println ("La cantidad de precios menores a $100 es : " + menor);
        c.println ("La cantidad de precios entre $100 y 200 es : " + entre);
        c.println ("La cantidad de precios mayores a $200 es : " + mayor);
        c.println ("El valor total es : " + total);

        // Place your program here.  'c' is the output console
    } // main method
} // Desemp80 class

/*
Un comercio tiene almacenados los precios
de sus productos en un vector de 30
elementos. Realizá las siguientes operatorias:
a | Carga del vector de Precios.
b | Impresión del vector.
c | ¿Cuántos productos tienen un precio menor
a $100?
d | ¿Cuántos productos tienen un precio entre
$100 y $200?
e | ¿Cuántos productos tienen un precio mayor
a $200?
f | Importe total que representan todos los
productos.
*/
