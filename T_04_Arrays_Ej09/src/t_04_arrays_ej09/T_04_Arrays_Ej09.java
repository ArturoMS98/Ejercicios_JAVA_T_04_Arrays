package t_04_arrays_ej09;

import java.text.DecimalFormat;

 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 5, 2019 10:55:38 PM<p>                                                               *
 * <p>nombre del proyecto: T_04_Arrays_Ej09.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_04_Arrays.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>9. Implementar un programa en Java que inicialice un array de N números reales correspondientes a                 *
 *       las estaturas de N personas y muestre por pantalla los siguientes resultados:                                  *
 *          (a) La media de las estaturas.                                                                              *
 *          (b) Las alturas máxima y mínima.                                                                            *
 *          (c) Cuántos son más altos y cuántos son más bajos que la media.                                             *
 *          NOTA:Y la inicialización del array será por teclado. (no implementado)</p>                                  *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 30 minutos 44 segundos(aprox)</p>                                       *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_04_Arrays_Ej09 {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Declarar un array de N reales, inicializarlo con alturas aleatorias, y llamar a respectivos métodos para       *
    *    mostrar:                                                                                                       *
    *    -media     -alturas maxima y minima        -comparación con la media</p>                                       *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        final int N = 1000;
        double[] alturas = new double[N];
        double minima;
        double maxima;
        double media;
        int contadorMenores; //Almacena el contador de usuarios de altura menor a la media
        int contadorMayores; //Almacena el contador de usuarios de altura mayor o igual a la media
        DecimalFormat formato2Decimales = new DecimalFormat("#.##");
                
        //BACKEND//
            //Inicializamos el array//
            rellenaArrayUnidimensionalReal(alturas, 1.50, 2.00);
            //Calculamos la media del array//
            media = calculaMediaUnidimensionalReal(alturas);
            //Calculamos la altura máxima del array//
            maxima = buscaMaximoUnidimensionalReal(alturas);
            //Calculamos la altura mínima del array//
            minima = buscaMinimoUnidimensionalReal(alturas);
            //Calculamos el número de posiciones con altura superior o igual a la media//
            contadorMenores = calculaRealInferior(alturas, media);
            //Calculamos el número de posiciones con altura inferior a la media//
            contadorMayores = calculaRealSuperior(alturas, media);
            
            
        //FRONTEND//
            //Mostramos el array//
            System.out.println("Array:");
            mostrarArrayUnidimensionalReal(alturas);
            //Mostramos la media de las alturas//
            System.out.println("Media: " + formato2Decimales.format(media));
            //Mostramos la altura máxima del array//
            System.out.println("Altura máxima: " + formato2Decimales.format(maxima));
            //Mostramos la altura mínima del array//
            System.out.println("Altura mínima: " + formato2Decimales.format(minima));
            //Mostramos el número de posiciones con altura superior o igual a la media//
            System.out.println("Alturas menores que " + formato2Decimales.format(media) + ": " + contadorMenores);
            //Mostramos el número de posiciones con altura inferior a la media//
            System.out.println("Alturas mayores o iguales que " + formato2Decimales.format(media) + ": " + contadorMayores);
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Calcular las posiciones del array de reales recibido que son menores que el real que se pasa.</p>             |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param array es el array de reales en el que buscar.                                                             |
     | @param busqueda es el real sobre el cual las posiciones deben ser menores.                                       |
     | @return el número de posiciones menores que busqueda                                                             |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static int calculaRealInferior(double[] array, double busqueda)
    {
        //VARIABLES LOCALES//
        int contador = 0;
        //CUERPO DEL METODO//
        for(int posicion = 0; posicion < array.length; posicion++)
        {
            if(array[posicion] < busqueda)
            {
                contador++;
            }
        }
        return contador;
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Calcular las posiciones del array de reales recibido que son mayores o iguales que el real que se pasa.</p>   |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param array es el array de reales en el que buscar.                                                             |
     | @param busqueda es el real sobre el cual las posiciones deben ser mayores o iguales.                             |
     | @return el número de posiciones mayores o iguales que busqueda                                                   |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static int calculaRealSuperior(double[] array, double busqueda)
    {
        //VARIABLES LOCALES//
        int contador = 0;
        //CUERPO DEL METODO//
        for(int posicion = 0; posicion < array.length; posicion++)
        {
            if(array[posicion] >= busqueda)
            {
                contador++;
            }
        }
        return contador;
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Rellenar el array que se pasa por referencia con números reales entre start y end</p>                         |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param start indica el número más pequeño por el que se puede rellenar el array.                                 |
     | @param end indica el número más grande por el que se puede rellenar el array.                                    |
     | @return no devuelve nada, pero modifica el array que se pasa por referencia.                                     |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static void rellenaArrayUnidimensionalReal(double[] array, double start, double end)
    {  
        //CUERPO DEL METODO//
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (double)(Math.random()*(end+1)) + start;
        }
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Muestra el array que le pasamos por parámetro</p>                                                             |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static void mostrarArrayUnidimensionalReal(double[] array)
    {
        DecimalFormat formato2Decimales = new DecimalFormat("#.##");
        //CUERPO DEL METODO//
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(formato2Decimales.format(array[i]));
        }
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Calcula la media de los elementos del array que se pasa por parámetro</p>                                     |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return la media de los elementos del array                                                                      |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static double calculaMediaUnidimensionalReal(double[] array)
    {
        //VARIABLES LOCALES//
        double media = 0;
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
     | <p>Busca el mínimo de los reales que componen el array que se pasa por parámetro</p>                             |
     | @return el mínimo de las posiciones del array                                                                    |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static double buscaMinimoUnidimensionalReal(double[] array)
    {
        //VARIABLES LOCALES//
        double minimo = array[0];
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
     | <p>Busca el mínimo de los reales que componen el array que se pasa por parámetro</p>                             |
     | @return el maximo de las posiciones del array                                                                    |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static double buscaMaximoUnidimensionalReal(double[] array)
    {
        //VARIABLES LOCALES//
        double maximo = array[0];
        //CUERPO DEL METODO//
        for(int i = 1; i < array.length; i++)
        {
            if(maximo < array[i])
                maximo = array[i];
        }
        return maximo;
    }
}