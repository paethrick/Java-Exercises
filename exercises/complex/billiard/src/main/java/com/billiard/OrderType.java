package exercises.complex.billiard.src.main.java.com.billiard;

public enum OrderType {
    COKE(10),
    BEER(12),
    LEMONADE(8),
    BURGER(15),
    FRIES(7),
    PIE(9);
    private int price;
    OrderType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
