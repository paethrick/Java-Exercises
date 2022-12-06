package exercises.simple.animalFarmSimple.src.main.java.com.animal.farm;

public abstract class Mammal extends Animal{

    public Mammal(int weight, int id) {
        super(weight, id);
    }

    @Override
    public String makeNoise() {
        return null;
    }

    public abstract Mammal giveBirt();


}
