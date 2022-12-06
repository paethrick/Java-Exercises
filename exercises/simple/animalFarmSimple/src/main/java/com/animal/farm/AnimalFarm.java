package exercises.simple.animalFarmSimple.src.main.java.com.animal.farm;

import java.util.ArrayList;
import java.util.List;

public class AnimalFarm {

    List<Animal> animals;

    public AnimalFarm() {
        animals = new ArrayList<>();
    }

    public void addAnimals(Animal animal){
        animals.add(animal);
    }

    @Override
    public String toString() {
        return "AnimalFarm{" +
                "animals=" + animals +
                '}';
    }
}
