package by.tms.lesson12.additionalTasks.task_3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    /*
    3) Проверка на цензуру:
    Создаете 2 файла.
    1 - й. Содержит исходный текст.
    2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
    определите сами, хотите каждое слово на новой строке, хотите через запятую
    разделяйте, ваша программа делайте как считаете нужным.
    Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
    встретилось ни одного недопустимого слова, то выводите сообщение о том что
    текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
    сообщение, кол-во предложений не прошедших проверку и сами предложения
    подлежащие исправлению.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("src/by/tms/lesson12/additionalTasks/task_3/input.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("There is no such file!");
            reader.close();
            return;
        }

        String[] sentences = getSentences(reader);
        reader.close();
        if (sentences == null) {
            System.err.println("There is no text file!");
            return;
        }

        BufferedReader blackListReader = null;
        try {
            blackListReader = new BufferedReader(new FileReader("src/by/tms/lesson12/additionalTasks/task_3/blacklist.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("There is no such file!");
            blackListReader.close();
            return;
        }

        String[] blacklist = getBlackList(blackListReader);
        blackListReader.close();
        if (blacklist == null) {
            System.err.println("There is no blacklist file!");
            return;
        }

        checkCensure(sentences, blacklist);
    }

    public static String[] getSentences(BufferedReader reader) throws IOException {
        String line = reader.readLine(), text = "";
        while (line != null) {
            text += line;
            line = reader.readLine();
        }
        return text.split("[.!?]");
    }

    public static String[] getBlackList(BufferedReader reader) throws IOException {
        String line = reader.readLine(), text = "";
        while (line != null) {
            text += line;
            line = reader.readLine();
        }
        return text.split("[,]");
    }

    public static void checkCensure(String[] sentences, String[] blacklist) {
        List<String> unprintableSentences = new ArrayList<String>();
        boolean isPrintable = true;

        int countOfUnprintable = 0;
        for (String sentence : sentences) {
            for (String word : blacklist) {
                if (sentence.contains(word)) {
                    countOfUnprintable++;
                    unprintableSentences.add(sentence);
                    isPrintable = false;
                    break;
                }
            }
        }

        if (isPrintable) {
            System.out.println("Text passed censorship check.");
        } else {
            System.out.println("Text didn't pass censorship check.\n" +
                    "Look at the mistakes in " + countOfUnprintable + " sentences:");
            for (String sentence : unprintableSentences) {
                System.out.println(sentence.trim());
            }
        }
    }
}
