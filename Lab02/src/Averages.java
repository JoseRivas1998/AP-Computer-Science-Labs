import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @author YOUR NAME HERE
 * @version DATE
 */
public class Averages {

    private int[] numbers;
    private int size;

    public Averages(int... initialData) {
        numbers = new int[initialData.length];
        for (int i = 0; i < initialData.length; i++) {
            numbers[i] = initialData[i];
        }
        size = initialData.length;
    }

    public void put(int data) {
        checkCapacity();
        // TODO 1.2
        // Place data in the correct position, make sure the size is correct
    }

    private void checkCapacity() {
        if(size == numbers.length) {
            resize();
        }
    }

    private void resize() {
        int newCapacity = numbers.length * 2;
        int[] temp = new int[newCapacity];
        // TODO 1.1
        // Copy elements into the numbers array, make numbers
        // point to temp
    }

    public double average() {
        int total = 0;
        // TODO 1.3
        // Find the sum
        return (double) total / size;
    }

    public double median() {
        int[] sortedTemp = new int[size];
        // TODO 1.4
        // Copy the elements into sortedTemp
        Arrays.sort(sortedTemp); // We'll get to sorting algorithms later ;)
        int medianIndex = 0;
        // TODO 1.5
        return sortedTemp[medianIndex];
    }

    public int mode() {
        int[] occurrences = new int[maxValue() + 1];
        // TODO 1.7
        // Count how many times a number appears in the array
        // Return the index of occurrences with the highest value
        return 0;
    }

    public int maxValue() {
        int max = Integer.MIN_VALUE;
        // TODO 1.6
        // Iterate through array and keep track of the highest number
        return max;
    }

}
