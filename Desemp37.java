import hsa.Console;

class Desemp37{
 static Console c;
 public static void main (String arg []){
 
 int i, a;
 c = new Console ();
 i = 1;
 a = 0;
 c.println("Impresion de la serie de sumas: ");
   while (i <= 100){ 
      c.println(a + "");
      a = a + i;
      i = i + 1;
   }
 c.println("la suma total de los numeros del 1 al 100 es :" + a);
   }
 }
