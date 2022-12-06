package exercises.complex.billiardSaloon_good.src.main.java.org.example;

public enum TableType {

    POOL(1200),
    SNOOKER(1600),
    REX(800);

    private float price;

    TableType(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
