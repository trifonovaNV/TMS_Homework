package by.tms.Lesson_7.clothes.shoes;

public class Sneakers implements Shoes {
    public Sneakers() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел кроссовки.");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял кроссовки.");
    }
}
