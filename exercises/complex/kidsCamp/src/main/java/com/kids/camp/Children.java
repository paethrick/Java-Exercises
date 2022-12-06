package exercises.complex.kidsCamp.src.main.java.com.kids.camp;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Children extends Person{

    private BedType bedType;
    Random rand = new Random();

    public Children() {
        this.bedType = randomBedType();
    }

    public BedType getBedType() {
        return bedType;
    }

    public BedType randomBedType(){
        int randint = rand.nextInt(3);
        BedType one = BedType.TIDY;
        BedType two =BedType.MID;
        BedType three =BedType.DIRTY;
        List<BedType> bedTypes = Arrays.asList(one,two,three);
        return bedTypes.get(randint);
    }

    @Override
    public String toString() {
        return "Children{" +
                "bedType=" + bedType +
                '}'+ "\n";
    }
}
