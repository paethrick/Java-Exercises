package exercises.simple.scoutCamp.src.main.java.com.scout.camp;

public class Main {
    public static void main(String[] args) {
        ScoutCamp scoutCamp = new ScoutCamp();
        Kid boys = new Kid(Gender.BOYS);
        Kid girls = new Kid(Gender.GIRLS);
        Patrol boyPatrol = new Patrol(boys,10);
        Patrol girlPatrol = new Patrol(girls,10);


    }
}
