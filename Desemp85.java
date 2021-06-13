/*Realizá la carga de un vector de 12
componentes y dividilo en dos vectores de
6 componentes cada uno, de manera que
el primero tenga los valores de los índices
pares y el segundo los valores de los índices
impares.
Tené presente que la primera componente
está en el índice cero que es par.*/

// The "Desemp85" class.
import java.awt.*;
import hsa.Console;

public class Desemp85
{

    static Console c;           // The output console

    public static void main (String[] args)
    {
        c = new Console ();
        int[] vectorA;
        int[] pares;
        int[] impares;
        int contadorPar = 0;
        int contadorImpar = 0;

        vectorA = new int [12];

        c.println ("Ingrese los valores:");

        for (int i = 0 ; i < vectorA.length ; i++)
        {
            c.print ("ingrese valores: ");
            vectorA [i] = c.readInt ();


            if (vectorA [i] % 2 == 0)
            {
                contadorPar++;
            }
            else
            {
                contadorImpar++;
            }

        }
        c.println ("contadores");
        c.println (contadorPar);
        c.println ();
        c.println (contadorImpar);

        pares = new int [contadorPar];
        impares = new int [contadorImpar];

        contadorPar = 0;
        contadorImpar = 0;

        for (int i = 0 ; i < 12 ; i++)
        {
            if (vectorA [i] % 2 == 0)
            {
                pares [contadorPar] = vectorA [i];
                contadorPar++;
            }
            else
            {
                impares [contadorImpar] = vectorA [i];
                contadorImpar++;
            }
        }

        c.print ("Vector Pares: [");
        for (int i = 0 ; i < contadorPar ; i++)
        {
            c.print (pares [i] + " - ");
        }
        c.print ("]");

        c.println ();

        c.print ("Vector Impares: [");
        for (int i = 0 ; i < contadorImpar ; i++)
        {
            c.print (impares [i] + " - ");
        }
        c.print ("]");

        // Place your program here.  'c' is the output console
    } // main method
} // Desemp85 class
