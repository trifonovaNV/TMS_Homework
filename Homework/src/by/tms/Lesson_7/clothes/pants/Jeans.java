package by.tms.Lesson_7.clothes.pants;

public class Jeans implements Pants {
    public Jeans() {

    }

    @Override
    public void putOn() {
        System.out.println("Надел джинсы.");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял джинсы.");
    }
}
