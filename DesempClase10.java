/*Realiza un programa que resuelva éste enunciado.

- En un supermercado que tiene "n" articulos con los siguientes datos: Código,
Descripción y Precio, se deben realizar las siguientes operatorias:
1) Carga de los datos de cada articulo.
2) Listado completo ordenado por Descripción en tres columnas.
3) Consulta por Código.
4) Consulta por Descripción.
5) Datos del artículo de menor costo.
Debes implementar un menú de opciones.

*/


import hsa.Console;
import java.awt.*;
class DesempClase10
{
    static Console c;
    String[] producto;
    int[] codigo;
    String[] descripcion;
    float[] precio;
    DesempClase10 ()
    {
        c.print ("Ingrese la cantidad de productos a procesar: ");
        int n = c.readInt ();
        producto = new String [n];
        precio = new float [n];
        descripcion = new String [n];
        codigo = new int [n];
    }


    void cargarDatos ()
    {
        c.clear ();
        c.println ("Cargue los datos");
        c.println ();
        for (int i = 0 ; i < producto.length ; i++)
        {
            c.print ("Ingrese PRODUCTO [" + (i + 1) + "]: ");
            producto [i] = c.readLine ();
            c.print ("Ingrese DESCRIPCION [" + (i + 1) + "]: ");
            descripcion [i] = c.readLine ();
            c.print ("Ingrese CODIGO del producto [" + (i + 1) + "]: ");
            codigo [i] = c.readInt ();
            c.print ("Ingrese PRECIO del producto [" + (i + 1) + "]: ");
            precio [i] = c.readFloat ();

            c.println ();
        }
    }


    void imprimir ()
    {
        int fila;
        c.setCursor (3, 10);
        c.print ("Producto");
        c.setCursor (4, 10);
        c.print ("----------");
        c.setCursor (3, 25);
        c.print ("Codigo");
        c.setCursor (4, 25);
        c.print ("------------");
        c.setCursor (3, 45);
        c.print ("Descripcion");
        c.setCursor (4, 45);
        c.print ("------------");
        c.setCursor (3, 65);
        c.print ("Precio");
        c.setCursor (4, 65);
        c.print ("------------");
        fila = 5;

        for (int i = 0 ; i < producto.length ; i++)
        {
            c.setCursor (fila, 10);
            c.print (producto [i]);

            c.setCursor (fila, 25);
            c.print (codigo [i]);

            c.setCursor (fila, 45);
            c.print (descripcion [i]);

            c.setCursor (fila, 65);
            c.print (precio [i], 4, 1);
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
        int n = producto.length;
        String auxProducto;
        String auxDescrip;
        int auxCodigo;
        float auxPrecio;

        for (int k = 1 ; k < n ; k++)
        {
            for (int i = 0 ; i < n - k ; i++)
            {
                if (producto [i].compareTo (producto [i + 1]) > 0)
                {
                    auxProducto = producto [i];
                    producto [i] = producto [i + 1];
                    producto [i + 1] = auxProducto;

                    auxDescrip = descripcion [i];
                    descripcion [i] = descripcion [i + 1];
                    descripcion [i + 1] = auxDescrip;

                    auxCodigo = codigo [i];
                    codigo [i] = codigo [i + 1];
                    codigo [i + 1] = auxCodigo;

                    auxPrecio = precio [i];
                    precio [i] = precio [i + 1];
                    precio [i + 1] = auxPrecio;

                }
            }
        }
    }


    void ordenarPorPrecios ()
    {
        int n = producto.length;
        String auxProducto;
        String auxDescrip;
        int auxCodigo;
        float auxPrecio;

        for (int k = 1 ; k < n ; k++)
        {
            for (int i = 0 ; i < n - k ; i++)
            {
                if (precio [i] > precio [i + 1])
                {
                    auxPrecio = precio [i];
                    precio [i] = precio [i + 1];
                    precio [i + 1] = auxPrecio;

                    auxProducto = producto [i];
                    producto [i] = producto [i + 1];
                    producto [i + 1] = auxProducto;

                    auxDescrip = descripcion [i];
                    descripcion [i] = descripcion [i + 1];
                    descripcion [i + 1] = auxDescrip;

                    auxCodigo = codigo [i];
                    codigo [i] = codigo [i + 1];
                    codigo [i + 1] = auxCodigo;

                }
            }
        }
    }


    void consultasPorDescripcion ()
    {
        String auxDescripcion;
        int fila;
        char op;

        do
        {
            c.clear ();
            c.setCursor (3, 10);
            c.print ("Consultas por Descripcion");
            c.setCursor (4, 10);
            c.print ("-------------------------");
            c.setCursor (6, 10);
            c.print ("Ingrese Descripcion del producto: ");
            auxDescripcion = c.readLine ();


            int posi = -1;

            for (int i = 0 ; i < producto.length ; i++)
            {

                if (auxDescripcion.equalsIgnoreCase (descripcion [i]))
                {
                    posi = i;
                }
            }

            if (posi != -1)
            {
                c.setCursor (8, 10);
                c.print ("Descripcion:  ");
                c.print (descripcion [posi]);

                c.setCursor (9, 10);
                c.print ("Producto: ");
                c.print (producto [posi]);

                c.setCursor (10, 10);
                c.print ("Codigo: ");
                c.print (codigo [posi]);

                c.setCursor (11, 10);
                c.print ("Precio: $ ");
                c.print (precio [posi]);

            }
            else
            {
                c.setCursor (13, 10);
                c.print ("No existen productos con esa descripcion");
            }
            c.setCursor (20, 10);
            c.print ("Realiza otra consulta (S/N): ");
            op = c.readChar ();
        }
        while (op == 's' || op == 'S');
    }


    void consultasPorProducto ()
    {
        String auxProducto;
        char op;
        do
        {
            c.clear ();
            c.setCursor (3, 10);
            c.print ("Consultas por Producto");
            c.setCursor (4, 10);
            c.print ("-------------------------");
            c.setCursor (6, 10);
            c.print ("Ingrese nombre del producto: ");
            auxProducto = c.readLine ();
            int posi = -1;
            for (int i = 0 ; i < producto.length ; i++)
            {
                if (auxProducto.equalsIgnoreCase (producto [i]))
                {
                    posi = i;
                }
            }
            if (posi != -1)
            {
                c.setCursor (8, 10);
                c.print ("Nombre del producto: ");
                c.print (producto [posi]);
                c.setCursor (9, 10);
                c.print ("Codigo: ");
                c.print (codigo [posi]);
                c.setCursor (10, 10);
                c.print ("Descripcion: ");
                c.print (descripcion [posi]);
                c.setCursor (11, 10);
                c.print ("Precio: $");
                c.print (precio [posi]);
            }
            else
            {
                c.setCursor (9, 10);
                c.print ("No existen productos con ese nombre");
            }
            c.setCursor (20, 10);
            c.print ("Realiza otra consulta (S/N): ");
            op = c.readChar ();
        }
        while (op == 's' || op == 'S');
    }


    void consultasPorCodigo ()
    {
        int auxCodigo;
        char op;
        do
        {
            c.clear ();
            c.setCursor (3, 10);
            c.print ("Consultas por Codigo");
            c.setCursor (4, 10);
            c.print ("-------------------------");
            c.setCursor (6, 10);
            c.print ("Ingrese Codigo a buscar: ");
            auxCodigo = c.readInt ();
            int posi = -1;
            for (int i = 0 ; i < producto.length ; i++)
            {
                if (auxCodigo == codigo [i])
                {
                    posi = i;
                }
            }
            if (posi != -1)
            {
                c.setCursor (8, 10);
                c.print ("Codigo nro: ");
                c.print (codigo [posi]);

                c.setCursor (9, 10);
                c.print ("Producto: ");
                c.print (producto [posi]);

                c.setCursor (10, 10);
                c.print ("Profesion: ");
                c.print (descripcion [posi]);

                c.setCursor (11, 10);
                c.print ("Precio: $");
                c.print (precio [posi]);
            }
            else
            {
                c.setCursor (9, 10);
                c.print ("Codigo inexistente, vuelve a intentarlo.");
            }
            c.setCursor (20, 10);
            c.print ("Realiza otra consulta (S/N): ");
            op = c.readChar ();
        }
        while (op == 's' || op == 'S');
    }


    void productoDeMenorPrecio ()
    {
        float menorPrecio = precio [0];
        int posi = 0;
        for (int i = 1 ; i < precio.length ; i++)
        {
            if (precio [i] < menorPrecio)
            {
                menorPrecio = precio [i];
                posi = i;
            }
        }
        c.clear ();
        c.setCursor (5, 10);
        c.print ("Los datos del producto de menor Precio son: ");
        
        c.setCursor (7, 10);
        c.print ("Producto: ");
        c.print (producto [posi]);
        
        c.setCursor (8, 10);
        c.print ("Descripcion: ");
        c.print (descripcion [posi]);
        
        c.setCursor (9, 10);
        c.print ("Precio: $ ");
        c.print (precio [posi], 0, 2);
        
        c.setCursor (10, 10);
        c.print ("Codigo: ");
        c.print (codigo [posi]);
        
        c.setCursor (20, 10);
        c.setTextColor (Color.red);
        c.print (" Digite [Enter] para retornar al Menu ");
        c.readChar ();
    }


    public static void main (String arg[])
    {
        c = new Console ();
        DesempClase10 e = new DesempClase10 ();
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
            c.print ("2- Listado ordenado por Productos ");
            c.setCursor (7, 10);
            c.print ("3- Listado ordenado por Precio ");
            c.setCursor (8, 10);
            c.print ("4- Consulta por Producto");
            c.setCursor (9, 10);
            c.print ("5- Consulta por Codigo");
            c.setCursor (10, 10);
            c.print ("6- Consulta por Descripcion");
            c.setCursor (11, 10);
            c.print ("7- Consulta Producto Menor Precio");
            c.setCursor (12, 10);
            c.print ("0- Finalizar el programa");
            c.setCursor (16, 10);
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
                    c.print ("Listado Ordenado por Productos ");
                    e.ordenarPorNombres ();
                    e.imprimir ();
                    break;
                case 3:
                    c.clear ();
                    c.setCursor (1, 10);
                    c.print ("Listado Ordenado por Precio ");
                    e.ordenarPorPrecios ();
                    e.imprimir ();
                    break;
                case 4:
                    c.clear ();
                    c.setCursor (1, 10);
                    c.print ("Consulta por Producto ");
                    e.consultasPorProducto ();
                    break;
                case 5:
                    c.clear ();
                    c.setCursor (1, 10);
                    c.print ("Consulta por Codigo ");
                    e.consultasPorCodigo ();
                    break;
                case 6:
                    c.clear ();
                    c.setCursor (3, 10);
                    c.print ("Consulta por Descripcion ");
                    e.consultasPorDescripcion ();
                    break;
                case 7:
                    c.clear ();
                    c.setCursor (3, 10);
                    c.print ("Consulta por Producto de Menor Precio ");
                    e.productoDeMenorPrecio ();
                    break;
            }
        }
        while (op != 0);
        System.exit (0);
    }
}

