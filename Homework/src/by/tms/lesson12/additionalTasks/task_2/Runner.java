package by.tms.lesson12.additionalTasks.task_2;

import java.io.*;

public class Runner {
    /*
    Текстовый файл содержит текст. После запуска программы в другой файл
    должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
    предложении присутствует слово-палиндром, то не имеет значения какое кол-во
    слов в предложении, оно попадает в новый файл.

    Пишем все в ООП стиле. Создаём класс TextFormater
    в котором два статических метода:
    1. Метод принимает строку и возвращает кол-во слов в строке.
    2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
    есть возвращает true, если нет false

    В main считываем файл.
    Разбиваем текст на предложения. Используя методы класса TextFormater
    определяем подходит ли нам предложение. Если подходит добавляем его в
    новый файл
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("src/by/tms/lesson12/additionalTasks/task_2/input.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("There is no such file!");
            reader.close();
            return;
        }

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("src/by/tms/lesson12/additionalTasks/task_2/output.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("There is no such file!");
            writer.close();
            return;
        }

        String line = reader.readLine(), text = "";
        while (line != null) {
            text += line;
            line = reader.readLine();
        }
        reader.close();

        String[] sentences = text.split("[.!?]");
        for (String sentence : sentences) {
            if ((TextFormater.countOfWords(sentence) >= 3 && TextFormater.countOfWords(sentence) <= 5)
                    || TextFormater.hasPalindrom(sentence)) {
                writer.write(sentence + "\n");
            }
        }
        writer.close();
    }
}
