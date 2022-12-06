package exercises.complex.concertOrganiser.src.main.java.com.concert.organiser;

import java.time.Duration;

public class Outdoor extends Concert{

    private boolean isRaining = false;

    private Duration duration = Duration.ofMinutes(120);
    private int capacity;

    public Outdoor(Band mainBand, Band warmUpBand, String style, ConcertType concertType, float beerPrice, int participant, float ticketPrice, int capacity){
        super(mainBand,warmUpBand,style,concertType,beerPrice,participant,ticketPrice);
        if(capacity>6000){
            throw new IllegalArgumentException("This venue is limited to 6000 people");
        } else{
            this.capacity = capacity;
        }
    }

    public boolean isCancelled(){
        return true;
    }

    public void makeItRain(){
        isRaining = true;
    }

    public float calculateIncome(float beerPrice, int participant,float ticketPrice){
        return beerPrice * participant + ticketPrice * participant;
    }
}
