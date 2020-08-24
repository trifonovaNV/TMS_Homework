package by.tms.Lesson_7.appliances;

public final class Kettle extends KitchenAppliances {

    private String brand;

    public Kettle(String brand) {
        super("Kettle");
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Mission: " + this.getMission() + ", type: " + this.getType() + ", brand: " + this.getBrand() +
                ", is on: " + (this.getIsOn() ? "yes" : "no") + ".";
    }
}
