package exercises.simple.scoutCamp.src.main.java.com.scout.camp;

public enum Gender {
    GIRLS(55,85,75),
    BOYS(65,75,70);

    private int gatheringChance;
    private int buildChance;
    private int fireChance;

    Gender(int gatheringChance, int buildChance, int fireChance) {
        this.gatheringChance = gatheringChance;
        this.buildChance = buildChance;
        this.fireChance = fireChance;
    }

    public int getGatheringChance() {
        return gatheringChance;
    }

    public int getBuildChance() {
        return buildChance;
    }

    public int getFireChance() {
        return fireChance;
    }
}
