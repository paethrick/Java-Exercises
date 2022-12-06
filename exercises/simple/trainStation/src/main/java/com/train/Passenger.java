package com.train;

public class Passenger extends Train{

    private int coaches;
    private float cost = 1000;

    public Passenger(int serialNumber, int productionYear, int coaches) {
        super(serialNumber, productionYear);
        this.coaches = coaches;
    }

    public int getCoaches() {
        return coaches;
    }

    public float getCost() {
        return cost;
    }

    public float getRevenue(){
        return (float) ((coaches * 50 * 1.5 * 0.75) + (coaches * 50 * 3.5 * 0.25));
    }
}
