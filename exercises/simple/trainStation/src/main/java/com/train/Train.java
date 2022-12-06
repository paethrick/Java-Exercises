package com.train;

public abstract class Train {

    private int serialNumber;

    private int productionYear;

    public Train(int serialNumber, int productionYear) {
        this.serialNumber = serialNumber;
        this.productionYear = productionYear;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public abstract float getCost();
    public abstract float getRevenue();
}
