package exercises.complex.spaceFleet.src.main.java.com.starfleet;

public class CargoShip extends Mobile{

    private int speed = 450;
    private Cargo cargo;
    private int cargoPieces;

    public CargoShip(int registrationCode, String name, int year, Cargo cargo, int cargoPieces) {
        super(registrationCode, name, year);
        this.cargo = cargo;
        this.cargoPieces=cargoPieces;
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

    @Override
    public String toString() {
        return "CargoShip{" +
                "speed=" + speed +
                ", cargo=" + cargo +
                ", cargoPieces=" + cargoPieces +
                '}';
    }
}
