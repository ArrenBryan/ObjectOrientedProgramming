package bab4.chapter3;

import java.time.LocalDate;

/**
 * An object represents being an Indomaret's Employee.
 * 
 * @author <b> arrenbryan </b>
 * @version 1.1.1
 * @since 31 October 2020
 */
public class Employee {

    // instance fields or instance variable
    /**
     * The next id of Indomaret's Employee.
     */
    private static int nextId = 1;
    private int id = getNextId();
    private String name;
    private double salary;
    private LocalDate hireDay;
    private final String company = "Indomaret";
    
    // constructor with no argument
    public Employee() {
        System.out.println("Constructor kosong");
    }
    
    // overloading constructor
    public Employee(String n, double s, int year, int month, int day) {
        this();
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
        setId();
    }

    // a accessor or a getter
    public String getName() {
        return name;
    }
    
    // a static accessor or a static getter
    public static int getNextId() {
        return nextId;
    }

    // a mutator or a setter
    public void setName(String n) {
        this.name = n;
    }
    
    // a private mutator or a private setter
    private void setId() {
        id = nextId;
        nextId++;
    }
   
    // a method
    @Override
    public String toString() {
        String res = "Id: " + this.id + "\n";
        res += "Name: " + this.name + "\n";
        res += "Salary: " + this.salary + "\n";
        res += "Hire-day: " + this.hireDay + "\n";
        res += "Company: " + this.company + "\n";

        return res;
    }
    
    // a method
    // keyword: "this", pada dasarnya adalah sebuah parameter object itu sendiri.
    // jika di tulis parameternya, maka (Employee this, double byPercent).
    // oleh karena itu, variabel "this" dapat direpresentasikan sebagai object
    // dari Employee
    /**
    * Raises the salary of an employee.
    * @param byPercent the percentage by which to raise the salary (e.g. 10 means 10%)
    */
    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }
    
    // a method
    public boolean equals(Employee other) {
        return name.equals(other.name);
    }
    
    // more methods
    
    // ===================================================================== //
    // a main method
    public static void main(String[] args) {
        Employee jamesBond = new Employee("James Bond", 100000, 1950, 1, 1);
        System.out.println(jamesBond.toString());
    }
}
