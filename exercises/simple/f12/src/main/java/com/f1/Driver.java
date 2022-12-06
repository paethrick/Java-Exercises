package exercises.simple.f12.src.main.java.com.f1;

public class Driver extends Employee{

    private Experience experience;

    public Driver(String name, int age, Experience experience) {
        super(name, age);
        this.experience = experience;
    }

    public Experience getExperience() {
        return experience;
    }
}
