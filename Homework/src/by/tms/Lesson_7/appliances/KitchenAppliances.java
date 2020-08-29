package by.tms.Lesson_7.appliances;

public class KitchenAppliances extends Appliances {

    private String type;

    public KitchenAppliances(String type) {
        super("Kitchen appliances");
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "type: " + type + ", ";
    }
}
