package exercises.simple.f1.src.main.java.com.f1.team;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Driver d1 = new Driver(31,"bob",Experience.EXPERT);
        Driver d2 = new Driver(28,"sam",Experience.MEDIUM);

        Car car1 = new Car();
        Car car2 = new Car();

        PitCrew p1 = new PitCrew(25,"fred");
        PitCrew p2 = new PitCrew(32,"lui");
        PitCrew p3 = new PitCrew(28,"other bob");
        PitCrew p4 = new PitCrew(41,"dave");

        Engineer e1 = new Engineer(45,"emili");
        Engineer e2 = new Engineer(32,"rose");
        List<Employee> employees = Arrays.asList(d1,d2,p1,p2,p3,p4,e1,e2);
        List<Car> cars = Arrays.asList(car1,car2);
        Team team = new Team(employees,cars);

        float year = team.calcIncome(22,2,5);
        System.out.println(year);
    }
}
