import hsa.Console;
class Desemp54
{
    static Console c;
    public static void main (String arg[])
    {
        int n, mayor;
        mayor = 0;

        c = new Console ();

        for (int i = 1 ; i <= 20 ; i++)
        {
            c.print ("Ingrese numero: ");
            n = c.readInt ();

            int numAux = n;
            
            if (numAux > mayor)
            {
                mayor = numAux;

            }
        }

                c.println ();
                c.println ("El Numero mayor es: " + mayor);
    }
}


//Elaborá un programa que muestre el mayor
//de 20 números ingresados.
