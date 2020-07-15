import java.util.Random;

public class Task_11 {
    /*
    Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а произведение, т.е. факториал числа.
     */
    public static void main(String[] args) {
        int number = (int) (Math.random() * 20);
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Number: " + number);
        System.out.println("Factorial: " + factorial);
    }
}
