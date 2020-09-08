package by.tms.lesson12.trainingManual;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_1 {
    /*
    Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("src/by/tms/lesson12/trainingManual/input.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("There is no such file.");
            reader.close();
            return;
        }

        int countOfWords = 0, countOfPunctuation = 0;
        String line = reader.readLine();
        while (line != null) {
            Pattern pattern = Pattern.compile("[,.!?:;-]");
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                countOfPunctuation++;
            }

            pattern = Pattern.compile("\\b[A-Za-z']+\\b");
            matcher = pattern.matcher(line);
            while (matcher.find()) {
                countOfWords++;
            }
            line = reader.readLine();
        }
        reader.close();

        System.out.println("Count of words: " + countOfWords);
        System.out.println("Count of punctuation marks: " + countOfPunctuation);
    }
}
