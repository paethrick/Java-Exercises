package com.train;

public class IC extends Train{

    private int coaches;
    private float cost = 1200;

    public IC(int serialNumber, int productionYear, int coaches) {
        super(serialNumber, productionYear);
        if(coaches>10){
            throw new IllegalArgumentException("Coaches should be maximised at 10");
        } else {
            this.coaches = coaches;
        }
    }

    public int getCoaches() {
        return coaches;
    }

    public float getCost() {
        return cost;
    }

    public float getRevenue(){
        return (float) ((coaches * 50 * 2 * 0.75) + (coaches * 50 * 4 * 0.25));
    }
}
