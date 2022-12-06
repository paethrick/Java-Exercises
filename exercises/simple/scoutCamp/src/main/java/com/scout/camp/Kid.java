package exercises.simple.scoutCamp.src.main.java.com.scout.camp;

public class Kid {

    private Gender gender;
    private int rope = 400;

    public Kid(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public int getRope() {
        return rope;
    }
}
