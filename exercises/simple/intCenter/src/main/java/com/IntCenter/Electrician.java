package exercises.simple.intCenter.src.main.java.com.IntCenter;

public class Electrician extends Worker{

    private final int allDays = 15;

    private final float electricianMembershipFee = 5000;

    public Electrician(String name, Experience experience) {
        super(name, experience);

    }

    public float getElectricianMembershipFee() {
        return electricianMembershipFee;
    }

    public int getAllDays() {
        return allDays;
    }
}
