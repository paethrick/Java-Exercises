package exercises.simple.f1.src.main.java.com.f1.team;

public enum Experience {
    BEGINNER(20000),
    MEDIUM(40000),
    EXPERT(100000);
    private float salary;

    Experience(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }
}
