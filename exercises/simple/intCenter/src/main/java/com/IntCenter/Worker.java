package exercises.simple.intCenter.src.main.java.com.IntCenter;

public class Worker {
    private float fee;
    private String name;
    private Experience experience;

    public Worker(String name, Experience experience) {
        this.name = name;
        this.experience = experience;
        this.fee = 100000;
    }

    public float getFee() {
        return fee;
    }


    public String getName() {
        return name;
    }

    public Experience getExperience() {
        return experience;
    }


}
