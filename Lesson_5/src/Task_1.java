import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_1 {
    /*
    Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine();
        scanner.close();
        int numberOfPunctuation = 0;
        Pattern pattern = Pattern.compile("[.,;:?!]");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            numberOfPunctuation++;
        }
        System.out.println("There are " + numberOfPunctuation + " punctuation marks.");
    }
}
