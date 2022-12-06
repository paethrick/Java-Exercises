package exercises.simple.intCenter.src.main.java.com.IntCenter;

public enum Experience {

    //TODO: 2 enum
    BEGINNER(50000,0.4),
    MEDIUM(35000,0.3),
    EXPERT(25000,0.2);

    private float cost;

    private double percent;

    Experience(float cost, double percent) {
        this.cost = cost;
        this.percent = percent;
    }

    public float getCost() {
        return cost;
    }

    public double getPercent() {
        return percent;
    }
}
