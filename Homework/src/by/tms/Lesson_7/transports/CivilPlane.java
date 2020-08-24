package by.tms.Lesson_7.transports;

public class CivilPlane extends AirTransport {

    private int countOfPassengers;
    private boolean haveBusinessClass;

    public CivilPlane(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunway, int countOfPassengers,
                      boolean haveBusinessClass) {
        super(power, maxSpeed, weight, brand, wingspan, minRunway);
        this.countOfPassengers = countOfPassengers;
        this.haveBusinessClass = haveBusinessClass;
    }

    public void fillCivil(int passengers) {
        if (passengers <= countOfPassengers) {
            System.out.println("The plane is full.");
        } else {
            System.out.println("You need a bigger plane.");
        }
    }

    @Override
    public String toString() {
        return "Civil - " +
                " have business class: " + (haveBusinessClass ? "yes" : "no") +
                ", count of passengers:" + countOfPassengers +
                ", min runway: " + minRunway + " m" +
                ", wingspan: " + wingspan + " m" +
                ", power: " + power + " hp" +
                ", max speed: " + maxSpeed + " km/h" +
                ", weight: " + weight + " kg" +
                ", brand: " + brand +
                ", power in kilowatts: " + this.powerInKW() + " kw.";
    }
}
