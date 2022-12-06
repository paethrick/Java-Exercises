package exercises.complex.concertOrganiser.src.main.java.com.concert.organiser;

import java.time.Duration;

public class Festival extends Concert{

    private int capacity;

    private Duration duration = Duration.ofMinutes(300);

    public Festival(Band mainBand, Band warmUpBand, String style, ConcertType concertType, float beerPrice, int participant, float ticketPrice, int capacity){
        super(mainBand,warmUpBand,style,concertType,beerPrice,participant,ticketPrice);
        if(capacity>8000){
            throw new IllegalArgumentException("This venue is limited to 8000 people");
        } else{
            this.capacity = capacity;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public Duration getDuration() {
        return duration;
    }

    public float calculateIncome(float beerPrice, int participant,float ticketPrice){
        return beerPrice * participant + ticketPrice * participant;
    }
}
