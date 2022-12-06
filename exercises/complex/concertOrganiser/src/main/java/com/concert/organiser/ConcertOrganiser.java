package exercises.complex.concertOrganiser.src.main.java.com.concert.organiser;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConcertOrganiser {

    private Set<Concert> concerts;
    private List<Band> warmUps;

    private final double TICKET_PROFIT_PERCENTAGE = 0.4;


    public double calculateProfit(){
        double allConcertRevenue = 0;
        for(Concert concert : concerts){
            float fullInc = concert.calculateIncome(concert.getBeerPrice(), concert.getParticipant(), concert.getTicketPrice());
             allConcertRevenue += fullInc * TICKET_PROFIT_PERCENTAGE;
        }
        return allConcertRevenue;
    }

    public ConcertOrganiser(List<Band> warmUps) {
        this.warmUps = warmUps;
        concerts = new HashSet<>();
    }

    public Band getWarmUpBand(Band mainBand){
        for(Band band : warmUps){
            if(band.getStyle() == mainBand.getStyle()){
                return band;
            }
        }
        return mainBand;
    }

    public void addConcert(Concert concert){
        concerts.add(concert);
    }
}
