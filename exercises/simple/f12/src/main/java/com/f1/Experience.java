package exercises.simple.f12.src.main.java.com.f1;

public enum Experience {
    BEGINNER(20000),
    MEDIUM(40000),
    EXPERT(100000);

    private float price;

    Experience(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
