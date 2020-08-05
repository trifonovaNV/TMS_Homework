import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_2 {
    /*
    Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно учесть, что слова могут
     разделяться несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine();
        scanner.close();
        int numberOfWords = 0;
        Pattern pattern = Pattern.compile("\\b[A-Za-z]+\\b");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            numberOfWords++;
        }
        System.out.println("There are " + numberOfWords + " words.");
    }
}
