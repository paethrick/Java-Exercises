package exercises.simple.f1.src.main.java.com.f1.team;

public class Car {

    private final float CARPART;

    public Car() {
        this.CARPART = 10000;
    }

    public float getCarPart() {
        return CARPART;
    }

    public float calcCarPartCost(){
        return getCarPart() * 2;
    }
}
