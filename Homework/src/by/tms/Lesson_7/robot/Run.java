package by.tms.Lesson_7.robot;

import by.tms.Lesson_7.robot.hands.SamsungHand;
import by.tms.Lesson_7.robot.hands.SonyHand;
import by.tms.Lesson_7.robot.hands.ToshibaHand;
import by.tms.Lesson_7.robot.heads.SamsungHead;
import by.tms.Lesson_7.robot.heads.SonyHead;
import by.tms.Lesson_7.robot.heads.ToshibaHead;
import by.tms.Lesson_7.robot.legs.SamsungLeg;
import by.tms.Lesson_7.robot.legs.SonyLeg;
import by.tms.Lesson_7.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        Robot first = new Robot(new SamsungHead(1500), new SonyHand(600), new ToshibaLeg(800));
        Robot second = new Robot(new SonyHead(8000), new ToshibaHand(400), new SonyLeg(600));
        Robot third = new Robot(new ToshibaHead(1000), new SamsungHand(900), new SamsungLeg(1800));

        first.action();
        second.action();
        third.action();

        if (first.getPrice() > second.getPrice()) {
            System.out.println(first.getPrice() > third.getPrice() ? "Первый робот самый дорогой." : "Третий робот самый дорогой.");
        } else {
            System.out.println(second.getPrice() > third.getPrice() ? "Второй робот самый дорогой." : "Третий робот самый дорогой.");
        }
    }
}
