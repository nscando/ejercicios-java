// The "Desemp47" class.
import java.awt.*;
import hsa.Console;

public class Desemp47
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        int v1, v2, aux;
        c = new Console ();
        c.print ("ingrese primer valor: ");
        v1 = c.readInt ();

        c.print ("ingrese segundo valor: ");
        v2 = c.readInt ();

        aux = v1 + 1;
        
        while (aux > v1 && aux < v2)
        {
            c.println ("los numeros son: " + aux);
            aux++;
        }


    } // main method
} // Desemp47 class


//Ingresá dos valores numéricos y mostrá todos
//los números comprendidos entre ellos. No se
//deben imprimir los valores ingresados.
