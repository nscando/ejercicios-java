// The "Desemp51" class.
import java.awt.*;
import hsa.Console;

public class Desemp51
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        int i, pares;
        i = 400;
        pares = 0;
        c = new Console ();
//TODO: falta terminar INCOMPLETO
        while (i == 800)
        {
            if (i % 2 == 0)
            {
                pares++;
                 c.println ("-> " + pares);
            }

           i++;
  
        }



    } // main method
} // Desemp51 class


//Imprimí los números pares en forma
//decreciente desde el 800 hasta el 400.


// The "Desemp51" class.
import java.awt.*;
import hsa.Console;

public class Desemp51
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        int i, pares, num;
        i=1;
        num = 800;
        pares = 0;
        c = new Console ();

//TODO: falta terminar INCOMPLETO
        while (i >= 400 && i<=800)
        {
           i++;
           num = num - i;
            c.println ("->" + num);
        }




    } // main method
} // Desemp51 class


//Imprimí los números pares en forma
//decreciente desde el 800 hasta el 400.
