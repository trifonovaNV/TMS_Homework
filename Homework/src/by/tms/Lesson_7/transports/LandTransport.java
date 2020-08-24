package by.tms.Lesson_7.transports;

public abstract class LandTransport extends Transport {

    protected int countOfWheels;
    protected int fuelConsumption;

    public LandTransport(int power, int maxSpeed, int weight, String brand, int countOfWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.countOfWheels = countOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

}
