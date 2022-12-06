package exercises.simple.scoutCamp.src.main.java.com.scout.camp;

public class Patrol {

    private Kid kids;
    private int numberOfKids;

    public Patrol(Kid kids, int numberOfKids) {
        this.numberOfKids = numberOfKids;
        this.kids = kids;
    }

    public int getNumberOfKids() {
        return numberOfKids;
    }

    public Kid getKids() {
        return kids;
    }
}
