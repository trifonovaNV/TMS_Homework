package by.tms.Lesson_7.clothes.jackets;

public class RedJacket implements Jacket {
    public RedJacket() {
    }

    @Override
    public void putOn() {
        System.out.println("Надел красную куртку.");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял красную куртку.");
    }
}
