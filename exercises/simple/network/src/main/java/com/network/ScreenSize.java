package exercises.simple.network.src.main.java.com.network;

public enum ScreenSize {
    EDTV(5),
    HD(10),
    FULLHD(15),
    UHD(20);
    private int power;

    ScreenSize(int power) {
        this.power = power;
    }

    public int getScreenPower() {
        return power;
    }
}
