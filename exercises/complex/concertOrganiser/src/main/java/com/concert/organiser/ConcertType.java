package exercises.complex.concertOrganiser.src.main.java.com.concert.organiser;

public enum ConcertType {
    INDOOR(600),
    OUTDOOR(800),
    FESTIVAL(1000);

    private float price;
    private int capacity;
    private int duration;
    ConcertType(float price){
        this.price = price;
    }

    public float getPrice() {
        return price;
    }
}
