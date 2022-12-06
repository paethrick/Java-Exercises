package exercises.complex.animalFarm2.src.main.java.com.AnimalFarm;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Goose g1 = new Goose(1, 15);
        Goose g2 = new Goose(2, 15);
        Goose g3 = new Goose(3, 15);
        Goose g4 = new Goose(4, 15);
        Dog d1 = new Dog(5,60,DogBreed.HUSKY);
        Cat c1 = new Cat(6,40);
        Cow cow1 = new Cow(7,140);


        g3.layEgg();
        g3.layEgg();
        g3.layEgg();
        g3.layEgg();
        g3.layEgg();

        g2.layEgg();
        g2.layEgg();
        g2.layEgg();

        g1.layEgg();

        g4.layEgg();
        g4.layEgg();

        Farm farm = new Farm(Arrays.asList(g1,g2,g3,g4,d1,c1,cow1));
        System.out.println(farm.makeThemNoise());
        farm.makeThemNoise();
        System.out.println(farm.mostEggs().toString());
        d1.digHole();
        d1.digHole();
        d1.digHole();
        d1.digHole();
        d1.digHole();
        d1.digHole();
        System.out.println(d1.getWeight());
        d1.giveBirth();
        System.out.println(d1.getWeight());
    }
}
