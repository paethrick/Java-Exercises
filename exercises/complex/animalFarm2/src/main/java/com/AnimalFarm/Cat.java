package exercises.complex.animalFarm2.src.main.java.com.AnimalFarm;

public class Cat extends Animal implements Mammals{

    public static final int NEW_BORN_WEIGHT = 5;

    public Cat(int id, int weight) {
        super(id, weight);
    }

    @Override
    public void makeNoise() {
        System.out.println("Miau!");
    }


    @Override
    public void giveBirth() {
        Animal animal = new Cat(1, NEW_BORN_WEIGHT);
        reduceWeight(animal);
    }

    @Override
    public void reduceWeight(Animal animal) {
        setWeight(getWeight() - animal.getWeight());
    }
}
