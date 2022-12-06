package exercises.simple.concertOrganiser.src.main.java.com.Concert.Organiser;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Band main1 = new Band("The one",BandType.ROCK);
        Band warmUp1 = new Band("The Zzzz",BandType.ROCK);

        Band main2 = new Band("The two??",BandType.POP);
        Band warmUp2 = new Band("Bees in the bee hive",BandType.POP);

        Band main3 = new Band("Lulu",BandType.JAZZ);
        Band warmUp3 = new Band("How to make music",BandType.JAZZ);

        Concert c1 = new Concert(ConcertType.INDOOR,13000,"Paris");
        Concert c2 = new Concert(ConcertType.OUTDOOR,12500,"New York");
        Concert c4 = new Concert(ConcertType.FESTIVAL,13000,"Budapest");

        c1.addMainBand(main1);
        c1.setBeerConsumption(4000);
        c1.setCapacity(1400);

        c2.addMainBand(main2);
        c2.setBeerConsumption(4000);
        c2.setCapacity(2000);

        c4.addMainBand(main3);
        c4.setBeerConsumption(9000);
        c4.setCapacity(7999);


        ConcertOrg concertOrg = new ConcertOrg(Arrays.asList(c1,c2,c4));
        System.out.println(c4.calcProfit());
        System.out.println(concertOrg.calcProfit());
        concertOrg.cancelConcert(c2);
        System.out.println(concertOrg.calcProfit());

    }
}
