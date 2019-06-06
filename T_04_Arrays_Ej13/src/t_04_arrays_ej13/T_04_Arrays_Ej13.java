package t_04_arrays_ej13;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 6, 2019 5:27:06 PM<p>                                                                *
 * <p>nombre del proyecto: T_04_Arrays_Ej13.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_04_Arrays.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>13. Desarrollar un método que recibiendo un vector de enteros de tamaño N calcule la longitud de la               *
 *        subsecuencia común mas larga (el método se llamara scml), esto es, la longitud de la mayor                    *
 *        secuencia de elementos repetidos dentro del vector, por ejemplo, en (2,5,4,2,2,5,6,6,6,3) sería 3; en         *
 *        (3,2,4,1,2) sería 1.</p>                                                                                      *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 39 minutos 43 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_04_Arrays_Ej13 {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Declara y inicializa un array con enteros entre 0 y 10, para pasar dicho array al método scml que calcula      *
    *    la longitud de la subsecuencia más larga cuyos miembros contengan únicamente una cifra repetida lonitud veces. *
    * </p>                                                                                                              *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        final int N = 2;
        int[] array = new int[N];
        int longitud;
        
        //BACKEND//
            //Rellenamos el array con enteros de 0 a 10 aleatorios//
            rellenaArrayUnidimensional(array, 0, 10);
            //Calculamos la longitud de la secuencia de cifras seguidas más larga//
            longitud = scml(array);
        //FRONTEND//
            //Mostramos el array//
            mostrarArrayUnidimensional(array);
            System.out.println("Longitud: " + longitud);
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>calcula la longitud de la subsecuencia más larga cuyos miembros contengan únicamente una cifra repetida       |
     |    longitud veces.</p>                                                                                           |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static int scml(int[] array)
    {
        //VARIABLES LOCALES//
        int contadorRepeticiones = 1;
        int recordRepeticiones = 1;
        int i;
        //CUERPO DEL METODO//
        
        for(i = 1; i < array.length; i++)
        {
            if(array[i] == array[i-1])
                contadorRepeticiones++;
            else
            {
                if(recordRepeticiones < contadorRepeticiones)
                    recordRepeticiones = contadorRepeticiones;
                contadorRepeticiones = 1;
            }
        }
        if(recordRepeticiones < contadorRepeticiones)
            recordRepeticiones = contadorRepeticiones;
        
        if(array.length == 0)
            recordRepeticiones--;
        
        return recordRepeticiones;
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