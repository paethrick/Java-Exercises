package exercises.simple.network.src.main.java.com.network;

public class Normal extends Device{

    public static final int LOSTPOWER = 3;
    private int manufacturedYear;
    private ScreenSize screenSize;

    public Normal(int age, int power,int manufacturedYear, ScreenSize screenSize) {
        super(age, power);
        this.manufacturedYear = manufacturedYear;
        this.screenSize = screenSize;

    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }


    @Override
    public void losePower(Network network) {
        float power = this.getPower() - LOSTPOWER * this.getAge();
        if(this.getManufacturedYear() > 2000){
            power = power * 2;
        } else {
            power = power / 2;
        }
        this.setPower(((int)power));
        this.setAge(this.getAge() + 1);
    }
}
