package exercises.simple.f1.src.main.java.com.f1.team;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<Employee> employees;
    private List<Car> cars;

    public Team(List<Employee> employees, List<Car> cars) {
        this.cars = new ArrayList<>(cars);
        this.employees = new ArrayList<>(employees);
    }

    public float calcSalary(int races){
        float sumSalary = 0;
        for(Employee employee : employees){
            if(employee instanceof CrewSalary crew){
                sumSalary += crew.calcSalary(races * CrewSalary.workdays);
            } else if (employee instanceof Driver driver) {
                sumSalary += driver.calcSalary(races);
            }

        }
        return sumSalary;
    }

    public float calcProfit(int races, int wins, int seconds){
        float winProfit = Races.WIN.getPrice() * wins;
        float secondProfit = Races.SECOND.getPrice() * seconds;
        float carCost = 0;
        for(Car car : cars){
            carCost += car.calcCarPartCost() * races;
        }
        return winProfit + secondProfit - carCost;

    }

    public float calcIncome(int races, int wins, int seconds){
        float profit = calcProfit(races,wins,seconds);
        float salary = calcSalary(races);
        return profit - salary;
    }
}
