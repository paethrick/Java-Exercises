package exercises.simple.f1.src.main.java.com.f1.team;

public class Engineer extends Employee implements CrewSalary{

    public Engineer(int age, String name) {
        super(age, name);
    }


    @Override
    public float calcSalary(int days) {
        return salary * days;
    }
}
