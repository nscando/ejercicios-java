// The "Desemp75" class.
import java.awt.*;
import hsa.Console;

public class Desemp75
{


    static Console c;           // The output console

    public static void main (String[] args)
    {
        int n1, n2, intentos, diferencia;
        n2 = n1 = 0;
        intentos = 7;
        c = new Console ();

        n2 = (int) (Math.random () * 15) + 1;

        do
        {
            if (n1 <= 15)
            {
                c.print ("Ingrese numero del 1 al 15: ");
                n1 = c.readInt ();
                if (n1 != n2)
                {
                    if (n1 < n2)
                    {
                        c.println ("El Numero debe ser mas alto!");
                    }
                    else
                    {
                        c.println ("El Numero debe ser mas bajo!");
                    }
                }
            }
        }
        while (n1 != n2 && --intentos > 0);

        if (n1 > 15)
        {
            c.println ("ERROR -> DEBE INGRESAR UN NUMERO ENTRE 1 y 15");
        }

        if (n1 == n2)
        {
            c.println ("ACERTO!");
        }
        else
        {
            c.println ("PERDIO EL JUEGO!");
        }



    } // main method
} // Desemp75 class


/*Representá un modelo informatizado del juego "adivina el número
generado por la computadora (del 1 al 15)".
Funciona así: El jugador tiene 7 intentos para adivinar el número.
Si el número que ingresa el jugador es el valor generado por la
computadora, el programa debe imprimir el mensaje "*** ACERTÓ
***" y terminar.
En caso contrario, informá sobre si la suposición ha sido más alta
o más baja y permití que el usuario introduzca números hasta que
adivine o se terminen las posibilidades, mostrando en este caso la
leyenda: "*** PERDIO EL JUEGO ***".
Visualizá también el número de intentos.*/
