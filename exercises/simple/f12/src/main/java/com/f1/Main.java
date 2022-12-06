package exercises.simple.f12.src.main.java.com.f1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Driver d1 = new Driver("Latifi",25,Experience.MEDIUM);
        Driver d2 = new Driver("Massi",34,Experience.EXPERT);

        Engineer e1 = new Engineer("Bob",24);
        PitCrew p1 = new PitCrew("Steve",31);

        CarParts carParts = new CarParts();

        F1Team team = new F1Team(Arrays.asList(d1,d2),Arrays.asList(e1),Arrays.asList(p1),carParts);
        System.out.println(team.calculateRev());
    }
}
