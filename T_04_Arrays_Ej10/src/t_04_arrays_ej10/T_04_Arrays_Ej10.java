package t_04_arrays_ej10;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 5, 2019 11:30:25 PM<p>                                                               *
 * <p>nombre del proyecto: T_04_Arrays_Ej10.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_04_Arrays.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>10. Implementar un método que reciba un array de N números naturales distintos de cero. El                        *
 *        método deberá averiguar si alguno de los números del vector está repetido, devolverá -1 si no hay             *
 *        ninguno repetido y el índice del primer repetido que encuentre, en otro caso.</p>                             *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 13 minutos 07 segundos (o menos) </p>                                   *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_04_Arrays_Ej10 {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Declaramos y rellenamos un array, lo mostramos, y una vez tenemos una base de la que partir para testear,      *
    *    comprobamos que el método buscarPrimerRepetido funciona.</p>                                                   *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        final int N = 10;
        int[] array = new int[N];
        int repetido;
        //BACKEND//
            //Inicializamos el array//
            rellenaArrayUnidimensional(array, 0, 10);
            //Calculamos las veces que se repite el primer número que se repite//
            repetido = buscarPrimerRepetido(array);
        //FRONTEND//
            //Mostramos el array//
            mostrarArrayUnidimensional(array);
            //Mostramos las veces que se repite el primer número que se repite//
            System.out.println("El primer número que se repite, se repite " + repetido + " veces");
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Buscar el primer número que se repite y devolver las veces que se repite. Si no encuentra, devuelve -1</p>    |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return las veces que se devuelve el primer elemento del array que se repite, o -1                               |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static int buscarPrimerRepetido(int[] array)
    {
        //VARIABLES LOCALES//
        int contadorRepetidos = 0;
        
        //CUERPO DEL METODO//
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i+1; j < array.length; j++)
            {
                if(array[i] == array[j])
                    contadorRepetidos++;
            }
            if(contadorRepetidos > 0)
                return contadorRepetidos+1;
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