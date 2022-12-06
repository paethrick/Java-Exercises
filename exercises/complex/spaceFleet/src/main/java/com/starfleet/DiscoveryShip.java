package exercises.complex.spaceFleet.src.main.java.com.starfleet;

public class DiscoveryShip extends Mobile{

    private int speed = 150;

    public DiscoveryShip(int registrationCode, String name, int year) {
        super(registrationCode, name, year);
        if(year>2200){
            this.addSpeed(15);
        } else if (year<2150) {
            this.reduceSpeed(30);
        }
    }

    public int getSpeed(){
        return speed;
    }

    public void addSpeed(int plus) {
        speed = speed + plus;
    }
    public void reduceSpeed(int min) {
        speed = speed - min;
    }
}
