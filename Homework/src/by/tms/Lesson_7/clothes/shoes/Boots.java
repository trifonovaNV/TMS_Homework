package by.tms.Lesson_7.clothes.shoes;

public class Boots implements Shoes {
    public Boots() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел ботинки.");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял ботинки.");
    }
}
