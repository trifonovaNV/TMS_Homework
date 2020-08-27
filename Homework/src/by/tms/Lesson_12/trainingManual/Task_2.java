package by.tms.Lesson_12.trainingManual;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2 {
    /*
    Имеется файл с текстом, в котором присутствуют числа. Найти все числа, распечатать, посчитать сумму,
     убрать все повторяющиеся числа и снова распечатать.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/Users/trifonovanv/Desktop/TeachMeSkills/TMS_Homework/Homework/src/by/tms/Lesson_12/trainingManual/input.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Threr is no such file.");
            return;
        }

        List<Integer> numbers = new ArrayList<Integer>();

        String line = reader.readLine();
        while (line != null) {
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                numbers.add(Integer.parseInt(line.substring(matcher.start(), matcher.end())));
            }
            line = reader.readLine();
        }
        reader.close();

        int sum = 0;
        System.out.println("All numbers: ");
        for (Integer number : numbers) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();

        System.out.println("\nSum of all numbers = " + sum);

        for (int i = 0; i < numbers.size(); i++) {
            while (numbers.lastIndexOf(numbers.get(i)) != i) {
                numbers.remove(i);
            }
        }
        System.out.println();

        System.out.println("Numbers without doubling: ");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
