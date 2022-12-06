package exercises.simple.intCenter.src.main.java.com.IntCenter;

import java.util.ArrayList;
import java.util.List;

public class Company {

    List<Worker> workerList;

    public Company() {
        workerList = new ArrayList<>();
    }

    public List<Worker> getWorkerList() {
        return workerList;
    }

    public void addWorkers(List<Worker> workers){
        for(Worker worker : workers){
            workerList.add(worker);
        }
    }

    public void addWorker(Worker worker){
        workerList.add(worker);
    }

    public void calculateCompanyIncome( int months){
        //TODO: minus should be calculated in classes, more OOP
        float fullSalary = 0;
        for(Worker worker : workerList){
            float oneDay = (float) (worker.getFee() * worker.getExperience().getPercent());
            float minus = 0;
            if(worker.getClass() == Plumber.class){
                minus = worker.getExperience().getCost();
                fullSalary += (oneDay * ((Plumber) worker).getAllDays()) - minus;
            } else if(worker.getClass() == Electrician.class){
                minus = ((Electrician) worker).getElectricianMembershipFee();
                fullSalary += (oneDay * ((Electrician) worker).getAllDays()) - minus;
            } else if(worker.getClass() == GasFitter.class){
                fullSalary += oneDay * ((GasFitter) worker).getAllDays();
            }
        }
        finalIncome(fullSalary,secretaryJob(months),months);
    }

    public float secretaryJob(int number){
        //TODO: learn interfaces
        List<String> secretaryList = new ArrayList<>();
        float missingIncome = 0;
        int num = (20 * number) / workerList.size();
        for(int i=0; i<num;i++){
            for(Worker worker : workerList){
                secretaryList.add(worker.getName());
                missingIncome += calculateIncome(worker);

            }
        }
        System.out.println("The secretaries were: " + secretaryList);
        return missingIncome;
    }

    public void finalIncome(float fullSalary, float minus, int months){
        float finalIncome = (fullSalary * months) - minus;
        System.out.println("The companies monthly income is: " + finalIncome + " after " + months + " months.");
    }

    public float calculateIncome(Worker worker){
        float salary = (float) (worker.getFee() * worker.getExperience().getPercent());
        return salary;
    }
}
