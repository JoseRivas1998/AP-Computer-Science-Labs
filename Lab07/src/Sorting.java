import java.io.File;
import java.util.Arrays;

/**
 * @author [YOUR NAME HERE]
 * @version [DATE HERE]
 */
public class Sorting {

    /*
     * NOTE: Feel free to use any sorting algorithm you would like, but you may NOT use built in JDK sorting methods.
     */

    private void sortStrings(String[] strings) {
        // TODO 1.1 Sort strings using their natural ordering. Make use of the compareToIgnoreCase method.

    }

    private void sortStudentsByLastName(Student[] students) {
        // TODO 1.2 Sort students by their last name.
    }

    // Here is code for an insertion sort, you may use this as a template if you would like above.
    public void insertionSort(int[] arr) {
        // i is the index of the first unsorted element
        for (int i = 1; i < arr.length; i++) {
            int j = i; // j is the index of the current element during swapping
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    // These following functions are useful when sorting, keep them in mind!
    // Note that this is a generic method, you can research those if you'd like.
    public <T> void swap(T[] arr, int i, int j) {
        // Standard swap method
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Overload to allow primitive int sorting
    public void swap(int[] arr, int i, int j) {
        // Standard swap method
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        String[] strings = {
                "question", "detailed", "horses", "ablaze",
                "hallowed", "light", "broken", "synonymous",
                "opt", "scared", "trample", "existence",
                "slip", "two", "lucky", "tightfisted",
                "bridge", "congratulate", "comment", "approve"
        };
        System.out.println("Strings to sort: " + Arrays.toString(strings));
        sorting.sortStrings(strings);
        System.out.println("Strings after sorting: " + Arrays.toString(strings));
        System.out.println();
        Student[] students = Student.readStudentsFromFile(new File("students.txt"));
        System.out.println("Students before sorting: ");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
        sorting.sortStudentsByLastName(students);
        System.out.println("Students after sorting: ");
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
