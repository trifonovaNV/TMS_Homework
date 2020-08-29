package by.tms.Lesson_7.clothes.pants;

public class Trousers implements Pants {
    public Trousers() {

    }

    @Override
    public void putOn() {
        System.out.println("Надел брюки.");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял брюки.");
    }
}
