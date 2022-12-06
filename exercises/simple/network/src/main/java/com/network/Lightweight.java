package exercises.simple.network.src.main.java.com.network;

import java.util.ArrayList;
import java.util.List;

public class Lightweight extends Device{

    public static final int LOSTPOWER = 7;

    public Lightweight(int age, int power) {
        super(age, power);
    }



    @Override
    public void losePower(Network network) {
        this.setPower(this.getPower() - LOSTPOWER * this.getAge());
        int otherDev = this.getLWDevices(network).size();
        this.setPower(otherDev * 20);
        this.setAge(this.getAge() + 1);

    }

    public List<Lightweight> getLWDevices(Network network) {
        List<Lightweight> lightweights = new ArrayList<>();
        for (Device device : network.getAllDevices()) {
            if (device instanceof Lightweight light) {
                lightweights.add(light);
            }
        }
        return lightweights;
    }
}
