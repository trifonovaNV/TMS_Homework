package by.tms.Lesson_7.appliances;

public final class Blender extends KitchenAppliances {

    private String brand;

    public Blender(String brand) {
        super("Blender");
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Mission: " + this.getMission() + ", type: " + this.getType() + ", brand: " + this.getBrand() +
                ", is on: " + (this.getIsOn() ? "yes" : "no") + ".";
    }
}
