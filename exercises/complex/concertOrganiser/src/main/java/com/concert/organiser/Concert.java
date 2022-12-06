package exercises.complex.concertOrganiser.src.main.java.com.concert.organiser;


public abstract class Concert {

    private Band mainBand;
    private Band warmUpBand;
    private String style;
    private ConcertType concertType;
    private float beerPrice;
    private int participant;
    private float ticketPrice;

    public abstract float calculateIncome(float beerPrice, int participant,float ticketPrice);

    public Concert(Band mainBand, Band warmUpBand, String style, ConcertType concertType, float beerPrice, int participant, float ticketPrice) {
        this.mainBand = mainBand;
        this.warmUpBand = warmUpBand;
        this.style = style;
        this.concertType = concertType;
        this.beerPrice = beerPrice;
        this.participant = participant;
        if(ticketPrice < 12000 || ticketPrice > 15000){
            throw new IllegalArgumentException("The price needs to be between 12.000 and 15.000");
        } else {
            this.ticketPrice = ticketPrice;
        }
    }

    @Override
    public String toString() {
        return "Concert{" +
                "mainBand=" + mainBand +
                ", warmUpBand=" + warmUpBand +
                ", style='" + style + '\'' +
                ", concertType=" + concertType +
                ", beerPrice=" + beerPrice +
                ", participant=" + participant +
                ", ticketPrice=" + ticketPrice +
                '}';
    }

    public float getBeerPrice() {
        return beerPrice;
    }

    public int getParticipant() {
        return participant;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }
}
