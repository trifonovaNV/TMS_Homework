package by.tms.lesson12.additionalTasks.task_4;

import java.io.Serializable;

public class Car implements Serializable {

    private String brand;
    private int speed;
    private int cost;

    public Car(String brand, int speed, int cost) {
        this.brand = brand;
        this.speed = speed;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "brand: " + brand + ", speed: " + speed + ", cost: " + cost + ".";
    }
}
