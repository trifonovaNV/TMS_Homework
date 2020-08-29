package by.tms.Lesson_7.clothes;

import by.tms.Lesson_7.clothes.jackets.Jacket;
import by.tms.Lesson_7.clothes.pants.Pants;
import by.tms.Lesson_7.clothes.shoes.Shoes;

public class Human {
    private String name;
    private Jacket jacket;
    private Pants pants;
    private Shoes shoes;

    public Human(String name, Jacket jacket, Pants pants, Shoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Human() {
    }

    public void getDressed() {
        System.out.println(name + ":");
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
        System.out.println();
    }

    public void unDressed() {
        System.out.println(name + ":");
        jacket.takeOff();
        pants.takeOff();
        shoes.takeOff();
        System.out.println();
    }
}
