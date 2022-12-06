package exercises.simple.intCenter.src.main.java.com.IntCenter;

public class Plumber extends Worker{

    private final int allDays = 20;

    public Plumber(String name, Experience experience) {
        super(name, experience);
    }

    public int getAllDays() {
        return allDays;
    }
}
