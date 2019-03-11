import java.util.Arrays;

/**
 * @author Jose de Jesus Rodriguez Rivas
 * @version 2/19/19
 */
public class FunWithRecursion {


    public static void main(String[] args) {
        System.out.println("Testing triangular numbers:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("triangular(%d): %d\n", i, triangular(i));
        }
        System.out.println("Testing factorial:");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("factorial(%d): %d\n", i, factorial(i));
        }
        int[] array = {3, 5, 1, 5, 7, 3, 7, 9, 10};
        System.out.println("Test array: " + Arrays.toString(array));
        System.out.println("Calling display array:");
        displayArray(array, 0);
        System.out.println("Calling display array reverse:");
        displayArrayReverse(array, 0);
        System.out.println("Calling display divide and conquer:");
        divideAndConquerDisplayArray(array, 0, array.length - 1);
        System.out.println("Testing powers:");
        for (int i = 2; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.printf("%d^%d = %d\n", i, j, power(i, j));
            }
        }
    }

    public static int triangular(int n) {
        // TODO 1.1
        // THIS IS A STUB
        return 0;
    }

    public static int factorial(int n) {
        // TODO 1.2
        // THIS IS A STUB
        return 0;
    }

    public static void displayArray(int[] a, int index) {
        // TODO 1.3
    }

    public static void displayArrayReverse(int[] a, int index) {
        // TODO 1.4
    }

    public static void divideAndConquerDisplayArray(int[] a, int first, int last) {
        // TODO 1.5
    }

    public static int power(int base, int exponent) {
        // TODO 1.6
        // THIS IS A STUB
        return 0;
    }


}
