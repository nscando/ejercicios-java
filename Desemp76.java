// The "Desemp76" class.
import java.awt.*;
import hsa.Console;

public class Desemp76
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        String candidato, nx;
        int votos, b, vx;
        char opcion;
        c = new Console ();
        vx = b = 0;
        nx = "";
        do
        {
            c.clear ();
            c.print ("Ingrese apellido del candidato: ");
            candidato = c.readLine ();

            c.print ("Ingrese cantidad de votos recibidos: ");
                    votos = c.readInt ();

            if (b == 0)
            {
                b = 1;
                nx = candidato;
                vx = votos;
            }

            if (votos > vx)
            {
                nx = candidato;
                vx = votos;
            }

            c.print ("Desea ingresar otro candidato (S/N): ");
            opcion = c.readChar ();

        }
        while (opcion == 's' || opcion == 'S');
        c.println ("El ganador de las elecciones es el candidato: " + nx + " con una cantidad de: " + vx + " votos.");

    } // main method
} // Desemp76 class


/*Para las elecciones de la provincia, se inscribieron varios candidatos.
Desarrollá un programa para ingresar el Nombre y la cantidad de votos
de cada uno.
El programa tendrá que determinar quién es el candidato que ganó las
elecciones, mostrando el nombre y la cantidad de votos obtenidos.*/

