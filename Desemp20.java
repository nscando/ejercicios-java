
// The "Desempenio20" class.
import java.awt.*;
import hsa.Console;

public class Desempenio20 {
     static Console c; // The output console

     public static void main(String[] args) {
          int x, y;
          c = new Console();

          c.print("ingrese un valor para 'X': ");
          x = c.readInt();

          c.print("ingrese un valor para 'Y': ");
          y = c.readInt();

          if (x > 0 && y > 0) {
               c.println("Tu punto se ubica en el 1er Cuadrante");
          } else if (x < 0 && y < 0) {
               c.println("Tu punto se ubica en el 3er Cuadrante");
          }

          if (x < 0 && y > 0) {
               c.println("Tu punto se ubica en el 2do Cuadrante");
          } else if (x > 0 && y < 0) {
               c.println("Tu punto se ubica en el 4to Cuadrante");
          }

          // Place your program here. 'c' is the output console
     } // main method
} // Desempenio20 class
