/*Realizá la carga de 2 vectores de 5 elementos
cada uno y obtené la suma de ellos. La
suma de dos vectores es componente por
componente.*/


// The "Desemp82" class.
import java.awt.*;
import hsa.Console;

public class Desemp82
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        c = new Console ();
        int[] vA = new int [5];
        int[] vB = new int [5];
        int[] suma = new int [5];


        c.println ("Ingrese los numeros a sumar:");

        for (int i = 0 ; i < vA.length ; i++)
        {
            c.print ("Ingrese numero Vector A[" + i + "]: ");
            vA [i] = c.readInt ();
            c.print ("Ingrese numero Vector B[" + i + "]: ");
            vB [i] = c.readInt ();

            suma [i] = vA [i] + vB [i];
        }

        c.println ();
        c.print ("Vector A : [");
        for (int i = 0 ; i < vA.length ; i++)
        {
            c.print (vA [i] + " - ");
        }
        c.print ("]");

        c.println ();

        c.print ("Vector B : [");
        for (int i = 0 ; i < vA.length ; i++)
        {
            c.print (vB [i] + " - ");
        }
        c.print ("]");

        c.println ();

        c.print ("Suma :     [");
        for (int i = 0 ; i < vA.length ; i++)
        {
            c.print (suma [i] + " - ");
        }
        c.print ("]");


        // Place your program here.  'c' is the output console
    } // main method
} // Desemp82 class
