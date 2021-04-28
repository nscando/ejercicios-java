import hsa.Console;
class Desemp55
{
    static Console c;
    public static void main (String arg[])
    {
        int a, result;
        a = 5;

        c = new Console ();

        for (int i = 1 ; i <= 20 ; i++)
        {
            result = a * i;

            c.println (a + " x " + i + " = " + result);
        }
    }
}

//Desarrollar un programa que muestre la tabla de multiplicar del 5 (del
//1 al 20).
