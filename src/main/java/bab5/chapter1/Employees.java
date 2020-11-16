package bab5.chapter1;

//import java.util.Objects;

public class Employees {

    protected String name;
    protected double salary;
    protected int hireDay;
    protected int hireMonth;
    protected int hireYear;

    public Employees(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireDay = day;
        hireMonth = month;
        hireYear = year;
    }

    public double getSalary() {
        return salary;
    }

    public final int hireYear() {
        return hireYear;
    }

    @Override
    public boolean equals(Object otherObject) {
        // a quick test to see if the objects are identical
        if (this == otherObject) {
            System.out.println("1");
            return true;
        }

        // must return false if the explicit parameter is null
        if (otherObject == null) {
            System.out.println("2");
            return false;
        }

        // if the classes don't match, they can't be equal
        if (getClass() != otherObject.getClass()) {
            System.out.println("3");
            return false;
        }

        // now we know otherObject is a non-null Employee
        Employees other = (Employees) otherObject;
        System.out.println("4");
        // test whether the fields have identical values
        return name.equals(other.name)
                && salary == other.salary
                && hireDay == other.hireDay;
    }
    
    public String toString() {
        return getClass().getName()
                + "[Name = " + name
                + ", Salary = " + salary;
    }

    // ========================================================//

    public static void main(String[] args) {
        Employees emp1 = new Employees("Arren", 100000, 1, 9, 2000);
        Employees emp2 = new Manager("Bryan", 500000, 11, 12, 2020);
        Object obj1 = new Employees("ArrenBryan", 10000, 14, 9, 2005);

        if (obj1 instanceof Employees) {
            System.out.println("obj1 = Manager");
        }

        System.out.println(emp1.equals(emp1));
        System.out.println(emp1.equals(null));
        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.equals(obj1));
    }
}

class Manager extends Employees {

    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day); // Harus dipanggil secara eksplisit
        bonus = 0;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!super.equals(otherObject)) {
            return false;
        }

        // super.equals checked that this and otherObject belong to the same class
        Manager other = (Manager) otherObject;
        return bonus == other.bonus;
    }

}
