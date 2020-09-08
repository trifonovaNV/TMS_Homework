package by.tms.lesson12.additionalTasks.task_2;

public class TextFormater {

    public static int countOfWords(String line) {
        String[] words = line.split("[ ,.;:?!]");
        return words.length;
    }

    public static boolean hasPalindrom(String line) {
        String[] words = line.split("[ ,.;:?!]");
        for (int i = 0; i < words.length; i++) {
            StringBuffer buffer = new StringBuffer(words[i]);
            buffer.reverse();
            String newWord = buffer.toString();
            if (words[i].equals(newWord)) {
                return true;
            }
        }
        return false;
    }
}
