import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * [DESCRIBE CLASS HERE]
 *
 * @author [YOUR NAME HERE]
 * @version [DATE HERE]
 */
public class EmployeeList {

    private List<Employee> employees;

    /**
     * Creates a list of employees from the given file
     */
    public EmployeeList(File file) throws FileNotFoundException {
        /*
         * This is the 1st research portion of this lab, research how to use a custom delimiter in the scanner class
         */
        this.employees = new ArrayList<>();
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            // TODO 2.1 Read employees from file
            // STEP 1: Create a scanner for this line from the file
            // STEP 2: Use a comma (,) as the delimiter for the scanner you created.
            // STEP 3: Read the employee name from the line
            // STEP 4: Read the employee salary from the line
            // STEP 5: Add a new employee to the list using the method from 2.3
        }
        fileScanner.close();
    }

    /**
     * Prints out all of the employees in the list
     */
    public void displayEmployees() {
        // TODO 2.2 Iterate through employees list and print all the elements, use a for-each loop
    }

    /**
     * Adds an employee to the list
     */
    public void addEmployee(Employee employee) {
        // TODO 2.3 Add the given employee to the list
    }

    /**
     * This is a search algorithm, study it closely. We will cover these later in the course!
     * This is known as a linear search, it iterates through each element of the list and stops
     * when the given employee is found.
     *
     * @param employee This is known as the "needle", the employeeList is known as the "haystack"
     * @return The index of the given employee in the list, or -1 if no such employee was found
     */
    private int indexOf(Employee employee) {
        int index = -1;
        boolean found = false; // This is used to stop the loop as soon as the needle is found
        for (int i = 0; i < employees.size() && !found; i++) {
            if (employees.get(i).equals(employee)) {
                // Note the use of the equals method, some searches use only the reference for searching
                index = i;
                found = true;
            }
        }
        return index;
    }

    public void removeEmployee(Employee employee) {
        // TODO 2.4 Use the indexOf method to find the index of the employee given to remove. Make sure to check if the employee is not in the list
    }

    public Employee getHighestPaidEmployee() {
        // TODO 2.5 Iterate through the list, return the employee with the greatest salary. Use a for-each loop
        // THIS IS A STUB
        return null;
    }

    public Employee getLowestPaidEmployee() {
        // TODO 2.6 Iterate through the list, return the employee with the lowest salary. Use a for-each loop
        // THIS IS A STUB
        return null;
    }

    public double getTotalSalary() {
        // TODO 2.7 Iterate through the list, return the sum of the salaries of all the employees
        // THIS IS A STUB
        return 0.0;
    }

}
