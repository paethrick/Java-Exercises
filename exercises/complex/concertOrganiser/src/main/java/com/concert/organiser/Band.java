package exercises.complex.concertOrganiser.src.main.java.com.concert.organiser;

import java.util.Set;

public class Band {

    private BandType style;
    private String name;

    public Band(BandType style, String name) {
        this.style = style;
        this.name = name;
    }

    public void selectWarmUpBand(Set<Band> style, String name){
        //this.style = style;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Band{" +
                "style=" + style +
                ", name='" + name + '\'' +
                '}';
    }

    public BandType getStyle() {
        return style;
    }
}
