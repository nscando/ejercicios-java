// The "Desemp45" class.

import hsa.Console;

public class Desemp45
{
    static Console c;           // The output console

    public static void main (String[] args)
    {

        int clientes, cuenta, depositosMayores, depositosMenores, cantidadDepositos;
        float totalDepositos, promDepositos, valueDeposito;

        c = new Console ();
        clientes = 0;
        depositosMayores = 0;
        depositosMenores = 0;
        totalDepositos = 0.0f;
        promDepositos = 0.0f;
        valueDeposito = 0.0f;

        c.print ("Ingrese numero de cuenta del cliente (ingrese '-1' para finalizar): ");
        cuenta = c.readInt ();


        while (cuenta != -1)
        {
            clientes++;

            c.print ("Ingrese valor a depositar: ");
            valueDeposito = c.readFloat ();


            if (valueDeposito >= 2000)
            {
                depositosMayores++;
            }
            else
            {
                depositosMenores++;
            }

            c.print ("Ingrese numero de cuenta del cliente (ingrese '-1' para finalizar): ");
            cuenta = c.readInt ();

            totalDepositos = totalDepositos + valueDeposito;

        }
        cantidadDepositos = clientes;


        c.println ();

        if (clientes > 0)
        {
            promDepositos = totalDepositos / cantidadDepositos;

            c.println ("La cantidad de clientes procesados es: " + clientes);
            c.println ("La cantidad de depositos procesados es: " + cantidadDepositos);
            c.println ("La la suma total de los depositos es de: $" + totalDepositos);
            c.println ("La cantidad de clientes con depsoitos mayores a $2.000- es: " + depositosMayores);
            c.println ("La cantidad de clientes con depsoitos menores a $2.000- es: " + depositosMenores);
            c.println ("El valor promedio depositado por cliente es de : $" + promDepositos);
        }
        else
        {
            c.println ("No se ingresaron valores.");
        }


    } // main method
} // Desemp45 class

//
//En un Banco se debe ingresar por cada
//cliente, el número de cuenta y el monto de
//depósito a realizar. El ingreso de datos se debe
//realizar hasta que se digite un valor de cuenta
//negativo. Se deberá imprimir lo siguiente:
//| Cantidad de clientes procesados.
//| Cantidad de clientes con depósitos superiores
//a $2000.
//| Suma acumulada de todos los depósitos.
//| Promedio de todos los depósitos.
