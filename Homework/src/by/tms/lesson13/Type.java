package by.tms.lesson13;

public class Type {

    private boolean isPeripheral;
    private int energyConsumption;
    private boolean hasCooler;
    private String groupOfComponents;
    private String ports;

    public boolean isPeripheral() {
        return isPeripheral;
    }

    public void setPeripheral(boolean peripheral) {
        isPeripheral = peripheral;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public boolean isHasCooler() {
        return hasCooler;
    }

    public void setHasCooler(boolean hasCooler) {
        this.hasCooler = hasCooler;
    }

    public String getGroupOfComponents() {
        return groupOfComponents;
    }

    public void setGroupOfComponents(String groupOfComponents) {
        this.groupOfComponents = groupOfComponents;
    }

    public String getPorts() {
        return ports;
    }

    public void setPorts(String ports) {
        this.ports = ports;
    }
}
