package by.tms.lesson12.trainingManual;

import java.io.*;
import java.util.Random;

public class Task_3 {
    /*
    Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл, распечатать числа и их среднее арифметическое.
     */
    public static void main(String[] args) throws IOException {

        try (DataOutputStream writer = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/by/tms/lesson12/" +
                "trainingManual/output.dat")))) {
            for (int i = 0; i < 20; i++) {
                writer.writeInt(new Random().nextInt(100));
            }
        } catch (FileNotFoundException e) {
            System.err.println("There is no such file!");
            return;
        }

        try (DataInputStream reader = new DataInputStream(new BufferedInputStream(new FileInputStream("src/by/tms/lesson12/" +
                "trainingManual/output.dat")))) {
            System.out.println("All numbers: ");
            int number = reader.readInt();
            double average = 0.0;
            while (true) {
                System.out.print(number + " ");
                average += number;
                try {
                    number = reader.readInt();
                } catch (EOFException e) {
                    break;
                }
            }
            System.out.println();
            average /= 20;
            System.out.println("Average: " + average);
        } catch (FileNotFoundException e) {
            System.err.println("There is no such file!");
        }
    }
}
