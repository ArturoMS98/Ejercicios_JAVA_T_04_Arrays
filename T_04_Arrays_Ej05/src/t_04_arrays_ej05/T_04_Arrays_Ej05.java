package t_04_arrays_ej05;

import java.util.Scanner;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 4, 2019 11:01:12 PM<p>                                                               *
 * <p>nombre del proyecto: T_04_Arrays_Ej05.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_04_Arrays.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>5. Escribe un programa en el que se declare un array unidimensional (100 elementos). Inicializa el                *
 *       array con números aleatorios entre 0 y 99. A continuación se buscará en el array la primera                    *
 *       aparición de un número entero introducido por teclado por el usuario. Para terminar se mostrará el             *
 *       contenido del array, el número buscado, y la posición donde se encuentra, si es que aparece.                   *
 *       NOTA: Usa métodos</p>                                                                                          *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 16 minutos 07 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_04_Arrays_Ej05 {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Declara un array de 100 enteros, pide un número que buscar en el array, inicializa el array con números        *
    *    entre 0 y 99 con rellenaArrayUnidimensional, y calcula la posición de la primera ocurrencia con el método      *
    *    buscaEnUnidimensional(). Por último, muestra los datos relevantes en el método (array, numero y posicion)</p>  *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int[] array = new int[100];
        int numero;
        int posicion;
        Scanner in = new Scanner(System.in);
        //FRONTEND//
            //PETICION DE DATOS//
            System.out.println("Introduzca el número a buscar en el array:");
            numero = in.nextInt();
            
        //BACKEND//
            //Rellenamos el array con números entre 0 y 99//
            rellenaArrayUnidimensional(array, 0, 99);
            //Calculamos la posición de la primera ocurrencia de número en nuestro array array//
            posicion = buscaEnUnidimensional(array, numero);
        //FRONTEND//
            //Mostramos datos//
            System.out.println("Contenido del array: "); 
            mostrarArrayUnidimensional(array);
            System.out.println("Número buscado: " + numero);
            System.out.println("Posición en la que se encontró por primera vez: " + posicion);
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Busca el número pasado por parámetro en el array pasado por referencia.</p>                                   |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param numero es el número a buscar. @param array es el array en el que buscar numero.                           |
     | @return la posición en la que se encuentra numero por primera vez.                                               |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static int buscaEnUnidimensional(int[] array, int numero)
    {
        //CUERPO DEL METODO//
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == numero)
                return i;
        }
        return -1;
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Rellenar el array que se pasa por referencia con números enteros entre start y end</p>                        |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param start indica el número más pequeño por el que se puede rellenar el array.                                 |
     | @param end indica el número más grande por el que se puede rellenar el array.                                    |
     | @return no devuelve nada, pero modifica el array que se pasa por referencia.                                     |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static void rellenaArrayUnidimensional(int[] array, int start, int end)
    {  
        //VARIABLES LOCALES//
        
        //CUERPO DEL METODO//
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.random()*(end+1)) + start;
        }
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