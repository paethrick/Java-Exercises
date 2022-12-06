package exercises.complex.spaceFleet.src.main.java.com.starfleet;

public abstract class SpaceCraft {

    private int registrationCode;
    private String name;
    private int year;

    public SpaceCraft(int registrationCode, String name, int year) {
        this.registrationCode = registrationCode;
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "SpaceCraft{" +
                "registrationCode=" + registrationCode +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
