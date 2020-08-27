package by.tms.Lesson_12.additionalTasks.task_1;

import java.io.*;

public class Task_1 {
    /*
    1)В исходном файле находятся слова, каждое слово на новой стороке. После
    запуска программы должен создать файл, который будет содержать в себе
    только полиндромы
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/Users/trifonovanv/Desktop/TeachMeSkills/" +
                    "TMS_Homework/Homework/src/by/tms/Lesson_12/additionalTasks/task_1/input.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("There is no such file!");
            return;
        }

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("/Users/trifonovanv/Desktop/TeachMeSkills/" +
                    "TMS_Homework/Homework/src/by/tms/Lesson_12/additionalTasks/task_1/output.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("There is no such file!");
            return;
        }

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
        reader.close();
        writer.close();

    }
}
