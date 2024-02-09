package uvg.edu.gt;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {     
        for (int i = 10 ; i<=15 ; i++){
            Integer[] arreglo = new Integer[i];
            for (int x = 0 ; x<i ; x++){
                arreglo[x] = (int)Math.floor(Math.random()*3000);
            }

            System.out.println("Arreglo desordenado de tamaño " + i +": " + java.util.Arrays.toString(arreglo));
            //Sorts.bubbleSort(arreglo);
            //Sorts.mergeSort(arreglo);
            //Sorts.quickSort(arreglo, 0, arreglo.length-1);
            //Sorts.mergeSort(arreglo);
            Sorts.radixSort(arreglo);
            //Integer[] arregloOrdenado = arreglo.clone();
            //Sorts.bubbleSort(arregloOrdenado);
            //Sorts.mergeSort(arregloOrdenado);
            //Sorts.quickSort(arrearregloOrdenadoglo, 0, arregloOrdenado.length-1);
            //Sorts.mergeSort(arregloOrdenado);
            //Sorts.radixSort(arregloOrdenado);
            System.out.println("Arreglo de tamaño " + i + ": " + java.util.Arrays.toString(arreglo));
        }
    }
}
