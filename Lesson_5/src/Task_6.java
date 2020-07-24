import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_6 {
    /*
    Написать программу, выполняющую поиск в строке всех тегов абзацев,
    в т.ч. тех, у которых есть параметры, например <p id=”p1”>, и замену их на простые теги абзацев <p>.
     */
    public static void main(String[] args) {
        String str = " <p> some <p id=”p1”> interesting <p id=”p3”> information <p id=”p10”> ";
        System.out.println("Old string: " + str);
        System.out.println("New string: " + str.replaceAll("<p.*?>", "<p>"));
    }
}
