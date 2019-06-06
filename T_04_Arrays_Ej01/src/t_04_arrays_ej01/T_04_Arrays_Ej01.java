package t_04_arrays_ej01;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 4, 2019 9:03:21 PM<p>                                                                *
 * <p>nombre del proyecto: T_04_Arrays_Ej01.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_04_Arrays.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>1. Cuando creamos un vector de un determinado tamaño, ¿qué contiene cada posición? Es decir,                      *
 *       ¿cuál es el valor inicial del array? Averígualo para: int, double, float, char y boolean.</p>                  *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 09 minutos 20 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_04_Arrays_Ej01 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Crear arrays, inicializarlos, y comprobar sus posiciones iniciales.</p>                                        *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int[] arrayEnteros = new int[6];
        double[] arrayDoubles;
        arrayDoubles = new double[5];
        float[] arrayFloats = new float[2];
        char[] arrayChars = new char[5]; //Cual es la diferencia con un string?//
        boolean[] arrayBooleanos = new boolean[2];
        
        //mostramos lo contenido//
        System.out.println(arrayEnteros[0]);
        System.out.println(arrayDoubles[0]);
        System.out.println(arrayFloats[0]);
        System.out.println(arrayChars[0]);
        System.out.println(arrayBooleanos[0]);
    }
}