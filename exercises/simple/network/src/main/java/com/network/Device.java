package exercises.simple.network.src.main.java.com.network;

public abstract class Device {

    private int age;
    private int power;

    public Device(int age, int power) {
        this.age = age;
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Device{" +
                "age=" + age +
                ", power=" + power +
                '}';
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    abstract void losePower(Network network);
}
