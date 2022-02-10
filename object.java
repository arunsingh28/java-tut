public class object {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.age = 12;
        p1.name = "John";
        p2.salary = 1200;

        p1.print();
    }
}

class Person {
    String name;
    int age;
    int salary;

    void print() {
        System.out.println("Person age is " + age + " and name is " + name);
    }
}