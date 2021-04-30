import hsa.Console;
class DesempClase5
{
    static Console c;
    public static void main (String arg[])
    {
        int a, result, b, par, impar, sumaPar, sumaImpar, multImpar, multPar,  restaPar, restaImpar;
        float divPar, divImpar;
        c = new Console ();
        b = 20;

        par = impar = sumaImpar = sumaPar = multImpar = multPar = restaPar = restaImpar =  0;
        multImpar = multPar = 1;
        divPar = divImpar = 1;


        c.println (" Ingrese un numero entre el 1 y el 5: ");
        a = c.readInt ();

        if (a >= 1 && a <= 5)
        {

            for (int i = a ; i <= b ; i++)
            {
                c.println (i + " - ");

                if (i % 2 == 0)
                {
                    sumaPar = sumaPar + i;
                    restaPar = restaPar - i;
                    multPar = multPar * i;
                    divPar = divPar / i;
                    par++;
                }
                else
                {
                    sumaImpar = sumaImpar + i;
                    restaImpar = restaImpar - i;
                    multImpar = multImpar * i;
                    divImpar = divImpar / i;
                    impar++;
                }

            }

            c.println ("pares: " + par);
            c.println ("suma pares: " + sumaPar);
            c.println ("resta pares: " + restaPar);
            c.println ("division pares: " + divPar);
            c.println ("Multiplicacion pares: " + multPar);
            c.println ();
            c.println ("impares: " + impar);
            c.println ("suma impares: " + sumaImpar);
            c.println ("resta impares: " + restaImpar);
            c.println ("division pares: " + divImpar);
            c.println ("Multiplicacion impares: " + multImpar);
        }
        else
        {
            c.println (" Error - Ingrese un numero valido");
        }


    }
}


//Planteo el siguiente programa, ingresar por teclado un numero del 1 al 50
//y desde el numero ingresado  al numero 200 imprimir los numeros marcando numeros pares
//y numeros impares, luego entre ellos (pares e impares) mostrar
//resultados de suma, resta, multiplicacion y division..
