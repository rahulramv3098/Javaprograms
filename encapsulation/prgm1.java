package encapsulation;
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class prgm1 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Rahul");
        person.setAge(24);

        String name = person.getName();
        int age = person.getAge();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
