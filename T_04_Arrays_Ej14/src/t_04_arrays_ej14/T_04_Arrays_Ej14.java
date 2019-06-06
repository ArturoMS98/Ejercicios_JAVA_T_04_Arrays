package t_04_arrays_ej14;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 6, 2019 6:06:42 PM<p>                                                                *
 * <p>nombre del proyecto: T_04_Arrays_Ej14.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_04_Arrays.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>14. Implementa un programa que lea un sucesión de N números naturales, encuentre el valor                         *
 *        máximo y lo imprima junto con el número de veces que aparece y las posiciones en que esto ocurre.</p>         *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 14 minutos 10 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_04_Arrays_Ej14 {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Pide N números por teclado, encuentra el máximo de dichos números, calcula las veces que aparece el mayor      *
    *    número del array, muestra el array donde se guardan esos N números, y mostramos el número de veces que aparece *
    *    dicho número</p>                                                                                               *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        final int N = 5;
        int[] array = new int[N];
        int maximo;
        int ocurrencias;
        Scanner in = new Scanner(System.in);
        
        //FRONTEND//
            //PETICION DE DATOS//
            for(int i = 0; i < N; i++)
            {
                System.out.println("Introduzca un número para introducir en la posición " + i + " del array");
                array[i] = in.nextInt();
            }
        
        //BACKEND//
            //Encontramos el valor máximo//
            maximo = buscaMaximoUnidimensional(array);
            //Calculamos las veces que aparece maximo en el array//
            ocurrencias = cuentaNumeroEnArray(array, maximo);
            
        //FRONTEND//
            //Mostramos el array//
            mostrarArrayUnidimensional(array);
            //Mostramos las ocurrencias de máximo en array//
            System.out.println("\n" + maximo + " aparece en el array " + ocurrencias + " veces");
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Contar las ocurrencias de numero en el array e imprimir las posiciones en que se encuentra</p>                |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param numero es el numero a buscar en el array                                                                  |
     | @return el numero de veces que numero aparece en el array, aparte de mostrar por pantalla la posición de este.   |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static int cuentaNumeroEnArray(int[] array, int numero)
    {
        //VARIABLES LOCALES//
        int contador = 0;
        //CUERPO DEL METODO//
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == numero)
            {
                contador++;
                System.out.println("Encontrado por " + contador + " vez en la posicion " + i);
            }
        }
        return contador;
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Busca el mínimo de los reales que componen el array que se pasa por parámetro</p>                             |
     | @return el maximo de las posiciones del array                                                                    |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static int buscaMaximoUnidimensional(int[] array)
    {
        //VARIABLES LOCALES//
        int maximo = array[0];
        //CUERPO DEL METODO//
        for(int i = 1; i < array.length; i++)
        {
            if(maximo < array[i])
                maximo = array[i];
        }
        return maximo;
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Muestra el array que le pasamos por parámetro</p>                                                             |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static void mostrarArrayUnidimensional(int[] array)
    {
        //CUERPO DEL METODO//
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}