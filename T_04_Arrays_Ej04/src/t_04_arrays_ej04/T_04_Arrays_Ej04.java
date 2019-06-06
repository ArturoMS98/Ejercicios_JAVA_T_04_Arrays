package t_04_arrays_ej04;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 4, 2019 9:48:48 PM<p>                                                                *
 * <p>nombre del proyecto: T_04_Arrays_Ej04.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_04_Arrays.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>4. Implementa un programa en Java que inicialice una matriz bidimensional (de 5 por 5) con los                    *
 *       valores 0 y 1. El valor a asignar en cada posición de la matriz debe ser generado de forma aleatoria.          *
 *       Al final se mostrará por pantalla el contenido de la matriz. NOTA: Usa métodos.</p>                            *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 39 minutos 43 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_04_Arrays_Ej04 {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Crea un array bidimensional, y llama al método rellenaArray() para inicializarlo con ceros y unos</p>          *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int[][] bidimensional = new int[5][5];
        
        //BACKEND//
        rellenaArrayBidimensional(bidimensional, 0, 1);
        //Mostramos el array//
        mostrarArrayBidimensional(bidimensional);
    }
    

    //Metodos suplementarios de la clase principal//

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
        int contador = 0; //cuenta la fila por la que vamos para mostrarla, dado que un array no es un contador
        //CUERPO DEL METODO//
        for (int[] filaArray : array) 
        {
            System.out.println("FILA " + contador);
            for(int i : filaArray)
            {
                
                System.out.print(filaArray[i] + "\t");
            }
            System.out.println("");
            contador++;
        }
    }
}