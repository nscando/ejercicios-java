// The "Desemp58" class.

import hsa.Console;

public class Desemp58
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        int n, i, x, y, pCuad, sCuad, tCuad, cCuad;

        c = new Console ();
        x = y = pCuad = sCuad = tCuad = cCuad = 0;

        c.print ("Ingrese cantidad de puntos a procesar: ");
        n = c.readInt ();

        for (i = 1 ; i <= n ; i++)
        {
            c.println ();
            c.print ("ingrese un valor para 'X': ");
            x = c.readInt ();

            c.print ("ingrese un valor para 'Y': ");
            y = c.readInt ();

            if (x > 0 && y > 0)
            {
                pCuad++;
                c.println ("Tu punto " + i + " se ubica en el 1er Cuadrante");
            }
            else if (x < 0 && y < 0)
            {
                tCuad++;
                c.println ("Tu punto " + i + " se ubica en el 3er Cuadrante");
            }

            if (x < 0 && y > 0)
            {
                sCuad++;
                c.println ("Tu punto " + i + " se ubica en el 2do Cuadrante");
            }
            else if (x > 0 && y < 0)
            {
                cCuad++;
                c.println ("Tu punto " + i + " se ubica en el 4to Cuadrante");
            }
        }
        c.println ();
        c.println ("La cantidad de puntos en el PRIMER CUADRANTE es: " + pCuad);
        c.println ("La cantidad de puntos en el SEGUNDO CUADRANTE es: " + sCuad);
        c.println ("La cantidad de puntos en el TERCER CUADRANTE es: " + tCuad);
        c.println ("La cantidad de puntos en el CUARTO CUADRANTE es: " + cCuad);
    } // main method
} // Desemp58 class

//Escribí un programa que pida ingresar
//coordenadas (x,y) que representan puntos
//en el plano. Informá cuántos puntos se han
//ingresado en el primer, segundo, tercer y
//cuarto cuadrante. Al comenzar el programa
//se pide que se ingrese la cantidad de puntos a
//procesar.
