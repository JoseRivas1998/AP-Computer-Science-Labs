import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Jose de Jesus Rodriguez Rivas
 * @version 2019/03/11
 */
public class Student {

    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result;
        if (obj == null || this.getClass() != obj.getClass()) {
            result = false;
        } else {
            Student other = (Student) obj;
            result = this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName);
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s,%s", this.lastName, this.firstName);
    }

    public static Student[] readStudentsFromFile(File file) {
        List<Student> students = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.length() < 2) continue; // Ignore basically empty lines
                try (Scanner lineScanner = new Scanner(line)) {
                    lineScanner.useDelimiter(",");
                    String firstName = lineScanner.next();
                    String lastName = lineScanner.next();
                    students.add(new Student(firstName, lastName));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // Convert list to array
        Student[] array = new Student[students.size()];
        for (int i = 0; i < students.size(); i++) {
            array[i] = students.get(i);
        }
        return array;
    }

}
