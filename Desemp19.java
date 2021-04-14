
// The "Desempenio19" class.
import java.awt.*;
import hsa.Console;

public class Desempenio19 {
     static Console c; // The output console

     public static void main(String[] args) {
          int n1, n2, n3, suma;
          c = new Console();

          c.print("Ingrese el primer un numero: ");
          n1 = c.readInt();

          c.print("Ingrese el segundo un numero: ");
          n2 = c.readInt();

          c.print("Ingrese el tercer un numero: ");
          n3 = c.readInt();

          c.println();
          if (n1 == n2 && n1 == n3 && n2 == n3) {
               suma = (n1 + n2) * n3;
               c.println("tus numeros son iguales -> la cuenta da: " + suma);
          } else {
               c.println("tus numeros son diferentes, volve a ingresarlos");
          }

          // Place your program here. 'c' is the output console
     } // main method
} // Desempenio19 class
