// The "Desemp77" class.
import java.awt.*;
import hsa.Console;

public class Desemp77
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
        double precio, total, descuento;
        int cantidad, color;

        char opcion;
        cantidad = 0;
        precio = total = descuento = 0;
        c = new Console ();

        do
        {
            c.clear ();
            c.setCursor (3, 15);
            c.print ("Carga de datos");
            c.setCursor (4, 15);
            c.print ("--------------");
            
            c.setCursor (6, 8);
            c.print ("Ingrese color de etiqueta del producto(1- Rojo; 2- Amarilla; 3- Verde): ");
            color = c.readInt ();
            c.setCursor (8, 8);
            c.print ("Ingrese precio: ");
            precio = c.readFloat ();

            if (color == 1)
            {
                descuento = precio * 0.15;
            }
            if (color == 2)
            {
                descuento = precio * 0.10;
            }
            if (color == 3)
            {
                descuento = precio * 0.05;
            }

            total = total + precio - descuento;
            cantidad++;
            
            c.setCursor(12,10);
            c.println ("El SUB-TOTAL a pagar es: $" + total);
            
            c.setCursor (10, 10);
            c.print ("Desea ingresa otro producto (S/N): ");
            opcion = c.readChar ();

        }
        while (opcion == 's' || opcion == 'S');
        c.setCursor(15,10);
        c.println ("La cantidad de productos comprados es :" + cantidad);
        c.setCursor(17,10);
        c.println ("El TOTAL a pagar es: $" + total);


    } // main method
} // Desemp77 class

/*Laura está de compras en un hipermercado y decide llevar un control
sobre lo que va comprando para saber la cantidad de dinero que
tendrá que pagar al llegar a una caja.
El supermercado tiene una promoción especial del 15% de descuento
sobre aquellos artículos cuya etiqueta sea de color rojo; del 10% sobre
los de etiqueta amarilla, y del 5% sobre los de etiqueta verde.
Escribí un programa que lea el precio y el color de etiqueta del
producto e imprima la cantidad de dinero que Laura deberá pagar.*/
