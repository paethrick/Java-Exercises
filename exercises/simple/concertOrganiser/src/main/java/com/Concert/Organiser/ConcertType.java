package exercises.simple.concertOrganiser.src.main.java.com.Concert.Organiser;

public enum ConcertType {
    INDOOR(600,3000,90),
    OUTDOOR(800,5000,120),
    FESTIVAL(1000,8000,360);

    private float beerPrice;
    private int capacity;
    private int duration;

    ConcertType(float beerPrice, int capacity, int duration) {
        this.beerPrice = beerPrice;
        this.capacity = capacity;
        this.duration = duration;
    }

    public float getBeerPrice() {
        return beerPrice;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getDuration() {
        return duration;
    }
}
