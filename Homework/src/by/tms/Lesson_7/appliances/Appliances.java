package by.tms.Lesson_7.appliances;

public class Appliances {

    private String mission;
    private boolean isOn;

    public Appliances(String mission) {
        this.mission = mission;
        this.isOn = false;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
    }

    @Override
    public String toString() {
        return "Mission: " + mission +
                ", is on: " + (isOn ? "yes" : "no") + ", ";
    }
}
