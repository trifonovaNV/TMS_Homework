package by.tms.lesson12.additionalTasks.task_1;

import java.io.*;

public class Task_1 {
    /*
    1)В исходном файле находятся слова, каждое слово на новой стороке. После
    запуска программы должен создать файл, который будет содержать в себе
    только полиндромы
     */
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/by/tms/lesson12/additionalTasks/task_1/input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src/by/tms/lesson12/additionalTasks/task_1/output.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                StringBuffer buffer = new StringBuffer(line);
                buffer.reverse();
                String newLine = buffer.toString();
                if (line.equals(newLine)) {
                    writer.write(line + "\n");
                }
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("There is no such file!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
