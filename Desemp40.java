import hsa.Console;
class Desemp40
{
    static Console c;
    public static void main (String arg[])
    {
        int i, a, n;
  
        c = new Console ();
        i = 1;
        a = 0;

        while (i <= 10)
        {
            c.print ("Ingrese un numero: ");
            n = c.readInt ();
            if (i > 5 )
            {
                a = a + n;
              
            }
           i++;
        }
        c.println ();
        c.println ("La suma de los ultimos 5 numeros es " + a);
       
    }
}

//Ingresá 10 números y mostrá la suma de los
//cinco últimos
