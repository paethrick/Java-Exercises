package exercises.complex.animalFarm2.src.main.java.com.AnimalFarm;

public class Dog extends Animal implements Mammals{

    public static final int HOLE_LIMIT = 5;
    public static final int NEW_BORN_WEIGHT = 15;
    private int hole;
    private final DogBreed breed;

    public Dog(int id, int weight, DogBreed breed) {
        super(id, weight);
        this.breed = breed;

    }

    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }

    public void digHole(){
        if(holeChecker()){
            hole++;
        } else {
            System.out.println("Too many holes");
        }
    }

    public boolean holeChecker(){
        return hole < HOLE_LIMIT;
    }

    public DogBreed getBreed() {
        return breed;
    }

    @Override
    public void giveBirth() {
        Animal animal = new Dog(getId()+100, NEW_BORN_WEIGHT,getBreed());
        reduceWeight(animal);
    }

    @Override
    public void reduceWeight(Animal animal) {
        setWeight(getWeight() - animal.getWeight());
    }
}
