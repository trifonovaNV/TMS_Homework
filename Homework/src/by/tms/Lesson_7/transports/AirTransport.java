package by.tms.Lesson_7.transports;

public abstract class AirTransport extends Transport {

    protected int wingspan;
    protected int minRunway;

    public AirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunway) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunway = minRunway;
    }
}
