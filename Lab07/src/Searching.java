import java.io.File;

/**
 * @author [YOUR NAME HERE]
 * @version [DATE HERE]
 */
public class Searching {

    /*
     * Precondition: students is an unsorted array of students
     * Postcondition: Return value is either the index of the given student, or -1 if it was not found
     */
    private static int findStudent(Student[] students, Student student) {
        // TODO 2.1 Implement a sequential search to find the given student. If you can, use only ONE return statement
        // THIS IS A STUB
        return -1;
    }

    private static int findString(String[] strings, String s) {
        return findString(strings, s, 0, strings.length - 1);
    }

    /*
     * Precondition: strings is a sorted array of strings
     * Postcondition: Return value is the index of the given string, or -1 if it was not found
     */
    private static int findString(String[] strings, String s, int low, int high) {
        // TODO 2.2 Implement a ternary search, this is a recursive method.
        // THIS IS A STUB
        return 0;
    }

    public static void main(String[] args) {
        Student[] students = Student.readStudentsFromFile(new File("students.txt"));
        testStudentSearch(students, "Cicely", "Herberts");
        System.out.println();
        testStudentSearch(students, "Genevieve", "Loman");
        System.out.println();
        testStudentSearch(students, "Sherryl", "Fairchild");
        System.out.println();
        testStudentSearch(students, "John", "Smith");
        System.out.println();
        String[] strings = {"ablaze", "approve", "bridge", "broken", "comment", "congratulate", "detailed", "existence", "hallowed", "horses", "light", "lucky", "opt", "question", "scared", "slip", "synonymous", "tightfisted", "trample", "two"};
        testStringSearch(strings, "ablaze");
        System.out.println();
        testStringSearch(strings, "detailed");
        System.out.println();
        testStringSearch(strings, "two");
        System.out.println();
        testStringSearch(strings, "Gauss");
    }

    private static void testStudentSearch(Student[] students, String firstName, String lastName) {
        Student toFind = new Student(firstName, lastName);
        System.out.println("Searching for " + toFind);
        int foundIndex = findStudent(students, toFind);
        if (foundIndex != -1) {
            System.out.println("Found student at index: " + foundIndex);
            System.out.println("Student found: " + students[foundIndex]);
            boolean equals = toFind.equals(students[foundIndex]);
            System.out.println("Key and found value math? " + (equals ? "YES" : "NO"));
        } else {
            System.out.println("The student was not found.");
        }
    }

    private static void testStringSearch(String[] strings, String s) {
        System.out.println("Searching for: " + s);
        int index = findString(strings, s);
        if (index != -1) {
            System.out.println("Found string at index: " + index);
            System.out.println("String found: " + strings[index]);
            boolean equals = s.equals(strings[index]);
            System.out.println("Key and found value math? " + (equals ? "YES" : "NO"));
        } else {
            System.out.println("String not found");
        }
    }

}
