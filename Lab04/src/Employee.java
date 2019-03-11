/**
 * [DESCRIBE CLASS HERE]
 *
 * @author [YOUR NAME HERE]
 * @version [DATE HERE]
 */
public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
        this.name = "";
        this.salary = 0.0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        // TODO 1.1 Use template from previous labs, use name and salary for equality
        return false;
    }

    @Override
    public String toString() {
        return this.name + "," + this.salary;
    }

}
