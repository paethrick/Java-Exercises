package exercises.complex.marsFarm.src.main.java.org.example;

public class Juniper extends Plant implements Growth{

    private static final int FOOD_PRODUCTION = 14;
    public static final int LEAVEBONUS = 8;
    public boolean say = false;

    public Juniper() {
        super(FOOD_PRODUCTION);
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
            this.setFoodProduction(this.foodProduction + LEAVEBONUS);
        }
    }

    public boolean isSay() {
        return say;
    }

    public void setSay(boolean say) {
        this.say = say;
    }

    @Override
    public void say() {
        if(!isSay() && this.getAge() < 69){
            System.out.println(this.getClass().toString() + " at full production!");
            setSay(true);
        }
    }

    public void age(){
        this.leavesBonus();
    }
}
