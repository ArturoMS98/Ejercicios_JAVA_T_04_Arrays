package t_04_arrays_ej03;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 4, 2019 9:18:09 PM<p>                                                                *
 * <p>nombre del proyecto: T_04_Arrays_Ej03.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_04_Arrays.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>3. Escribe el siguiente programa en Java: se declarará un array de 10 elementos. Cada elemento del                *
 *       array contendrá un número primo, es decir, el contenido del vector serán los 10 primeros números               *
 *       primos. Al final se mostrará por pantalla el contenido del vector. NOTA: Usa métodos.</p>                      *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 30 minutos 08 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_04_Arrays_Ej03 {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Declara un array de 10 enteros, y para cada posicion vamos calculando el siguiente número primo, empezando     *
    *    por 1. Reharemos el método para crear el siguiente primo una vez le pasamos uno por el que empezar.</p>        *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        final int MAXIMO_ARRAY = 10;
        final int PRIMER_PRIMO = 1;
        int[] primos = new int[MAXIMO_ARRAY];
        
        //RELLENAMOS EL ARRAY//
        rellenaPrimos(primos, PRIMER_PRIMO, MAXIMO_ARRAY);
        
        //MOSTRAMOS EL ARRAY//
        mostrarArrayUnidimensional(primos);
    }
    

    //Metodos suplementarios de la clase principal//

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
     | <p>Rellena el array recibido de primos</p>                                                                       |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static void rellenaPrimos(int[] array, int primerPrimo, int MaximoArray)
    {
        //variables locales//
        //CUERPO DEL METODO//
        array[0] = primerPrimo;
        for(int i = 1; i < MaximoArray; i++)
        {
            array[i] = nextPrimo(array[i-1]);
        }
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Devuelve el siguiente número primo</p>                                                                        |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param anteriorPrimo es el primo anterior al que se devolverá                                                    |
     | @return el primo siguiente al primo pasado por parámetro.                                                        |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static int nextPrimo(int anteriorPrimo)
    {
        //VARIABLES LOCALES//
        int primo = 0;
        
        //CUERPO DEL METODO//
        for(int i = anteriorPrimo + 1; i > 0; i++)
        {
            if(!tieneDivisores(i, 2, i))
            {
                return i;
            }
        }
        
        return primo;
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Determina si el número recibido tiene divisores entre los dos valores recibidos.</p>                          |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param numero es el número del que calcular si tiene divisores                                                   |
     | @param start es el número por el que empezamos a buscar divisores                                                |
     | @param end es el número por el que terminamos de buscar divisores                                                |
     | ~~~~<p>Método dirigido a: BackEnd  </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static boolean tieneDivisores(int numero, int start, int end)
    {
        //CUERPO DEL METODO//
        for(int i = start; i < end; i++)
        {
            if(numero%i == 0)
                return true;
        }
        return false;
    }
}