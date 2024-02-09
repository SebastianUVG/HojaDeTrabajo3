package uvg.edu.gt;

import java.util.Arrays;

public class Sorts {

    /**
     * Buble Sort
     * @param <T>
     * @param array
     */
    public static <T extends Comparable<T>> void bubbleSort(T[] array){
        int ar = array.length;
        boolean cambio;

        do {
            cambio = false;
            for (int i = 1; i < ar; i++) {
                if (array[i - 1].compareTo(array[i]) > 0) {
                    // Intercambiar elementos si están en el orden incorrecto
                    T temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    cambio = true;
                }
            }
            ar--;
        } while (cambio);
    }
/**
 * MERGE SORT
 * @param <T>
 * @param array
 */
    public static <T extends Comparable<T>> void mergeSort(T[] array){
        if (array.length > 1) {
                int mid = array.length / 2;
                T[] left = Arrays.copyOfRange(array, 0, mid);
                T[] right = Arrays.copyOfRange(array, mid, array.length);

                mergeSort(left);
                mergeSort(right);

                merge(array, left, right);
            }
        }
/**
 * Funcino que hace los cambios del merge sort
 * @param <T>
 * @param array
 * @param left
 * @param right
 */
    private static <T extends Comparable<T>> void merge(T[] array, T[] left, T[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

/**
 * QuickSort
 * @param <T>
 * @param array
 * @param bajo
 * @param alto
 */
    public static <T extends Comparable<T>> void quickSort(T[] array, int bajo, int alto) {
        if (bajo < alto) {
            int pivoteIndex = partir(array, bajo, alto);
            quickSort(array, bajo, pivoteIndex - 1);
            quickSort(array, pivoteIndex + 1, alto);
        }
    }
/**
 * Funcion que evalua el arreglo
 * @param <T>
 * @param array
 * @param low
 * @param high
 * @return
 */
    private static <T extends Comparable<T>> int partir(T[] array, int low, int high) {
        T pivote = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivote) <= 0) {
                i++;
                cambio(array, i, j);
            }
        }

        cambio(array, i + 1, high);
        return i + 1;
    }

/**
 * GNOME SORT
 * @param <T>
 * @param array
 */

    public static <T extends Comparable<T>> void gnomeSort(T[] array) {
        int index = 0;

        while (index < array.length) {
            if (index == 0 || array[index - 1].compareTo(array[index]) <= 0) {
                index++;
            } else {
                cambio(array, index, index - 1);
                index--;
            }
        }
    }

    /**
     * Funcion que hace los cambios
     * @param <T>
     * @param array
     * @param i
     * @param j
     */
    private static <T> void cambio(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }



    public static <T extends Comparable<T>> void radixSort(T[] array) {
        if (array.length == 0) {
            return;
        }

        // Encontrar el elemento máximo para determinar el número de dígitos
        T max = Arrays.stream(array).max(Comparable::compareTo).get();
        int exp = 1;

        while (((Integer) max / exp) > 0) {
            countingSort(array, exp);
            exp *= 10;
        }
    }


    private static <T extends Comparable<T>> void countingSort(T[] array, int exp) {
        int n = array.length;
        T[] output = Arrays.copyOf(array, n);
        int[] count = new int[10];

        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++) {
            count[((Integer) (array[i]) / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[((Integer) (array[i]) / exp) % 10] - 1] = array[i];
            count[((Integer) (array[i]) / exp) % 10]--;
        }

        System.arraycopy(output, 0, array, 0, n);
    }

}


