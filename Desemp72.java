// The "Desemp72" class.
import java.awt.*;
import hsa.Console;

public class Desemp72
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        int sexo, femenino, masculino, dni, mayores, personas, edad;
        char opcion;
        c = new Console ();
        sexo = femenino = masculino = dni = edad = mayores = personas = 0;

        do
        {
            c.clear ();
            c.setCursor (3, 15);
            c.print ("Carga de datos");
            c.setCursor (4, 15);
            c.print ("--------------");
            c.setCursor (6, 10);
            c.print ("Ingrese DNI: ");
            dni = c.readInt ();
            c.setCursor (8, 10);
            c.print ("Ingrese EDAD: ");
            edad = c.readInt ();
            c.setCursor (10, 10);
            c.print ("Ingrese SEXO (opcion 1- masculino, 2- femenino ): ");
            sexo = c.readInt ();

            if (dni != 0)
            {
                personas++;
            }
            if (sexo == 1)
            {
                masculino++;
            }
            else
            {
                femenino++;
            }
            if (edad >= 18)
            {
                mayores++;
            }

            c.setCursor (15, 10);
            c.print ("Ingresa otro juego de datos S/N): ");
            opcion = c.readChar ();
        }
        while (opcion == 'S' || opcion == 's');


      
        c.println ("La cantidad de personas censadas es: " + personas);
        c.println ("La cantidad de personas sexo masculino es: " + masculino);
        c.println ("La cantidad de personas sexo femenino es: " + femenino);
        c.println ("La cantidad de personas sexo masculino mayores a 18 es: " + mayores);



    } // main method
} // Desemp72 class

/*Se realizó un censo provincial y se desea
procesar la información obtenida. De cada
una de las personas censadas se tiene la
siguiente información: número de documento,
edad y sexo ("femenino" o "masculino").
Confeccioná un programa que lea los datos
de cada persona censada (luego de ingresar
un juego de datos, se debe preguntar si
se quiere ingresar otro juego). Informá lo
siguiente:
a | Cantidad de personas censadas.
b | Cantidad de varones.
c | Cantidad de mujeres.
d | Cantidad de varones mayores o iguales a
18 años.
**/
