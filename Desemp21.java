
// The "Desemp21" class.
import java.awt.*;
import hsa.Console;

public class Desemp21 {
     static Console c; // The output console

     public static void main(String[] args) {
          String name;
          int questions, rightAnswers, total;
          c = new Console();

          c.print("Ingrese el nombre del postulante: ");
          name = c.readLine();

          c.print("Ingrese la cantidad de preguntas que se le realizaron: ");
          questions = c.readInt();

          c.print("De esas preguntas cuantas contesto correctamente: ");
          rightAnswers = c.readInt();

          total = (rightAnswers * 100) / questions;

          if (total >= 90) {
               c.println("El nivel del candidato: " + name + " es " + total + "%" + " -> SUPERIOR");
          } else if (total >= 75 && total < 90) {
               c.println("El nivel del candidato: " + name + " es " + total + "%" + " -> MEDIO");
          }

          if (total >= 50 && total < 75) {
               c.println("El nivel del candidato: " + name + " es " + total + "%" + " -> REGULAR");
          } else if (total < 50) {
               c.println("El nivel del candidato: " + name + " es " + total + "%" + " -> FUERA DE NIVEL");
          }

          // Place your program here. 'c' is the output console
     } // main method
} // Desemp21 class
