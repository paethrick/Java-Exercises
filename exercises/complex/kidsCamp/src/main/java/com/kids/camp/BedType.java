package exercises.complex.kidsCamp.src.main.java.com.kids.camp;

public enum BedType {
    TIDY(5),
    MID(3),
    DIRTY(0);

    private int tidyPoints;

    BedType(int tidyPoints) {
        this.tidyPoints = tidyPoints;
    }

    public int getTidyPoints() {
        return tidyPoints;
    }
}
