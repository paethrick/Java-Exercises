package exercises.complex.billiardSaloon_good.src.main.java.org.example;

public enum OrderType {
    BEER(8),
    COKE(9),
    LEMONDA(7),
    BURGER(12),
    FRIES(10),
    FISH(11);

    private int price;

    OrderType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
