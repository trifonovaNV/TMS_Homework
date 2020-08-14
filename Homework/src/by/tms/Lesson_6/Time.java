package by.tms.Lesson_6;

import java.util.ArrayList;

/*
Создать класс и объекты описывающие промежуток времени. Сам промежуток в классе должен задаваться тремя
свойствами: секундами, минутами, часами. Сделать методы для получения полного количества секунд в объекте,
сравнения двух объектов (метод должен работать аналогично compareTo в строках). Создать два конструктора:
получающий общее количество секунд, и часы, минуты и секунды по отдельности. Сделать метод для вывода данных.
 */

public class Time {

    private int seconds;
    private int minutes;
    private int hours;

    public Time(int seconds) {
        this.hours = seconds / 3600;
        seconds %= 3600;
        this.minutes = seconds / 60;
        seconds %= 60;
        this.seconds = seconds;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getAllSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public int compareTo(Time otherObject) {
        if (this.getAllSeconds() > otherObject.getAllSeconds()) {
            return 1;
        } else if (this.getAllSeconds() < otherObject.getAllSeconds()) {
            return -1;
        } else {
            return 0;
        }
    }

    public void printTime() {
        System.out.println("Hours: " + this.hours + ", minutes: " + this.minutes + ", seconds: " + this.seconds);
    }

    public static void main(String[] args) {
        Time first = new Time(5000);
        Time second = new Time(3, 10, 5);
        Time third = new Time(3, 10, 2);
        Time fourth = second;

        ArrayList<Time> array = new ArrayList<>();
        array.add(first);
        array.add(second);
        array.add(third);
        array.add(fourth);

        for (Time i : array) {
            i.printTime();
        }
        System.out.println();

        System.out.println("The first is bigger than the second: " + first.compareTo(second));
        System.out.println("The second is bigger than the third: " + second.compareTo(third));
        System.out.println("The second is equal to the fourth: " + second.compareTo(fourth));

    }

}
