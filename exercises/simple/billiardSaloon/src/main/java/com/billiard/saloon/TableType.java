package exercises.simple.billiardSaloon.src.main.java.com.billiard.saloon;

public enum TableType {
    SNOOKER(1600),
    POOL(1200),
    REX(800);

    private float price;

    TableType(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
