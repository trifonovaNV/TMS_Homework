package by.tms.Lesson_10.trainingManual;

import java.util.HashMap;
import java.util.Set;

public class Task_4 {
    /*
    Имеется текст. Следует составить для него частотный словарь.
   */
    public static void main(String[] args) {
        String text = "I've recently read a book which has made a very deep impression on me. It's called Gone with the" +
                " Wind and it makes really unforgettable reading. The author of the book is Margaret Mitchell. She was " +
                "born in Atlanta, Georgia, into a family of the president of the Atlanta Historical Society. All the family" +
                " were interested in American history and she grew up in an atmosphere of stories about the Civil War.\n" +
                "After graduating from college Margaret Mitchell worked for a time for the Atlanta Journal. In 1925 she got" +
                " married. In the following ten years she put on paper all the stories she had heard about the Civil War." +
                " The result was Gone with the Wind. It was first published in 1936 and became the talking point of all America." +
                " In 1939 it was made into a highly successful film. Vivien Leigh and Clark Gable played the leading roles." +
                " Vivien Leigh won the Oscar. Everyone loved her high-spirited and beautiful heroine, Scarlett O'Hara.\n" +
                "The story is set around the time of the American Civil War (1861-65) when the Southern States went to war " +
                "with the North to defend their way of life. It was a way of life in which rich gentry lived in large houses" +
                " and owned huge areas of land, cultivated by black slaves. Scarlett O'Hara was born into one of these rich houses.";

        HashMap<Character, Integer> dictionary = new HashMap<Character, Integer>();
        char[] textArray = text.toLowerCase().toCharArray();
        for (int i = 0; i < textArray.length; i++) {
            if (Character.isLetter(textArray[i])) {
                if (dictionary.containsKey(textArray[i])) {
                    int newValue = dictionary.get(textArray[i]) + 1;
                    dictionary.replace(textArray[i], newValue);
                } else {
                    dictionary.put(textArray[i], 1);
                }
            }
        }

        Set<Character> keys = dictionary.keySet();
        for (Character key : keys) {
            System.out.println(key + ": " + dictionary.get(key));
        }
    }
}
