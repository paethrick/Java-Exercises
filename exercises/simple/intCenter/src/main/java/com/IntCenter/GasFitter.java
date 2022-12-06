package exercises.simple.intCenter.src.main.java.com.IntCenter;

public class GasFitter extends Worker{

    private final int allDays = 15;

    public GasFitter(String name, Experience experience) {
        super(name, experience);
    }

    public int getAllDays() {
        return allDays;
    }


}
