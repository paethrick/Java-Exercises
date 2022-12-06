package exercises.complex.spaceFleet.src.main.java.com.starfleet;

public abstract class Mobile extends SpaceCraft{

    private int speed;
    public Mobile(int registrationCode, String name, int year) {
        super(registrationCode, name, year);
    }

    public abstract int getSpeed();

    public abstract void addSpeed(int plus);
    public abstract void reduceSpeed(int min);
}
