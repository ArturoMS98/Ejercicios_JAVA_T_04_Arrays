package t_04_arrays_ej12;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 6, 2019 4:55:35 PM<p>                                                                *
 * <p>nombre del proyecto: T_04_Arrays_Ej12.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_04_Arrays.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>12. Sin arrays auxiliares implementar un método que permita invertir el contenido de un array.                    *
 *        Ejemplo:                                                                                                      *
 *      Array original: 12 34 5 78 90 2 42                                                                              *
 *      Array invertido: 42 2 90 78 5 34 12</p>                                                                         *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 19 minutos 04 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_04_Arrays_Ej12 {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Declara un array, lo inicializa, lo muestra, lo invierte y lo vuelve a mostrar invertido</p>                   *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        final int N = 11;
        int[] array = new int[N];
        
        //BACKEND//
            //Rellenamos el array//
            rellenaArrayUnidimensional(array, 0, 10);
        
        //FRONTEND//
            //Mostramos el array//
            System.out.println("El array original es:");
            mostrarArrayUnidimensional(array);
            
        //BACKEND//
            //Invertimos el array//
            invierteArray(array);
        
        //FRONTEND//
            //Mostramos el array//
            System.out.println("El array invertido es:");
            mostrarArrayUnidimensional(array);
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
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Imprimir el array en orden inverso al que se recibe</p>                                                       |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static void invierteArray(int[] array)
    {
        int auxiliar;
        //CUERPO DEL METODO//
        for(int i = array.length-1, j = 0; i != j; i--, j++)
        {
            auxiliar = array[i];
            array[i] = array[j];
            array[j] = auxiliar;
        }
    }
}