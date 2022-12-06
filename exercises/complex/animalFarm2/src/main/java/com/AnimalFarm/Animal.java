package exercises.complex.animalFarm2.src.main.java.com.AnimalFarm;

public abstract class Animal {

    private final int id;
    private int weight;

    public Animal(int id, int weight) {
        this.id = id;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", weight=" + weight +
                '}';
    }

    public abstract void makeNoise();
}
