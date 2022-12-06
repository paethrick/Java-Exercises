package exercises.simple.concertOrganiser.src.main.java.com.Concert.Organiser;

import java.util.ArrayList;
import java.util.List;

public class Concert {

    private ConcertType concertType;
    private float ticketPrice;
    private int beerConsumption;
    private Band mainBand;
    private List<Band> warmUpBands;
    private Band firstWarmUp;
    private BandType style;
    private int capacity;
    private String venue;

    public Concert(ConcertType concertType, float ticketPrice, String venue){
        this.concertType = concertType;
        if(ticketPrice < 15000 && ticketPrice > 12000){
            this.ticketPrice = ticketPrice;
        } else {
            throw new IllegalArgumentException("Not correct ticket price");
        }
        this.venue = venue;
        this.warmUpBands = new ArrayList<>();
    }

    public void setBeerConsumption(int beerConsumption) {
        this.beerConsumption = beerConsumption;
    }

    public void addMainBand(Band mainBand) {
        this.mainBand = mainBand;
        this.style = mainBand.getStyle();
        setFirstWarmUp(mainBand);
    }

    public void addWarmUpBands(List<Band> warmUpBands) {
        this.warmUpBands.addAll(warmUpBands);
    }

    public ConcertType getConcertType() {
        return concertType;
    }

    public void setFirstWarmUp(Band firstWarmUp) {
        for(Band band : warmUpBands){
            if(mainBand.getStyle().equals(band.getStyle())){
                this.firstWarmUp = firstWarmUp;
                break;
            }
        }
    }

    public void setCapacity(int capacity){
        if(capacity > concertType.getCapacity()){
            throw new IllegalArgumentException("Too many people!");
        } else {
            this.capacity = capacity;
        }
    }

    public float calcProfit(){
        float beerIncome = beerConsumption * concertType.getBeerPrice();
        float ticketIncome = (float) ((ticketPrice * concertType.getCapacity()) * 0.4);
        float fullIncome = beerIncome + ticketIncome;
        return fullIncome;
    }
}
