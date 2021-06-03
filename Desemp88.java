// The "Desemp88" class.
import java.awt.*;
import hsa.Console;

public class Desemp88
{
    static Console c;           // The output console
    String[] alumnos;
    float[] notas;
    String[] condicion;
    int contador;

    Desemp88 ()
    {
        alumnos = new String [3];
        notas = new float [3];
        condicion = new String [3];
    }


    void ingresoDatos ()
    {
        c.println ("Ingrese los datos del alumno: ");
        for (int i = 0 ; i < alumnos.length ; i++)
        {
            c.print ("Ingrese nombre del alumno: ");
            alumnos [i] = c.readLine ();

            c.print ("Ingrese nota del alumno: ");
            notas [i] = c.readFloat ();
            c.println ();
        }
    }


    void procesoDatos ()
    {

        for (int i = 0 ; i < notas.length ; i++)
        {
            if (notas [i] >= 8)
            {
                contador++;
                condicion [i] = "Muy bueno";

            }
            if (notas [i] >= 4 && notas [i] < 8)
            {
                condicion [i] = "Bueno";

            }
            if (notas [i] < 4)
            {
                condicion [i] = "Insuficiente";
            }
        }
    }


    void imprimirDatos ()
    {
        c.clear ();
        int linea = 5;

        c.setCursor (3, 10);
        c.println ("Alumnos - Notas - Condicion");
        c.setCursor (4, 10);
        c.println ("----------------------------");

        for (int i = 0 ; i < alumnos.length ; i++)
        {
            c.setCursor (linea, 10);
            c.print (alumnos [i]);
            c.setCursor (linea, 20);
            c.print (notas [i], 8, 2);
            c.setCursor (linea, 35);
            c.print (condicion [i]);
            linea++;
        }

        c.setCursor (linea + 1, 10);
        c.println ("Hay " + contador + " alumnos con nota MUY BUENA");
    }


    public static void main (String[] args)
    {
        c = new Console ();
        Desemp88 e = new Desemp88 ();
        e.ingresoDatos ();
        e.procesoDatos ();
        e.imprimirDatos ();

        // Place your program here.  'c' is the output console
    } // main method
} // Desemp88 class


/*
En un curso de 8 alumnos se registraron las
notas de sus exámenes y se deben procesar
de acuerdo a lo siguiente:
a | Ingresar Nombre y Nota de cada alumno.
b | Realizar un listado en tres columnas de
Nombres, Notas y Condición de alumno. En la
columna Condición, colocar "Muy Bueno" si la
nota es mayor o igual a 8, "Bueno" si la nota
está entre 4 y 7.99, y colocar "Insuficiente" si
la nota es inferior a 4.
c | Imprimir cuántos alumnos tienen la
leyenda "Muy Bueno".
*/
