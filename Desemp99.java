/*En una empresa que tiene "n" empleados con los siguientes datos: Legajo,
Nombre, Profesión y Sueldo, se deben realizar las siguientes operatorias:
a | Carga de los datos de cada empleado.
b | Listado completo ordenado por nombre en cuatro columnas.
c | Consulta por Legajo.
d | Consulta por Nombre.
e | Consulta por Profesión.
f | Datos de la persona de mayor sueldo.
g | Menú de opciones*/


import hsa.Console;
import java.awt.*;
class Desemp99
{
    static Console c;
    String[] nombre;
    int[] legajo;
    String[] profesion;
    float[] sueldo;
    Desemp99 ()
    {
        c.print ("Ingrese la cantidad de empleados a procesar: ");
        int n = c.readInt ();
        nombre = new String [n];
        sueldo = new float [n];
        profesion = new String [n];
        legajo = new int [n];
    }


    void cargarDatos ()
    {
        c.clear ();
        c.println ("Cargue los datos");
        c.println ();
        for (int i = 0 ; i < nombre.length ; i++)
        {
            c.print ("Ingrese Nombre del empleado[" + (i + 1) + "]: ");
            nombre [i] = c.readLine ();
            c.print ("Ingrese Profesion del empleado[" + (i + 1) + "]: ");
            profesion [i] = c.readLine ();
            c.print ("Ingrese Nro. de Legajo del empleado[" + (i + 1) + "]: ");
            legajo [i] = c.readInt ();
            c.print ("Ingrese Sueldo del empleado[" + (i + 1) + "]: ");
            sueldo [i] = c.readFloat ();

            c.println ();
        }
    }


    void imprimir ()
    {
        int fila;
        c.setCursor (3, 10);
        c.print ("Empleados");
        c.setCursor (4, 10);
        c.print ("----------");
        c.setCursor (3, 25);
        c.print ("Legajo Nro");
        c.setCursor (4, 25);
        c.print ("------------");
        c.setCursor (3, 45);
        c.print ("Profesion");
        c.setCursor (4, 45);
        c.print ("------------");
        c.setCursor (3, 65);
        c.print ("Sueldo");
        c.setCursor (4, 65);
        c.print ("------------");
        fila = 5;

        for (int i = 0 ; i < nombre.length ; i++)
        {
            c.setCursor (fila, 10);
            c.print (nombre [i]);

            c.setCursor (fila, 25);
            c.print (legajo [i]);

            c.setCursor (fila, 45);
            c.print (profesion [i]);

            c.setCursor (fila, 65);
            c.print (sueldo [i], 4, 1);
            fila++;
        }
        c.println ();
        c.println ();
        c.setTextColor (Color.red);
        c.print (" Digite [Enter] para retornar al Menu ");
        c.readChar ();
    }


    void ordenarPorNombres ()
    {
        int n = nombre.length;
        String auxNombre;
        String auxProfesion;
        int auxLegajo;
        float auxSueldo;

        for (int k = 1 ; k < n ; k++)
        {
            for (int i = 0 ; i < n - k ; i++)
            {
                if (nombre [i].compareTo (nombre [i + 1]) > 0)
                {
                    auxNombre = nombre [i];
                    nombre [i] = nombre [i + 1];
                    nombre [i + 1] = auxNombre;

                    auxProfesion = profesion [i];
                    profesion [i] = profesion [i + 1];
                    profesion [i + 1] = auxProfesion;

                    auxLegajo = legajo [i];
                    legajo [i] = legajo [i + 1];
                    legajo [i + 1] = auxLegajo;

                    auxSueldo = sueldo [i];
                    sueldo [i] = sueldo [i + 1];
                    sueldo [i + 1] = auxSueldo;

                }
            }
        }
    }


    void ordenarPorSueldos ()
    {
        int n = nombre.length;
        String auxNombre;
        String auxProfesion;
        int auxLegajo;
        float auxSueldo;

        for (int k = 1 ; k < n ; k++)
        {
            for (int i = 0 ; i < n - k ; i++)
            {
                if (sueldo [i] > sueldo [i + 1])
                {
                    auxSueldo = sueldo [i];
                    sueldo [i] = sueldo [i + 1];
                    sueldo [i + 1] = auxSueldo;

                    auxNombre = nombre [i];
                    nombre [i] = nombre [i + 1];
                    nombre [i + 1] = auxNombre;

                    auxProfesion = profesion [i];
                    profesion [i] = profesion [i + 1];
                    profesion [i + 1] = auxProfesion;

                    auxLegajo = legajo [i];
                    legajo [i] = legajo [i + 1];
                    legajo [i + 1] = auxLegajo;

                }
            }
        }
    }


    void consultasPorProfesion ()
    {
        String auxProfesion;
        int fila;
        char op;



        do
        {
            c.setCursor (4, 10);
            c.print ("-------------------------");
            c.setCursor (6, 10);
            c.print ("Ingrese Profesion que desea buscar: ");
            auxProfesion = c.readLine ();
            c.setCursor (8, 10);
            c.print ("Profesion");
            c.setCursor (9, 10);
            c.print ("----------");
            c.setCursor (8, 25);
            c.print ("Empleado");
            c.setCursor (9, 25);
            c.print ("------------");
            c.setCursor (8, 45);
            c.print ("Legajo nro.");
            c.setCursor (9, 45);
            c.print ("------------");
            c.setCursor (8, 65);
            c.print ("Sueldo");
            c.setCursor (9, 65);
            c.print ("------------");
            fila = 10;
            int posi = -1;

            for (int i = 0 ; i < nombre.length ; i++)
            {
                if (auxProfesion.equalsIgnoreCase (profesion [i]))
                {
                    posi = i;
                }
                if (posi != -1)
                {
                    c.setCursor (fila, 10);
                    c.print (profesion [posi]);

                    c.setCursor (fila, 25);
                    c.print (nombre [posi]);

                    c.setCursor (fila, 45);
                    c.print (legajo [posi]);

                    c.setCursor (fila, 65);
                    c.print (sueldo [posi]);
                }
                else
                {
                    c.setCursor (9, 10);
                    c.print ("No existe esa profesion");
                }
                fila++;
            }

            c.setCursor (20, 10);
            c.print ("Realiza otra consulta (S/N): ");
            op = c.readChar ();
        }
        while (op == 's' || op == 'S');
    }


    void consultasPorNombre ()
    {
        String auxNombre;
        char op;
        do
        {
            c.clear ();
            c.setCursor (3, 10);
            c.print ("Consultas por Nombre");
            c.setCursor (4, 10);
            c.print ("-------------------------");
            c.setCursor (6, 10);
            c.print ("Ingrese Nombre de empleado a buscar: ");
            auxNombre = c.readLine ();
            int posi = -1;
            for (int i = 0 ; i < nombre.length ; i++)
            {
                if (auxNombre.equalsIgnoreCase (nombre [i]))
                {
                    posi = i;
                }
            }
            if (posi != -1)
            {
                c.setCursor (8, 10);
                c.print ("Nombre del empleado: ");
                c.print (nombre [posi]);
                c.setCursor (9, 10);
                c.print ("Legajo nro: ");
                c.print (legajo [posi]);
                c.setCursor (10, 10);
                c.print ("Profesion: ");
                c.print (profesion [posi]);
                c.setCursor (11, 10);
                c.print ("Sueldo: $");
                c.print (sueldo [posi]);
            }
            else
            {
                c.setCursor (9, 10);
                c.print ("No existe esa nombre");
            }
            c.setCursor (20, 10);
            c.print ("Realiza otra consulta (S/N): ");
            op = c.readChar ();
        }
        while (op == 's' || op == 'S');
    }


    void consultasPorLegajo ()
    {
        int auxLegajo;
        char op;
        do
        {
            c.clear ();
            c.setCursor (3, 10);
            c.print ("Consultas por Legajo");
            c.setCursor (4, 10);
            c.print ("-------------------------");
            c.setCursor (6, 10);
            c.print ("Ingrese Nro. de Legajo del empleado a buscar: ");
            auxLegajo = c.readInt ();
            int posi = -1;
            for (int i = 0 ; i < nombre.length ; i++)
            {
                if (auxLegajo == legajo [i])
                {
                    posi = i;
                }
            }
            if (posi != -1)
            {
                c.setCursor (8, 10);
                c.print ("Legajo nro: ");
                c.print (legajo [posi]);

                c.setCursor (9, 10);
                c.print ("Nombre del empleado: ");
                c.print (nombre [posi]);

                c.setCursor (10, 10);
                c.print ("Profesion: ");
                c.print (profesion [posi]);

                c.setCursor (11, 10);
                c.print ("Sueldo: $");
                c.print (sueldo [posi]);
            }
            else
            {
                c.setCursor (9, 10);
                c.print ("No existe ese Nro. de Legajo, vuelve a intentarlo.");
            }
            c.setCursor (20, 10);
            c.print ("Realiza otra consulta (S/N): ");
            op = c.readChar ();
        }
        while (op == 's' || op == 'S');
    }




    public static void main (String arg[])
    {
        c = new Console ();
        Desemp99 e = new Desemp99 ();
        int op;
        c.setTextBackgroundColor (Color.cyan);
        do
        {
            c.clear ();
            c.setTextColor (Color.blue);
            c.setCursor (3, 10);
            c.print ("Menu de Opciones");
            c.setCursor (4, 10);
            c.print ("----------------");
            c.setCursor (5, 10);
            c.print ("1- Cargar Datos");
            c.setCursor (6, 10);
            c.print ("2- Listado ordenado por Nombres ");
            c.setCursor (7, 10);
            c.print ("3- Listado ordenado por Sueldos ");
            c.setCursor (8, 10);
            c.print ("4- Consulta por Nombre");
            c.setCursor (9, 10);
            c.print ("5- Consulta por Legajo");
            c.setCursor (10, 10);
            c.print ("6- Consulta por Profesion");
            c.setCursor (11, 10);
            c.print ("0- Finalizar el programa");
            c.setCursor (15, 10);
            c.print ("Digite la opcion: ");
            op = c.readInt ();
            switch (op)
            {

                case 1:
                    e.cargarDatos ();
                    break;
                case 2:
                    c.clear ();
                    c.setCursor (1, 10);
                    c.print ("Listado Ordenado por Nombres ");
                    e.ordenarPorNombres ();
                    e.imprimir ();
                    break;
                case 3:
                    c.clear ();
                    c.setCursor (1, 10);
                    c.print ("Listado Ordenado por Sueldos ");
                    e.ordenarPorSueldos ();
                    e.imprimir ();
                    break;
                case 4:
                    c.clear ();
                    c.setCursor (1, 10);
                    c.print ("Consulta por nombres ");
                    e.consultasPorNombre ();
                    break;
                case 5:
                    c.clear ();
                    c.setCursor (1, 10);
                    c.print ("Consulta por Legajo ");
                    e.consultasPorLegajo ();
                    break;
                case 6:
                    c.clear ();
                    c.setCursor (3, 10);
                    c.print ("Consulta por Profesion ");
                    e.consultasPorProfesion ();
                    break;
            }
        }
        while (op != 0);
        System.exit (0);
    }
}

