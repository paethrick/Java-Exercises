package exercises.simple.animalFarmSimple.src.main.java.com.animal.farm;

public class Dog extends Mammal {

    private int holes;

    private DogBreed dogBreed;

    public Dog(int weight, int id, int holes, DogBreed dogBreed) {
        super(weight, id);
        this.holes = holes;
        this.dogBreed = dogBreed;
    }

    public String makeNoise(){
        return "Woof woof";
    }

    @Override
    public Mammal giveBirt() {
        int weight = this.getWeight() - 2000;
        this.weight = weight;
        return new Dog(2000,this.getId()+10,0,this.dogBreed);
    }

    public String digHole(){
        if(holes<10){
            holes++;
        } else {
            return "The dog cannot dig more holes!";
        }
        return null;
    }



}
