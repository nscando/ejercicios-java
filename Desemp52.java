import hsa.Console;
class Desemp52
{
    static Console c;
    public static void main (String arg[])
    {
        int n, i, mayores;
        float base, altura, superficie;
        c = new Console ();

        mayores = 0;

        c.print ("Ingrese cantidad de datos a procesar: ");
        n = c.readInt ();
        c.println ();

        for (i = 1 ; i <= n ; i++)
        {
            c.print ("Ingrese medida de la base: ");
            base = c.readInt ();

            c.print ("Ingrese medida de la altura: ");
            altura = c.readInt ();

            superficie = base * altura;

            c.println ();
            c.println ("Triangulo numero: " + i + " tiene una base de: " + base + " y una altura de: " + altura + " su superficie es: " + superficie);
            c.println ();

            if (superficie > 12)
            {
                mayores++;
            }
        }
        c.println ();
        c.println ("Cantidad de triangulos mayores a 12 es: " + mayores);

    }
}


//Confeccioná un programa que lea N pares
//de datos, en donde cada par de datos
//corresponde a la medida de la base y la altura
//de un triángulo. El programa deberá informar:
//| De cada triángulo, la medida de su base, su
//altura y su superficie.
//| La cantidad de triángulos cuya superficie sea
//mayor a 12
