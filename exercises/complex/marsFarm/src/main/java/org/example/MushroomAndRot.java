package exercises.complex.marsFarm.src.main.java.org.example;

import java.util.Random;

public interface MushroomAndRot {

    Random rand = new Random();
    float chance = rand.nextFloat();

     void mushroomBonus();
     void rotDecrease();
}
