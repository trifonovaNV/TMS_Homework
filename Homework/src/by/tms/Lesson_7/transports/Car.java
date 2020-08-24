package by.tms.Lesson_7.transports;

public class Car extends LandTransport {

    private String bodyType;
    private int countOfPassengers;

    public Car(int power, int maxSpeed, int weight, String brand, int countOfWheels, int fuelConsumption,
               String bodyType, int countOfPassengers) {
        super(power, maxSpeed, weight, brand, countOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.countOfPassengers = countOfPassengers;
    }

    public void countMaxParameters(double time) {
        double maxWay = maxSpeed * time;
        double fuel = litersOfFuel(maxWay);
        System.out.println("For " + time + " hours the car " + brand + " with the max speed " + maxSpeed +
                " km/h will pass " + maxWay + " km and will use up " + fuel + " liters of fuel.");
    }

    private double litersOfFuel(double way) {
        return fuelConsumption * way / 100;
    }

    @Override
    public String toString() {
        return "Car - " +
                " body type: " + bodyType +
                ", count of passengers: " + countOfPassengers +
                ", count of wheels: " + countOfWheels +
                ", fuel consumption: " + fuelConsumption + " l" +
                ", power: " + power + " hp" +
                ", max speed: " + maxSpeed + " km/h" +
                ", weight: " + weight + " kg" +
                ", brand: " + brand +
                ", power in kilowatts: " + this.powerInKW() + " kw.";
    }
}
