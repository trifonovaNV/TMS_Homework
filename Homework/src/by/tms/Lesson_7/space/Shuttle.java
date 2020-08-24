package by.tms.Lesson_7.space;

import java.util.Random;

public class Shuttle implements IStart {
    public Shuttle() {

    }

    @Override
    public boolean checkingSystem() {
        return new Random().nextInt(10) > 3;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
