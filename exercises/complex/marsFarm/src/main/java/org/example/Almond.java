package exercises.complex.marsFarm.src.main.java.org.example;

public class Almond extends Plant implements MushroomAndRot{

    private static final int FOOD_PRODUCTION = 50;
    public static final float MUSHROOM_CHANCE = 0.3f;
    public static final float ROT_CHANCE = 0.2f;
    public static final int MUSHROOMBONUS = 10;
    public static final int ROTDECREASE = 18;

    public Almond() {
        super(FOOD_PRODUCTION);
    }


    @Override
    public void mushroomBonus() {
        //TODO: no magical numb
        if(chance < MUSHROOM_CHANCE){
            this.setFoodProduction(this.foodProduction + MUSHROOMBONUS);
        }
    }

    @Override
    public void rotDecrease() {
        if(chance < ROT_CHANCE){
            this.setFoodProduction(this.foodProduction - ROTDECREASE);
        }
    }

    public void doubleProduction(){
        if(this.getFoodProduction() < 40){
            this.setFoodProduction(this.foodProduction * 2);
        }
    }

    public void age(){
        this.mushroomBonus();
        this.rotDecrease();
    }
}
