package t_04_arrays_ej11;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 5, 2019 11:45:29 PM<p>                                                               *
 * <p>nombre del proyecto: T_04_Arrays_Ej11.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_04_Arrays.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>11. Implementar un método lógico que nos indique si dos vectores de enteros son iguales.</p>                      *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 08 minutos 29 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_04_Arrays_Ej11 {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Declarar dos arrays, inicializarlos, y ver si son iguales</p>                                                  *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        int[] array1 = new int[2];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        int[] array4 = new int[3];
        
        //BACKEND//
            //Asignamos un par de datos//
            array1[1] = 1;
            array1[0] = 1;
            array2[1] = 1;
            array3[1] = 1;
            array3[0] = 1;
            array3[2] = 1;
            array4[1] = 1;
            array4[0] = 1;
            array4[2] = 1;
            //Comparamos arrays//
            System.out.println(comparaArrays(array1, array2));
            System.out.println(comparaArrays(array1, array3));
            System.out.println(comparaArrays(array2, array3));
            System.out.println(comparaArrays(array3, array4));
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Comparar si dos arrays son iguales</p>                                                                        |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return true o false                                                                                             |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static boolean comparaArrays(int[] array1, int[] array2)
    {
        //CUERPO DEL METODO//
        if(array1.length != array2.length)
            return false;
        else
        {
            for(int i = 0; i < array1.length; i++)
            {
                if(array1[i] != array2[i])
                    return false;
            }
            return true;
        }
    }
}