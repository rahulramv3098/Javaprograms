package inheritance;

class Employees {
    void work() {
        System.out.println("Employees are working");
    }
}

class Employee1 extends Employees{
    void emp1() {
        System.out.println("Employee1 is a developer");
    }
}

class Employee2 extends Employee1 {
    void emp2() {
        System.out.println("Employee2 is a designer");
    }
}

public class prgm1{
    public static void main(String[] args) {
        Employee2 details = new Employee2();
        details.work();
        details.emp1();
        details.emp2(); 
    }
}
