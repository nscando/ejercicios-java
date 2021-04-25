// The "Desemp46" class.
import java.awt.*;
import hsa.Console;

public class Desemp46
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        int n, impares, total;
        n = 1;
        impares = 1;
        total = 1;
        c = new Console ();

        while (n <= 49)
        {
            impares = impares + 2;
            total = total + impares;
            n++;
            c.println (n + "->" + impares);
        }

        c.println ();
        c.println ("la suma de los primeros 50 numeros impares es: " + total);

    } // main method
} // Desemp46 class


//Mostrá la suma de los primeros 50 números
//impares
