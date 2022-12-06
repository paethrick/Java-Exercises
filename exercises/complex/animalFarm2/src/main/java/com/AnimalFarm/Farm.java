package exercises.complex.animalFarm2.src.main.java.com.AnimalFarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private List<Animal> animals;

    public Farm(List<Animal> animals) {
        this.animals = new ArrayList<>(animals);
    }

    public Goose mostEggs(){
        Goose goosie = new Goose(1,1);
        int mostEggs = 0;
        for(Animal animal : animals){
            if(animal instanceof Goose goose){
                int egg = 0;
                egg += goose.getEgg();
                if(egg>mostEggs){
                    mostEggs = egg;
                    goosie = goose;
                }
            }
        }
        return goosie;
    }

    public boolean makeThemNoise(){
        for(Animal animal : animals){
            animal.makeNoise();
        }
        return false;
    }
}
