package exercises.simple.animalFarmSimple.src.main.java.com.animal.farm;

public class Cat extends Mammal {

    public Cat(int weight, int id) {
        super(weight, id);
    }

    public String makeNoise(){
        return "Meow meow";
    }

    public Mammal giveBirt() {
        int weight = this.getWeight() - 1500;
        this.weight = weight;
        return new Cat(1500,this.getId()+10);
    }
}
