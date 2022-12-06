package exercises.simple.f1.src.main.java.com.f1.team;

public class Driver extends Employee{

    private Experience experience;

    public Driver(int age, String name, Experience experience) {
        super(age, name);
        this.experience = experience;
    }

    public float calcSalary(int races){
        return this.experience.getSalary() * races;
    }
}
