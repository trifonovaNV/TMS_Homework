package by.tms.Lesson_7.clothes.jackets;

public class BlueJacket implements Jacket {
    public BlueJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел синюю куртку.");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял синюю куртку.");
    }
}
