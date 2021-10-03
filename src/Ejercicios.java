public class Ejercicios {

    /*Factorial de un numero
    5! = 5 * 4 * 3 * 2 * 1
    4! = 4 * 3 * 2 * 1


    public static int factorial(int n) {
        int factorial;

        if (n == 1){
            //caso base
            factorial = n;

        }else {
            factorial = n * factorial(n - 1);
        }

        return factorial;
    }

    /*
    Maximo comun divisor (mcd), algoritmo de euclides
    a = 412 y b = 184

    public static int mcd(int a, int b) {
        int mcd;

        if(a == b){
            //caso base
            mcd = b;

        }else{
            if (a > b) {
                a = a - b;

            } else {
                b = b - a;
            }

            mcd = mcd(a , b);

        }

        return mcd;
    }

    /*
    Suma de los elementos de un vector
    vector = {2, 4, 6}
    suma = 2 +{4, 6}
    suma = 4  + {6}
    suma = 6 {caso base}

    public static int sumaVector(int [] vector, int indice){
        int suma;

        if (indice == vector.length - 1){
           //caso base
            suma = vector[indice];

        } else {
            suma = vector[indice] + sumaVector(vector, indice + 1 );
        }

        return suma;

    }
    */



    /*
    Invertir una cadena de texto "Recursividad" = "dadivisruceR"
    */

     private static String invertirCadena(String cadena, int indice){
        String inversa;

        if (indice == 0) {//caso base
            inversa = String.valueOf(cadena.charAt(indice));
        }else { //llamada recursiva
            inversa = String.valueOf(cadena.charAt(indice)) + invertirCadena(cadena, indice - 1);

        }

        return inversa;

    }
/*
Metodo auxiliar que llama al meotodo recursivo
 */
    public static String invertirCadena(String cadena){
        return invertirCadena(cadena, cadena.length() - 1);
    }

}
