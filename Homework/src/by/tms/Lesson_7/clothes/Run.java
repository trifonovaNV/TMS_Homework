package by.tms.Lesson_7.clothes;

import by.tms.Lesson_7.clothes.jackets.BlueJacket;
import by.tms.Lesson_7.clothes.jackets.RedJacket;
import by.tms.Lesson_7.clothes.pants.Jeans;
import by.tms.Lesson_7.clothes.pants.Trousers;
import by.tms.Lesson_7.clothes.shoes.Boots;
import by.tms.Lesson_7.clothes.shoes.Sneakers;

public class Run {
/*
    Интерфейсы:
    - Куртка
    - Штаны
    - Обувь
    в каждом интерфейсе есть 2 метода (надеть и снять)
    Делаем несколько реализации каждого интерфейса.
    Создаём класс человек:
    У человека поля:
    -имя
    -куртка
    -штаны
    -обувь
    У человека есть 2 метода:
    - одеться(вызываются методы надеть у всех вещей)
    - раздеться (вызываются методы снять у всех вещей)
 */

    public static void main(String[] args) {
        Human first = new Human("Ivan", new BlueJacket(), new Jeans(), new Sneakers());
        Human second = new Human("Mark", new RedJacket(), new Trousers(), new Boots());
        Human third = new Human("Mike", new RedJacket(), new Jeans(), new Boots());

        first.getDressed();
        second.getDressed();
        third.getDressed();

        first.unDressed();
        second.unDressed();
        third.unDressed();
    }
}
