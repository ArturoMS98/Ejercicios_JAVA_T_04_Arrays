package t_04_arrays_ej06;

import java.text.DecimalFormat;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 4, 2019 11:18:37 PM<p>                                                               *
 * <p>nombre del proyecto: T_04_Arrays_Ej06.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_04_Arrays.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>6. Implementa un programa en Java que inicialice un vector unidimensional (20 elementos) de                       *
 *       forma aletoria con números reales entre 0 y 9. Para que a continuación se calcule la media de todos            *
 *       los elementos del array. NOTA: Usa métodos.</p>                                                                *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 17 minutos 26 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_04_Arrays_Ej06 {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Declara un array de 20 posiciones, lo inicializa con rellenaArrayUnidimensional(), y almacena la media de los  *
    *    elementos de nuestro array con calculaMediaUnidimensional</p>                                                  *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int[] array = new int[20];
        float media;
        DecimalFormat formato2Decimales = new DecimalFormat("#.##");
        //BACKEND//
            //Rellena el array con números entre 0 y 9//
            rellenaArrayUnidimensional(array, 0, 9);
            //Calcula la media de los números del array//
            media = calculaMediaUnidimensional(array);
        
        //FRONTEND//
            //Muestra los datos relevantes//
            mostrarArrayUnidimensional(array);
            System.out.println("Media: " + formato2Decimales.format(media));
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Calcula la media de los elementos del array que se pasa por parámetro</p>                                     |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return la media de los elementos del array                                                                      |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static float calculaMediaUnidimensional(int[] array)
    {
        //VARIABLES LOCALES//
        float media = 0;
        //CUERPO DEL METODO//
        for(int i = 0; i < array.length; i++)
        {
            media = media + array[i];
        }
        media /= array.length;
        return media;
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