package com.train;

public class Freight extends Train {

    CargoType cargoType;
    private float cost = 300;

    public Freight(int serialNumber, int productionYear, CargoType cargoType) {
        super(serialNumber, productionYear);
        this.cargoType = cargoType;
    }

    public float getCost() {
        return cost;
    }

    @Override
    public float getRevenue() {
        return cargoType.getRevenue();
    }
}
