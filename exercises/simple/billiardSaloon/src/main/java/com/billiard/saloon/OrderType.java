package exercises.simple.billiardSaloon.src.main.java.com.billiard.saloon;

public enum OrderType {
    COKE(5),
    BEER(6),
    LEMONADE(4),
    BURGER(10),
    FRIES(8),
    HOTDOG(9);

    private float price;

    OrderType(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
