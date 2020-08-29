package by.tms.Lesson_7.space;

import java.util.Random;

public class SpaceX implements IStart {
    public SpaceX() {

    }

    @Override
    public boolean checkingSystem() {
        return new Random().nextInt(20) > 5;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX");
    }
}
