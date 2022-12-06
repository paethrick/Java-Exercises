package exercises.complex.marsFarm.src.main.java.org.example;

public class Spruce extends Plant implements MushroomAndRot,Growth{

    public static final float MUSHROOM_CHANCE = 0.30f;
    public static final float ROT_CHANCE = 0.40f;
    public static final int MUSHROOMBONUS = 15;
    public static final int ROTDECREASE = 20;
    public static final int LEAVEBONUS = 8;
    private static final int FOODPRODUCTION = 26;
    private boolean say = false;


    public Spruce() {
        super(FOODPRODUCTION);
    }

    public int getFoodProduction() {
        return foodProduction;
    }

    public void setFoodProduction(int foodProduction) {
        this.foodProduction = foodProduction;
    }

    @Override
    public void leavesBonus() {
        if(this.getAge() % 5 == 0){
            this.setFoodProduction(this.getFoodProduction() + LEAVEBONUS);
        }
    }

    @Override
    public void say() {
        if(!isSay() && this.getAge() < 69){
            System.out.println(this.getClass().toString() + " at full production!");
            setSay(true);
        }
    }

    public boolean isSay() {
        return say;
    }

    public void setSay(boolean say) {
        this.say = say;
    }

    @Override
    public void mushroomBonus() {
        if(chance < MUSHROOM_CHANCE){
            this.setFoodProduction(this.getFoodProduction() + MUSHROOMBONUS);
        }
    }

    public void age() {
        this.leavesBonus();
        this.mushroomBonus();
        this.rotDecrease();
    }

    @Override
    public void rotDecrease() {
        if(chance < ROT_CHANCE){
            this.setFoodProduction(this.getFoodProduction() - ROTDECREASE);
        }
    }
}
