package t_04_arrays_ej02;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 4, 2019 9:13:08 PM<p>                                                                *
 * <p>nombre del proyecto: T_04_Arrays_Ej02.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_04_Arrays.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>2. Escribe un programa en el que se declare un array de 20 elementos. Cada elemento del array                     *
 *       contendrá el primer múltiplo de su respectivo índice. Al final se mostrará por pantalla el contenido           *
 *       del array. NOTA: No uses métodos.</p>                                                                          *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 04 minutos 01 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_04_Arrays_Ej02 {
                                                                                                
    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Declarar un array de 20 enteros, y cada entero contendrá el primer múltiplo de su posición, suponiendo que     *
    *    se cuenta con que el primer múltiplo de un número es ese mismo número multiplicado por dos.</p>                *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int[] enteros = new int[20];
                    
        //INICIALIZAMOS EL ARRAY//
        for(int i = 0; i < 20; i++)
        {
            enteros[i] = i*2;
        }
        
        //MOSTRAMOS EL ARRAY//
        for(int i = 0; i < 20; i++)
        {
            System.out.println(enteros[i]);
        }
    }
}