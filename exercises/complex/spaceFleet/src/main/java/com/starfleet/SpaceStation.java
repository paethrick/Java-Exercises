package exercises.complex.spaceFleet.src.main.java.com.starfleet;

import java.util.ArrayList;
import java.util.List;

public class SpaceStation extends SpaceCraft{

    private List<SpaceCraft> dock;

    public SpaceStation(int registrationCode, String name, int year) {
        super(registrationCode,name,year);
        dock = new ArrayList<>();
    }

    public void dockShip(Mobile ship){
        if (dock.size()<2){
            dock.add(ship);
        } else{
            throw new IllegalArgumentException("2 ships already docked in this SpaceStation");
        }
    }

    public List<SpaceCraft> getDock() {
        return dock;
    }
}
