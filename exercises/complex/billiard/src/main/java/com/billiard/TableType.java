package exercises.complex.billiard.src.main.java.com.billiard;

public enum TableType {
    POOL(1200),
    SNOOKER(1600),
    REX(800);

    private int price;

    TableType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


}
