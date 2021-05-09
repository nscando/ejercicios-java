// The "Desemp73" class.
import java.awt.*;
import hsa.Console;

public class Desemp73
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        int i, n, multiplos;
        i = n = multiplos = 0;
        c = new Console ();

        c.print ("Ingrese un numero: ");
        n = c.readInt ();
        do
        {
               multiplos = n * i;
                if (multiplos % 4 == 0)
                {
                    c.println (multiplos + "-");
                }
            
            i++;
        }
        while (multiplos < 800);

    } // main method
} // Desemp73 class


/*Ingresá un número, e imprimí todos sus
múltiplos inferiores a 800.
Por ejemplo:
Ingrese un número: 30
Los múltiplos de 30 menores a 800 son:
0 - 30 - 60 - 90 - 120 - 150 - 180
- 210 - 240 - 270 - 300 - 330 - 360
- 390 - 420 - 450 - 480 - 510 - 550
- 570 - 600 - 430 - 660 - 690 - 720 -
750 - 780*/
