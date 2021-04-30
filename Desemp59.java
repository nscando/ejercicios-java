// The "Desemp59" class.

import hsa.Console;

public class Desemp59
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        int n, i, negativos, positivos, multiplos9, impares, pares;

        c = new Console ();
        n = negativos = positivos = multiplos9 = pares = impares = 0;


        for (i = 1 ; i <= 5 ; i++)
        {
            c.println ();
            c.print ("Ingrese un valor: ");
            n = c.readInt ();


            if (n < 0)
            {
                negativos++;
            }
            else
            {
                positivos++;
            }

            if (n > 0 && n % 9 == 0)
            {
                multiplos9++;
            }

            if (n > 0 && n % 2 == 0)
            {
                pares++;
            }
            else if (n > 0)
            {
                impares++;
            }
        }
        c.println ();
        c.println ("La cantidad de numeros negativos es: " + negativos);
        c.println ("La cantidad de numeros positivos es: " + positivos);
        c.println ("La cantidad de numeros multiplos de 9 es: " + multiplos9);
        c.println ("La cantidad de numeros impares es: " + impares);
    } // main method
} // Desemp59 class

//Se realiza la carga de 10 valores enteros por
//teclado. Se desea conocer:
//a | La cantidad de valores ingresados
//negativos.
//b | La cantidad de valores ingresados positivos.
//c | La cantidad de múltiplos de 9.
//d | El valor acumulado de los números
//ingresados impares.
