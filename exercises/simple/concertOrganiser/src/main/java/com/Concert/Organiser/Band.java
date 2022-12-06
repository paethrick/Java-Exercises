package exercises.simple.concertOrganiser.src.main.java.com.Concert.Organiser;

public class Band {

    private String name;
    private BandType style;

    public Band(String name, BandType style) {
        this.name = name;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public BandType getStyle() {
        return style;
    }
}
