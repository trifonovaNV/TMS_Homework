package by.tms.Lesson_7.space;

import java.util.Random;

public class SpaceShip implements IStart {
    public SpaceShip() {

    }

    @Override
    public boolean checkingSystem() {
        return new Random().nextInt(70) > 50;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели SpaceShip запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceShip");
    }
}
