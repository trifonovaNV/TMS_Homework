package by.tms.Lesson_7.appliances;

public class HouseAppliances extends Appliances {

    private String type;

    public HouseAppliances(String type) {
        super("House appliances");
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