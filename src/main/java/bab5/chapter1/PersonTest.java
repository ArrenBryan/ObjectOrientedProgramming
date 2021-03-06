package bab5.chapter1;

import java.time.*;

/**
 * This program demonstrates abstract classes.
 *
 * @version 1.01 2004-02-21
 * @author Cay Horstmann
 */
public class PersonTest {

    public static void main(String[] args) {
        Person[] people = new Person[2];

        // fill the people array with Student and Employee objects
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

        // print out names and descriptions of all Person objects
        for (Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }

    }

}

abstract class Person {

    public abstract String getDescription();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

class Employee extends Person {

    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

}

class Student extends Person {

    private String major;

    /**
     * @param nama the student's name
     * @param major the student's major
     */
    public Student(String name, String major) {
        // pass n to superclass constructor
        super(name);
        this.major = major;
    }

    public String getDescription() {
        return "a student majoring in " + major;
    }

}
