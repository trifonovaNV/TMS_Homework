package by.tms.Lesson_7.transports;

public abstract class Transport {

    protected int power;
    protected int maxSpeed;
    protected int weight;
    protected String brand;

    public Transport(int power, int maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public double powerInKW() {
        return this.power * 0.74;
    }
}
