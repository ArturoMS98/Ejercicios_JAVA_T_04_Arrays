package t_04_arrays_ej16;
 /***********************************************************************************************************************
 * @author baha                                                                                                         *
 * <p>fecha de inicializacion: Jun 6, 2019 6:43:40 PM<p>                                                                *
 * <p>nombre del proyecto: T_04_Arrays_Ej16.java<p>                                                                     *
 * <p>Anteriores versiones en:</p>                                                                                      *
 * <p><a href="https://github.com/BahamutEscarlata/Ejercicios_JAVA_T_04_Arrays.git">GIT</a></p>                         *
 ************************************************************************************************************************
 *                                                                                                                      *
 * <h1>Función de la clase:</h1>                                                                                        *
 * <p>16. Implementa un método que permita sumar el número de elementos positivos y el de negativos                     *
 *        de una matriz T, siendo T una matriz de M x N elementos recibida como parámetro.</p>                          *
 * @version 1.0                                                                                                         *
 * <p>Tiempo invertido en esta versión: 0 horas 17 minutos 02 segundos</p>                                              *
 *                                                                                                                      *
 ***********************************************************************************************************************/
public class T_04_Arrays_Ej16 {

    /********************************************************************************************************************
    *                                                                                                                   *
    * <h1>MÉTODO MAIN</h1>                                                                                              *
    * <p>Funcion:</p>                                                                                                   *
    * <p>Crea una matriz, la inicializa entre -5 y 5, y cuenta los negativos y los positivos de la matriz.</p>          *
    *                                                                                                                   *
    ********************************************************************************************************************/
    public static void main(String[] args) {
        // Esqueleto de la aplicacion: //
        // VARIABLES LOCALES //
        final int N = 5;
        final int M = 6;
        int[][] matriz = new int[N][M];
        int contadorPositivos;
        int contadorNegativos;
        //BACKEND//
            //Rellenamos la matriz//
            rellenaArrayBidimensional(matriz, -5, 10);
            //Contamos los negativos//
            contadorNegativos = cuentaElementosNegativosBidimensional(matriz);
            System.out.println("Numeros negativos de la matriz: " + contadorNegativos);
            
            //Contamos los positivos//
            contadorPositivos = cuentaElementosPositivosBidimensional(matriz);
            System.out.println("Numeros positivos de la matriz: " + contadorPositivos);
            
        //FRONTEND//
            //Mostramos la matriz//
            mostrarArrayBidimensional(matriz);
    }
    

    //Metodos suplementarios de la clase principal//

    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Coge un array bidimensional y cuenta cuantos elementos son mayores o iguales a 0</p>                          |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return el contador de positivos (contando 0 como positivo)                                                      |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static int cuentaElementosPositivosBidimensional(int[][] array)
    {
        //VARIABLES LOCALES//
        int contadorPositivos = 0;
        //CUERPO DEL METODO//
        for(int[] filaArray : array)
        {
            for(int i = 0; i < filaArray.length; i++)
            {
                if(filaArray[i] >= 0)
                    contadorPositivos++;
            }
        }
        return contadorPositivos;
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Coge un array bidimensional y cuenta cuantos elementos son menores de 0</p>                                   |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @return el contador de negativos                                                                                 |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static int cuentaElementosNegativosBidimensional(int[][] array)
    {
        //VARIABLES LOCALES//
        int contadorNegativos = 0;
        //CUERPO DEL METODO//
        for(int[] filaArray : array)
        {
            for(int i = 0; i < filaArray.length; i++)
            {
                if(filaArray[i] < 0)
                    contadorNegativos++;
            }
        }
        return contadorNegativos;
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Rellenar el array que se pasa por referencia con números enteros entre start y end</p>                        |
     | <p>Nota que si se introducen parámetros negativos, se tendrá que sumar a end la misma cantidad de negativos para |
     |    que el programa siga funcionando</p>                                                                          |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param start indica el número más pequeño por el que se puede rellenar el array.                                 |
     | @param end indica el número más grande por el que se puede rellenar el array.                                    |
     | @return no devuelve nada, pero modifica el array que se pasa por referencia.                                     |
     | ~~~~<p>Método dirigido a:   BackEnd</p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static void rellenaArrayBidimensional(int[][] array, int start, int end)
    {  
        //VARIABLES LOCALES//
        
        //CUERPO DEL METODO//
        for(int[] filaArray : array)
        {
            for(int i = 0; i < filaArray.length; i++)
            {
                filaArray[i] = (int)(Math.random()*(end+1)) + start;
            }
        }
    }
    
    /**_________________________________________________________________________________________________________________
     | ~~~~<p>Función del metodo:</p>~~~~                                                                               |
     | <p>Mostrar el array bidimensional fila a fila, posición a posición</p>                                           |
     | ~~~~<p>Parámetros:</p>~~~~                                                                                       |
     | @param array es el array bidimensional recibido                                                                  |
     | @return muestra el array por pantalla, no devuelve nada.                                                         |
     | ~~~~<p>Método dirigido a: FrontEnd </p>~~~~                                                                      |
     |_________________________________________________________________________________________________________________*/
    static void mostrarArrayBidimensional(int[][] array)
    {
        //filaArray es la primera dimensión del array, que se supone son las filas//
        //i es la posición dentro de la filaArray, las columnas de la fila//
        //VARIABLES LOCALES//
        //CUERPO DEL METODO//
        for (int[] filaArray : array) 
        {
            for(int i = 0; i < filaArray.length; i++)
            {
                
                System.out.print(filaArray[i] + "\t");
            }
            System.out.println("");
        }
    }
}