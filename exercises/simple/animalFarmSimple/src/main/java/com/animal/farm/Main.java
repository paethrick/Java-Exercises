package exercises.simple.animalFarmSimple.src.main.java.com.animal.farm;

public class Main {
    public static void main(String[] args) {
        AnimalFarm animalFarm = new AnimalFarm();
        Dog fDog = new Dog(50000,1,0, DogBreed.RETRIEVER);
        Cat fCat = new Cat(10000,2);
        Cow fCow = new Cow(200000,3);
        Dog sDog = new Dog(45000,4,2, DogBreed.HUSKY);
        fDog.digHole();
        fDog.digHole();
        fDog.digHole();
        fDog.makeNoise();
        fDog.giveBirt();
        System.out.println(fDog);
        animalFarm.addAnimals(fDog.giveBirt());
        animalFarm.addAnimals(fCat.giveBirt());
        animalFarm.addAnimals(fCow.giveBirt());
        animalFarm.addAnimals(fCow.giveBirt());
        animalFarm.addAnimals(sDog.giveBirt());
        System.out.println(animalFarm);
    }
}
