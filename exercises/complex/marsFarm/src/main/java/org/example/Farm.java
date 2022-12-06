package exercises.complex.marsFarm.src.main.java.org.example;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private List<Plant> plants;

    public Farm(List<Plant> plants) {
        this.plants = new ArrayList<>(plants);
    }

    public int calculateProd(int months){
        int prod = 0;
        for(int i=0; i<months; i++){
            for(Plant plant : plants){
                plant.setFoodProduction(plant.getFoodProduction() + 4);
                if(plant instanceof Almond almond){
                    almond.doubleProduction();
                } else if (plant instanceof Growth growth) {
                    growth.say();
                }
                plant.age();
                agePlant(plant);
                prod += plant.getFoodProduction();

                //TODO: INSTANCE OF!
//                if (plant instanceof Spruce spruce) {
//                    spruce.age();
//
//                } else if (plant.getClass() == Almond.class) {
//                    ((Almond) plant).mushroomBonus();
//                    ((Almond) plant).rotDecrease();
//                    ((Almond) plant).doubleProduction();
//                } else if (plant.getClass() == Juniper.class) {
//                    ((Juniper) plant).leavesBonus();
//
//                }
//                agePlant(plant);
//                prod += plant.getFoodProduction();
            }
        }
        return prod;
    }


    public void agePlant(Plant plant){
        plant.setAge(plant.getAge() + 1);
    }
}
