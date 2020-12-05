package bab6.chapter1;

import java.util.*;

/**
 * This program demonstrates the use of the Comparable interface.
 *
 * @version 1.30 2004-02-27
 * @author Cay Horstmann
 */
public class EmployeeSortTest {

    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);
        Arrays.sort(staff);

        // print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary());
        }
       
        Comparable x = new Employee("Arren Bryan", 350000);
        if (x instanceof Comparable) {
            System.out.println("True!");
        } 

    }

}

class Employee implements Comparable<Employee> {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * Compares employees by salary
     *
     * @param other another Employee object
     * @return a negative value if this employee has a lower salary than
     * otherObject, 0 if the salaries are the same, a positive value otherwise
     */
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }

}
