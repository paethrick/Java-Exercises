package exercises.complex.spaceFleet.src.main.java.com.starfleet;

public enum Cargo {
    FOOD(0),
    MEDICINE(0),
    WEAPONS(0);
    private int pieces;

    Cargo(int pieces) {
        this.pieces = pieces;
    }

    public int setPieces(int pieces) {
        this.pieces = pieces;
        return pieces;
    }
}
