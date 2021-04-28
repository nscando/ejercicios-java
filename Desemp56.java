import hsa.Console;
class Desemp56
{
    static Console c;
    public static void main (String arg[])
    {
        int a, result;

        c = new Console ();
        c.println (" Ingrese un numero entre el 1 y el 10: ");
        a = c.readInt ();

        if (a <= 10)
        {
            c.println (" Multiplos de: " + a);
            for (int i = 1 ; i <= 30 ; i++)
            {
                result = a * i;

                c.println (" - " + result);
            }
        }
        else
        {
            c.println (" Error - Ingrese un numero valido");
        }
    }
}

//Confeccioná un programa que permita ingresar un valor del 1 al 10 y
//nos muestre los múltiplos del mismo (los primeros 30 términos).
//Por ejemplo, si se ingresa el número 3, deberá aparecer:
//Multiplos de 3
//0 - 3 - 6 - 9 - 12 - 15...
