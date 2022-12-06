package exercises.complex.animalFarm2.src.main.java.com.AnimalFarm;

public class Cow extends Animal implements Mammals{

    public static final int NEW_BORN_WEIGHT = 35;

    public Cow(int id, int weight) {
        super(id, weight);
    }

    @Override
    public void makeNoise() {
        System.out.println("Muu!");
    }

    @Override
    public void giveBirth() {
        Animal animal = new Cow(1, NEW_BORN_WEIGHT);
        reduceWeight(animal);
    }

    @Override
    public void reduceWeight(Animal animal) {
        setWeight(getWeight() - animal.getWeight());
    }
}
