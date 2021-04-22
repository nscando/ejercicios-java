import hsa.Console;
class Desemp38
{
    static Console c;
    public static void main (String arg[])
    {
        int i;
        float  a, n, prom;
        c = new Console ();
        i = 1;
        a = 0.00f;
        //c.println("Impresion de la serie de sumas: ");
        while (i <= 7)
        {
            c.print ("Ingrese un numero: ");
            n = c.readFloat ();

            a = a + n;
            i++;
        }
        c.println ("la suma total de los numeros ingresados es :" + a);

        prom = a / i;

        if (prom < 100)
        {
            c.println ("el promedio de sus numeros es menor a 100");
        }
        else
        {
            c.println ("el promedio de sus numeros es mayor a 100");
        }
    }
}
