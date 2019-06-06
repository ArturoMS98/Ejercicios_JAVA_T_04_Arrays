package t_04_arrays_ej15;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 6, 2019 6:21:43 PM<p>                                                                *
 * <p>nombre del proyecto: T_04_Arrays_EJ15.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_04_Arrays.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>15. Escribe un método que calcule la suma de los elementos de la diagonal principal de una matrix                 *
 *        4 x 4</p>                                                                                                     *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 19 minutos 22 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_04_Arrays_Ej15 {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Declaramos e inicializamos un array bidimensional 4x4, y llamamos a sumaDiagonalMatrizBi()</p>                 *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        final int dimensionMatrizCuadrada = 4;
        int[][] matriz = new int[dimensionMatrizCuadrada][dimensionMatrizCuadrada];
        int suma;
        
        //BACKEND//
            //Rellenamos la matriz//
            rellenaArrayBidimensional(matriz, 0, 9);
            //Calculamos la suma de la diagonal principal//
            suma = sumaDiagonalMatrizBi(matriz);
        System.out.println("La suma de la diagonal principal es: " + suma);
        //FRONTEND//
            //Mostramos la matriz//
            mostrarArrayBidimensional(matriz);
            
            //Mostramos la suma de la diagonal principal//
            System.out.println("La suma de la diagonal principal es: " + suma);
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Sumar la diagonal principal de una matriz bidimensional</p>                                                   |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return la suma de las posiciones de la diagonal                                                                 |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static int sumaDiagonalMatrizBi(int[][] array)
    {
        //VARIABLES LOCALES//
        int suma = 0;
        int longitud = 0;
        //CUERPO DEL METODO//
        for(int[] filaArray : array)
        {
            longitud = filaArray.length;
            break;
        }
        
        for(int i = 0; i < longitud; i++)
        {
            suma += array[i][i];
        }
        return suma;
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
    static void rellenaArrayBidimensional(int[][] array, int start, int end)
    {  
        //VARIABLES LOCALES//
        
        //CUERPO DEL METODO//
        for(int[] filaArray : array)
        {
            for(int i = 0; i < filaArray.length; i++)
            {
                filaArray[i] = (int)(Math.random()*(end+1)) + start;
            }
        }
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Mostrar el array bidimensional fila a fila, posición a posición</p>                                           |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param array es el array bidimensional recibido                                                                  |
     | @return muestra el array por pantalla, no devuelve nada.                                                         |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static void mostrarArrayBidimensional(int[][] array)
    {
        //filaArray es la primera dimensión del array, que se supone son las filas//
        //i es la posición dentro de la filaArray, las columnas de la fila//
        //VARIABLES LOCALES//
        //CUERPO DEL METODO//
        for (int[] filaArray : array) 
        {
            for(int i = 0; i < filaArray.length; i++)
            {
                
                System.out.print(filaArray[i] + "\t");
            }
            System.out.println("");
        }
    }
}