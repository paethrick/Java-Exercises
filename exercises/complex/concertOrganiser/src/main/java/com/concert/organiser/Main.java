package exercises.complex.concertOrganiser.src.main.java.com.concert.organiser;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Main bands
        Band aMain = new Band(BandType.POP,"The A");
        Band bMain = new Band(BandType.JAZZ,"The A");
        Band cMain = new Band(BandType.ROCK,"The A");
        Band dMain = new Band(BandType.ROCK,"The A");
        Band eMain = new Band(BandType.POP,"The A");

        //Warm Up bands
        Band W1 = new Band(BandType.JAZZ,"dudlies");
        Band W2 = new Band(BandType.JAZZ,"moodies");
        Band W3 = new Band(BandType.ROCK,"puppies");
        Band W4 = new Band(BandType.ROCK,"ies");
        Band W5 = new Band(BandType.POP,"s");
        Band W6 = new Band(BandType.POP,"idk");
        List<Band> bandList = Arrays.asList(W1,W2,W3,W4,W5,W6);
        ConcertOrganiser concertOrganiser = new ConcertOrganiser(bandList);


        Indoor firstConcert = new Indoor(
                aMain,
                concertOrganiser.getWarmUpBand(aMain),
                "very stylish",
                ConcertType.INDOOR,
                ConcertType.INDOOR.getPrice(),
                2500,
                12000,
                1500);

        Outdoor secondConcert = new Outdoor(
                cMain,
                concertOrganiser.getWarmUpBand(cMain),
                "so stylish",
                ConcertType.OUTDOOR,
                ConcertType.OUTDOOR.getPrice(),
                2400,
                14000,
                1500);

        concertOrganiser.addConcert(firstConcert);
        concertOrganiser.addConcert(secondConcert);

        System.out.println(concertOrganiser.calculateProfit());
        System.out.println(firstConcert.toString());
        System.out.println(secondConcert.toString());
    }
}
