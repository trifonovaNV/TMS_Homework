package by.tms.Lesson_10.trainingManual;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_1 {
/*
    Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
    Удалить неудовлетворительные оценки из списка.
*/

    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<Integer>();
        for (int i = 0; i < 25; i++) {
            marks.add(new Random().nextInt(9) + 1);
            System.out.print(marks.get(i) + "\t");
        }
        System.out.println();

        for (int i = 0; i < marks.size(); ) {
            if (marks.get(i) < 4) {
                marks.remove(i);
            } else {
                i++;
            }
        }
        for (Integer mark : marks) {
            System.out.print(mark + "\t");
        }

    }
}
