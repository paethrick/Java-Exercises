package exercises.simple.animalFarmSimple.src.main.java.com.animal.farm;

public class Cow extends Mammal {

    public Cow(int weight, int id) {
        super(weight, id);
    }

    public String giveNoise(){
        return "Moo moo";
    }

    public Mammal giveBirt() {
        int weight = this.getWeight() - 20000;
        this.weight = weight;
        return new Cow(20000,this.getId()+10);
    }
}
