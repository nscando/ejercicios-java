import hsa.Console;
class Desemp39
{
    static Console c;
    public static void main (String arg[])
    {
        int i, par, impar, cero, n;
  
        c = new Console ();
        i = 1;
        par = 0;
        impar = 0;
        cero = 0;
        while (i <= 15)
        {
            c.print ("Ingrese un numero: ");
            n = c.readInt ();
            if (n % 2 == 0.0)
            {
                par++;
            }
            else
            {
                impar++;
            }
            if (n%10 == 0)
            {
                cero++;
            }
            i = i + 1;
        }
        c.println ();
        c.println ("La cantidad de numeros impares es " + impar);
        c.println ("La cantidad de numeros pares es:" + par);
        c.println ("La cantidad de numeros terminados en cero es: " + cero);
    }
}

//Ingresá 15 valores, e imprimí:
//| Cuántos fueron pares.
//| Cuántos fueron impares.
//| Cuántos terminados en cero.
