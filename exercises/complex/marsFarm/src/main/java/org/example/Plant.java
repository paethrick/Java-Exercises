package exercises.complex.marsFarm.src.main.java.org.example;

public abstract class Plant {

    protected int foodProduction;
    private int age;

    public Plant(int foodProduction) {
        this.foodProduction = foodProduction;
    }

    public int getFoodProduction() {
        return foodProduction;
    }

    public void setFoodProduction(int foodProduction) {
        this.foodProduction = foodProduction;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract public void age();
}
