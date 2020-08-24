package by.tms.Lesson_7.transports;

public class MilitaryPlane extends AirTransport {

    private boolean haveBailoutSystem;
    private int countOfRockets;

    public MilitaryPlane(int power, int maxSpeed, int weight, String brand, int wingspan, int minRunway, boolean haveBailoutSystem,
                         int countOfRockets) {
        super(power, maxSpeed, weight, brand, wingspan, minRunway);
        this.haveBailoutSystem = haveBailoutSystem;
        this.countOfRockets = countOfRockets;
    }

    public void shot() {
        if (countOfRockets != 0) {
            countOfRockets--;
            System.out.println("The rocket launched.");
        } else {
            System.out.println("No ammunition");
        }
    }

    public void bailout() {
        if (haveBailoutSystem) {
            System.out.println("The bailout was successful");
        } else {
            System.out.println("You don't have such a system.");
        }

    }

    @Override
    public String toString() {
        return "Military - " +
                " have bailout system: " + (haveBailoutSystem ? "yes" : "no") +
                ", count of rockets: " + countOfRockets +
                ", min runway: " + minRunway + " m" +
                ", wingspan: " + wingspan + " m" +
                ", power: " + power + " hp" +
                ", max speed: " + maxSpeed + " km/h" +
                ", weight: " + weight + " kg" +
                ", brand: " + brand +
                ", power in kilowatts: " + this.powerInKW() + " kw.";
    }
}
