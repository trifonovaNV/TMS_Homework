package by.tms.Lesson_10.trainingManual;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task_2 {
/*
    Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся числа.
*/

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 30; i++) {
            numbers.add(new Random().nextInt(14) + 1);
            System.out.print(numbers.get(i) + "\t");
        }
        System.out.println();

        for (int i = 0; i < numbers.size(); i++) {
            int index = numbers.lastIndexOf(numbers.get(i));
            while (index != i) {
                numbers.remove(index);
                index = numbers.lastIndexOf(numbers.get(i));
            }
        }

        for (Integer number : numbers) {
            System.out.print(number + "\t");
        }
    }
}
