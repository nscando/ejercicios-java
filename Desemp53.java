import hsa.Console;
class Desemp53
{
    static Console c;
    public static void main (String arg[])
    {
        int n, suma;

        c = new Console ();

        suma = 0;


        for (int i = 1 ; i <= 15 ; i++)
        {
            c.print ("Ingrese un numero: ");
            n = c.readInt ();

            if (i > 5)
            {
                suma = suma + n;
            }
            c.println (i + " ->" + n);

        }
        c.println ();
        c.println ("suma de los ultimos 10 numeros: " + suma);

    }
}


//Desarrollá un programa que solicite la carga
//de 15 números e imprima la suma de los
//últimos 10 valores ingresados.
