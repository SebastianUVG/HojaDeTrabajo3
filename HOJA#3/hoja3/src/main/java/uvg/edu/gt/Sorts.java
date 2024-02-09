package uvg.edu.gt;

import java.util.Arrays;

public class Sorts {
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
}


