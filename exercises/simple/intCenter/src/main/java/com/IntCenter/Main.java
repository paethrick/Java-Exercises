package exercises.simple.intCenter.src.main.java.com.IntCenter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Plumber plumber = new Plumber("Bob",Experience.MEDIUM);
        Electrician electrician = new Electrician("Sam",Experience.EXPERT);
        Plumber plumber2 = new Plumber("Jenny",Experience.BEGINNER);
        Electrician electrician2 = new Electrician("Luke",Experience.MEDIUM);
        Plumber plumber3 = new Plumber("Isma",Experience.EXPERT);
        Electrician electrician3 = new Electrician("Lewis",Experience.EXPERT);
        GasFitter gasFitter = new GasFitter("Anny",Experience.EXPERT);
        GasFitter gasFitter2 = new GasFitter("Lumbago",Experience.MEDIUM);
        GasFitter gasFitter3 = new GasFitter("Osman",Experience.BEGINNER);
        GasFitter gasFitter4 = new GasFitter("Liam",Experience.BEGINNER);
        company.addWorkers(Arrays.asList(plumber3,plumber2,plumber,electrician2,electrician3,electrician,
                gasFitter,gasFitter2,gasFitter3,gasFitter4));
        company.calculateCompanyIncome(2);
        System.out.println(company.calculateIncome(electrician3));
    }
}
