package exercises.simple.concertOrganiser.src.main.java.com.Concert.Organiser;

import java.util.ArrayList;
import java.util.List;

public class ConcertOrg {

    private List<Concert> concerts;

    public ConcertOrg(List<Concert> concerts) {
        this.concerts = new ArrayList<>(concerts);
    }

    public float calcProfit(){
        float fullProfit = 0;
        for(Concert concert : concerts){
            fullProfit += concert.calcProfit();
        }
        return fullProfit;
    }

    public void cancelConcert(Concert concert){
        if(concert.getConcertType().equals(ConcertType.OUTDOOR)){
            concerts.remove(concert);
        }
    }
}
