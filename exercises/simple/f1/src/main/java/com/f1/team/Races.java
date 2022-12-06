package exercises.simple.f1.src.main.java.com.f1.team;

public enum Races {
    WIN(10000000),
    SECOND(1000000);
    private float price;

    Races(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
