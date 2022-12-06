package exercises.simple.f12.src.main.java.com.f1;

import java.util.List;

public class F1Team {

    private List<Driver> drivers;
    private List<Engineer> engineers;
    private List<PitCrew> pitCrewList;
    private CarParts carParts;

    public F1Team(List<Driver> drivers, List<Engineer> engineers, List<PitCrew> pitCrewList, CarParts carParts) {
        this.drivers = drivers;
        this.engineers = engineers;
        this.pitCrewList = pitCrewList;
        this.carParts = carParts;
    }

    public float calculateRev(){
        float allCost = 0;
        for(Driver driver : drivers){
            allCost += driver.getExperience().getPrice();
        }
        for(Engineer engineer : engineers){
            allCost += engineer.getSALARY();
        }

        for(PitCrew pitCrew : pitCrewList){
            allCost += pitCrew.getSALARY();
        }
        allCost += carParts.usedCarParts();
        return 15000000 - allCost;
    }




}
