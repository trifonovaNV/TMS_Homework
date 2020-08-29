package by.tms.Lesson_7.transports;

public class Truck extends LandTransport {

    private int payload;

    public Truck(int power, int maxSpeed, int weight, String brand, int countOfWheels, int fuelConsumption, int payload) {
        super(power, maxSpeed, weight, brand, countOfWheels, fuelConsumption);
        this.payload = payload;
    }

    public void fillTruck(int weight) {
        if (weight <= payload) {
            System.out.println("Truck is full.");
        } else {
            System.out.println("You need a bigger truck.");
        }
    }

    @Override
    public String toString() {
        return "Truck - " +
                " payload: " + payload + " t" +
                ", count of wheels: " + countOfWheels +
                ", fuel consumption: " + fuelConsumption + " l" +
                ", power: " + power + " hp" +
                ", max speed: " + maxSpeed + " km/h" +
                ", weight: " + weight + " kg" +
                ", brand: " + brand +
                ", power in kilowatts: " + this.powerInKW() + " kw.";
    }
}
