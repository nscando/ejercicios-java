import java.awt.*;
import hsa.Console;

public class Desemp22
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        int  type;
        int value;
        c = new Console ();

        c.print ("Ingrese un valor: ");
        value = c.readInt ();
        
        c.print ("Seleccione un num.  para el tipo de frecuencia -> 1.hz - 2.khz - 3.mhz - 4.ghz: ");
        type = c.readInt ();


        if (type == 1 && value >= 3 && value <= 30)
        {
            c.println ("El valor de frecuencia " + value + " ingresada es ULF");
        }
        else if (type == 1 && value > 30 && value <= 300)
        {
            c.println ("El valor de frecuencia " + value + " ingresada es ELF");
        }

        if (type == 1 && value > 300 && value <= 3)
        {
            c.println ("El valor de frecuencia " + value + " ingresada es ILF");
        }
        else if(type == 2 && value <= 3){
        c.println ("El valor de frecuencia " + value + " ingresada es ILF");
        }
        if (type == 2 && value > 3 && value <= 30)
        {
            c.println ("El valor de frecuencia " + value +  " ingresada es VLF");
        }
        else if ( type == 2 && value > 30 && value <= 300)
        {
            c.println ("El valor de frecuencia " + value + " ingresada es LF");
        }
        if (type == 2 && value > 300 )
        {
            c.println ("El valor de frecuencia " + value +  " ingresada es MF");
        }
        else if (type == 3 && value <= 3)
        {
            c.println ("El valor de frecuencia " + value +  " ingresada es MF");
        }
        if ( type == 3 && value > 3 && value <= 30)
        {
            c.println ("El valor de frecuencia " + value +  " ingresada es HF");
        }
        else if ( type == 3 && value > 30 && value <= 300)
        {
            c.println ("El valor de frecuencia " + value +  " ingresada es VHF");
        }
        if ( type == 3 && value > 300)
        {
            c.println ("El valor de frecuencia " + value + type +" ingresada es UHF");
        }
        else if ( type == 4 && value <= 3)
        {
            c.println ("El valor de frecuencia " + value +  " ingresada es UHF");
        }

         if (type == 4 && value > 3 && value <= 30)
        {
            c.println ("El valor de frecuencia " + value +  " ingresada es SHF");
        }

        if (type == 4 && value > 30 && value <= 300)
        {
            c.println ("El valor de frecuencia " + value +  " ingresada es EHF");
        }
        // Place your program here.  'c' is the output console
    } // main method
} // Desemp22 class
