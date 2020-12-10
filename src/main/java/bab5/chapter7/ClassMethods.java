package bab5.chapter7;

public class ClassMethods {

    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println("1: " + e.getClass());
        System.out.println("1.1: " + e.getClass().getName());

        if (e.getClass() == Employee.class) {
            System.out.println("2: True!");
        }

        String className = e.getClass().getName();

        try {
            Class cl = Class.forName(className);
            System.out.println("3: " + cl.getName());
        } catch (ClassNotFoundException ex) {
            System.err.println("3: Error!");
        }

        try {
            Class cl = Class.forName("Test");
            System.out.println("4: " + cl.getName());
        } catch (ClassNotFoundException ex) {
            System.err.println("4: Error!");
        }

        String iniString = "bab5.chapter7.Employee";

        try {
            Object iniObject = Class.forName(iniString).newInstance();
            System.out.println("5: " + iniObject.toString());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.err.println("5: Error!");
        }

    }
}

class Employee {

    @Override
    public String toString() {
        return "Return toString Employee";
    }
}
