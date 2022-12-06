package exercises.simple.animalFarmSimple.src.main.java.com.animal.farm;

public class Goose extends Animal {

    private int eggs = 0;

    public Goose(int weight, int id, int eggs) {
        super(weight, id);
        this.eggs = eggs;
    }

    public void layEggs(){
        eggs++;
    }

    public String makeNoise(){
        return "Gaa gaa";
    }
}
