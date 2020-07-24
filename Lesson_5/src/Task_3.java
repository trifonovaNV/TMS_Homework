import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_3 {
    /*
    Имеется строка с текстом. Вывести текст, составленный из последних букв всех слов.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine();
        scanner.close();
        String result = "";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            int position = matcher.end();
            if (position == 0) {
                result += str.charAt(0);
                continue;
            }
            result += str.charAt(position - 1);
        }
        System.out.println("Result: " + result);
    }
}
