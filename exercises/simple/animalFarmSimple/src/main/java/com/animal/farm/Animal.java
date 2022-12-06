package exercises.simple.animalFarmSimple.src.main.java.com.animal.farm;

public abstract class Animal {

    protected int weight;
    private int id;

    public Animal(int weight, int id) {
        this.weight = weight;
        this.id = id;
    }

    public abstract String makeNoise();

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", id=" + id +
                '}';
    }
}
