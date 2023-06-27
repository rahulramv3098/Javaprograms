package Programs.polymorphism;

class Employee {
    public void work() {
        System.out.println("All employees work");
    }
}

class Employee1 extends Employee {
    public void work() {
        System.out.println("Employee1 works 9hrs a day");
    }
}

class Employee2 extends Employee {
    public void work() {
        System.out.println("Employee2 works 8hrs a day");
    }
}

public class program1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee emp1 = new Employee1();
        Employee emp2 = new Employee2();

        emp.work();
        emp1.work();
        emp2.work();
    }
}
