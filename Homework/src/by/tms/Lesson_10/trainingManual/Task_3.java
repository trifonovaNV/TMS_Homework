package by.tms.Lesson_10.trainingManual;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_3 {
    /*
        Создать список оценок учеников с помощью ArryList, заполнить случайными оценками.
        Найти самую высокую оценку с использованием итератора.
    */
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            marks.add(new Random().nextInt(9) + 1);
            System.out.print(marks.get(i) + "\t");
        }
        System.out.println();

        int maxMark = 0;
        for (Integer mark : marks) {
            if (mark > maxMark) {
                maxMark = mark;
            }
        }
        System.out.println("Max mark is " + maxMark + ".");
    }
}
