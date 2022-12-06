package com.train;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IC firstIC = new IC(1,1990,8);
        Passenger firstPass = new Passenger(2,1995,20);
        Freight firstFreight = new Freight(3,2001,CargoType.NORMAL);
        Passenger secondPass = new Passenger(4,2002,30);
        TrainCompany trainCompany = new TrainCompany(Arrays.asList(firstFreight,firstIC,firstPass,secondPass));
        System.out.println(trainCompany.getRevenue());

    }
}
