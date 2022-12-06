package exercises.complex.animalFarm2.src.main.java.com.AnimalFarm;

public class Goose extends Animal{

    private int egg;

    public Goose(int id, int weight) {
        super(id, weight);
    }

    public int getEgg() {
        return egg;
    }


    @Override
    public void makeNoise() {
        System.out.println("Háp!");
    }

    public void layEgg(){
        egg++;
    }

}
