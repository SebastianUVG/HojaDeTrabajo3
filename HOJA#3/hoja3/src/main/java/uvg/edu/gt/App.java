package uvg.edu.gt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {     
        for (int i = 10 ; i<=20 ; i++){
            Integer[] arreglo = new Integer[i];
            for (int x = 0 ; x<i ; x++){
                arreglo[x] = (int)Math.floor(Math.random()*3000);
            }
            Sorts.bubbleSort(arreglo);

            System.out.println("Arreglo de tamaño " + i + ": " + java.util.Arrays.toString(arreglo));
        }
    }
}
