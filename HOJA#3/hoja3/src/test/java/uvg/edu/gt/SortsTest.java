package uvg.edu.gt;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SortsTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Sorts sort = new Sorts();
        Integer[] input = new Integer[]{5, 4, 3, 2, 1};

        // Crear una copia ordenada previamente del arreglo de entrada
        Integer[] expected = new Integer[]{1, 2, 3, 4, 5};

        // Llamar a la función bubbleSort
        

        // Verificar si el arreglo resultante es igual al arreglo ordenado previamente
        assertArrayEquals(sort.bubbleSort(input), expected;
    }
}

// Trate de hacer las test, pero por la forma en que lo realice no pude.
