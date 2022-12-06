package exercises.simple.f12.src.main.java.com.f1;

public class Employee {

    private String name;
    private int age;
    private final float SALARY = 1000;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public float getSALARY() {
        return SALARY;
    }
}
