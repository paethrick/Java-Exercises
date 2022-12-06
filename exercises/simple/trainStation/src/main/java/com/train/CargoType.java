package com.train;

public enum CargoType {

    NORMAL(550),
    NONSOLID(700),
    DANGEROUS(850);

    private float revenue;

    CargoType(int revenue) {
        this.revenue = revenue;
    }

    public float getRevenue() {
        return revenue;
    }
}
