package exercises.complex.spaceFleet.src.main.java.com.starfleet;

public class Main {
    public static void main(String[] args) {
        SpaceStation firstStation = new SpaceStation(001,"First Station",2100);
        CargoShip firstCargo = new CargoShip(001,"Cargo",2280,Cargo.MEDICINE,Cargo.MEDICINE.setPieces(2));
        DiscoveryShip firstDisc = new DiscoveryShip(004,"Discover smthn",2010);
        firstStation.dockShip(firstCargo);
        firstStation.dockShip(firstDisc);
        System.out.println(firstStation.getDock());
        System.out.println(firstCargo.getSpeed());

    }
}
