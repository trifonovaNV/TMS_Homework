package by.tms.Lesson_7.appliances;

public final class Washer extends HouseAppliances {

    private String brand;

    public Washer(String brand) {
        super("Washer");
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
        return super.toString() + "brand: " + brand + ".";
    }
}
