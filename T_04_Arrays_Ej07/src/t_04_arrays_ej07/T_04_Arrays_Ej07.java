package t_04_arrays_ej07;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 4, 2019 11:36:13 PM<p>                                                               *
 * <p>nombre del proyecto: T_04_Arrays_Ej07.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_04_Arrays.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>7. Desarrolla un método que reciba un vector de 20 números enteros y devuelva el valor mínimo de                  *
 *       todos.</p>                                                                                                     *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 6 minutos 39 segundos</p>                                               *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_04_Arrays_Ej07 {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Declara un array de 20 enteros y lo inicializa con rellenaArrayUnidimensional(), tras lo cual lo pasa al       *
    *    método buscaMinimoUnidimensional() que buscará el mínimo de dicho número. Después mostramos datos.</p>         *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int[] array = new int[20];
        int minimo;
        
        //BACKEND//
            //Rellenamos el array//
            rellenaArrayUnidimensional(array, 10, 30);
            //Buscamos el mínimo del array//
            minimo = buscaMinimoUnidimensional(array);
        
        //FRONTEND//
            //Mostramos el array//
            mostrarArrayUnidimensional(array);
            System.out.println("Mínimo del array: " + minimo);
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Busca el mínimo de los enteros que componen el array que se pasa por parámetro</p>                            |
     | @return el mínimo de las posiciones del array                                                                    |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static int buscaMinimoUnidimensional(int[] array)
    {
        //VARIABLES LOCALES//
        int minimo = array[0];
        //CUERPO DEL METODO//
        for(int i = 1; i < array.length; i++)
        {
            if(minimo > array[i])
                minimo = array[i];
        }
        return minimo;
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