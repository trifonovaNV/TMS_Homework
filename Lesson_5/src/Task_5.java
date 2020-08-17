import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_5 {
    /*
    Написать программу, выполняющую поиск в строке
     шестнадцатеричных чисел, записаных по правилам Java,
      с помощью регулярных выражений и вывести их на страницу.
     */
    public static void main(String[] args) {
        String str = "I like 0x4C5 regex 0XFF. It's 12 so 345 funny 0xx45. 00XFF Let's 0xa3 find 0x10I numbers!";
        System.out.println("Our string: " + str);
        Pattern pattern = Pattern.compile("\\b0[xX][0-9A-Fa-f]+\\b");
        Matcher matcher = pattern.matcher(str);
        System.out.print("Numbers: ");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
