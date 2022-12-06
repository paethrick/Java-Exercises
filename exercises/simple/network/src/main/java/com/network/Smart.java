package exercises.simple.network.src.main.java.com.network;

public class Smart extends Device{

    public static final int LOSTPOWER = 15;
    private String name;
    private ScreenSize screenSize;

    public Smart(int age, int power, String name, ScreenSize screenSize) {
        super(age, power);
        this.name = name;
        this.screenSize = screenSize;
    }

    public ScreenSize getScreenSize() {
        return screenSize;
    }

    @Override
    public void losePower(Network network) {
        this.setPower(this.getPower() - LOSTPOWER * this.getAge());
        this.setPower(this.getPower() - this.getScreenSize().getScreenPower());
        this.setAge(this.getAge() + 1);
    }

}
