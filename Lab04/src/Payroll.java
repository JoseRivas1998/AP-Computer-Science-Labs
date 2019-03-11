import java.io.File;
import java.io.FileNotFoundException;

/**
 * Implements a payroll simulator. Includes a main method.
 *
 * @author Jose de Jesus Rodriguez Rivas
 * @version 2019/02/10
 */
public class Payroll {

    public static void main(String[] args) throws FileNotFoundException {
        new Payroll();
    }

    private Payroll() throws FileNotFoundException {
        String fileName = "employees.txt";
        File file = new File(fileName);

        System.out.println("Creating Employee List");
        EmployeeList employeeList = new EmployeeList(file);

        System.out.println();

        System.out.println("Employee List Created:");
        employeeList.displayEmployees();

        System.out.println();

        System.out.println("Payroll cost: " + employeeList.getTotalSalary());
        System.out.println("Highest Paid Employee: " + employeeList.getHighestPaidEmployee());
        System.out.println("Lowest Paid Employee: " + employeeList.getLowestPaidEmployee());

        System.out.println();

        Employee toAdd = new Employee("Peter Smith", 20000);
        System.out.println("Adding employee: " + toAdd);
        employeeList.addEmployee(toAdd);

        System.out.println();

        Employee toRemove = new Employee("Joshua Doe", 125000);
        System.out.println("Removing employee: " + toRemove);
        employeeList.removeEmployee(toRemove);

        System.out.println();

        System.out.println("Employee List:");
        employeeList.displayEmployees();

        System.out.println();

        System.out.println("Highest Paid Employee: " + employeeList.getHighestPaidEmployee());
        System.out.println("Lowest Paid Employee: " + employeeList.getLowestPaidEmployee());
        System.out.println("Payroll cost: " + employeeList.getTotalSalary());
    }

}
