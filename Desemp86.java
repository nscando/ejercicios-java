// The "Desemp86" class.
import java.awt.*;
import hsa.Console;

public class Desemp86
{
    static Console c;
    int[] vector;
    int suma, mayores, cantidadMayores, i;

    Desemp86 ()
    {
        vector = new int [7];
    }


    void cargaDatos ()
    {
        c.println ("Cargue valor vector: ");
        for (int i = 0 ; i < vector.length ; i++)
        {
            c.print ("Ingrese vector[" + (i + 1) + "]:");
            vector [i] = c.readInt ();
        }
    }


    void imprimirDatos ()
    {
        c.println ("El valor acumulado de todos los elementos es :" + suma);
    }


    void procesoDatos ()
    {
        suma = mayores = cantidadMayores = 0;

        for (int i = 0 ; i < vector.length ; i++)
        {
            suma = suma + vector [i];
            if (vector [i] > 50)
            {
                cantidadMayores++;
                mayores = mayores + vector [i];
            }
        }
        c.println ("La cantidad de valores mayores a 50 es :" + cantidadMayores);
        c.println ("El valor acumulado de todos los elementos mayores a 50 es :" + mayores);
    }



    public static void main (String[] args)
    {
        c = new Console ();
        Desemp86 e = new Desemp86 ();
        e.cargaDatos ();
        c.println ();
        e.procesoDatos ();
        c.println ();
        e.imprimirDatos ();
        
        // Place your program here.  'c' is the output console
    } // main method
} // Desemp86 class


/*Desarrollá un programa que permita ingresar un vector de 7
elementos y luego informe:
a | El valor acumulado de todos los elementos.
b | El valor acumulado de todos los elementos mayores a 50.
c | La cantidad de valores mayores a 50.*/
