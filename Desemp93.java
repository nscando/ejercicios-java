// The "Desemp93" class.

import hsa.Console;

public class Desemp93
{
    static Console c;           // The output console
    float[] vec1;
    float[] vec2;

    Desemp93 ()
    {
        vec1 = new float [10];
        vec2 = new float [10];
    }


    void cargarDatosV1 ()
    {

        for (int i = 0 ; i < vec1.length ; i++)
        {
            c.print ("Ingrese valor vector1[" + i + "]: ");
            vec1 [i] = c.readFloat ();
        }
    }


    void cargarDatosV2 ()
    {
        for (int j = 0 ; j < vec2.length ; j++)
        {
            c.print ("Ingrese valor vector2 [" + j + "]: ");
            vec2 [j] = c.readFloat ();
        }
    }

    void ordenarV1 ()
    {

        float auxi1;
        for (int k = 1 ; k < vec1.length - 1 ; k++)
        {
            for (int i = 1 ; i < vec1.length - k ; i++)
            {
                for (int j = 0 ; j < vec1.length - i ; j++)
                {
                    if (vec1 [j] > vec1 [j + 1])
                    {
                        auxi1 = vec1 [j];
                        vec1 [j] = vec1 [j + 1];
                        vec1 [j + 1] = auxi1;
                    }
                }
            }
        }
    }


    void ordenarV2 ()
    {
        float auxi1;
        for (int k = 1 ; k < vec2.length - 1 ; k++)
        {
            for (int i = 1 ; i < vec2.length - k ; i++)
            {
                for (int j = 0 ; j < vec2.length - i ; j++)
                {
                    if (vec2 [j] > vec2 [j + 1])
                    {
                        auxi1 = vec2 [j];
                        vec2 [j] = vec2 [j + 1];
                        vec2 [j + 1] = auxi1;
                    }
                }
            }
        }
    }


    void imprimirDatosV1 ()
    {
        c.println ();
        c.println ("Vector 1");
        for (int i = 0 ; i < vec1.length ; i++)
        {
            c.print (vec1 [i] + " - ");
        }
        c.println ();
    }


    void imprimirDatosV2 ()
    {
        c.println ();
        c.println ("Vector 2");
        for (int i = 0 ; i < vec2.length ; i++)
        {
            c.print (vec2 [i] + " - ");
        }

    }


    public static void main (String[] args)
    {
        c = new Console ();
        Desemp93 e = new Desemp93 ();
        e.cargarDatosV1 ();
        e.cargarDatosV2 ();
        e.imprimirDatosV1 ();
        e.imprimirDatosV2 ();
        c.println ();
        e.ordenarV1 ();
        e.ordenarV2 ();
        c.println ();
        e.imprimirDatosV1 ();
        e.imprimirDatosV2 ();


    } // main method
} // Desemp93 class

/*Desarrollá un programa que permita el ingreso de 2 vectores de 10
componentes de tipo float. Implementá dos funciones, una para la
carga y otra que muestre por pantalla el mayor elemento de cada
uno.*/
